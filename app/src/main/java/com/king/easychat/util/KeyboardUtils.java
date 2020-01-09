package com.king.easychat.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;

/**
 * 软键盘监听
 */
public final class KeyboardUtils {

    private static int sDecorViewInvisibleHeightPre;
    private static ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private static OnSoftInputChangedListener onSoftInputChangedListener;
    private static int sDecorViewDelta = 0;

    private KeyboardUtils() {
        throw new UnsupportedOperationException("");
    }

    /**
     * 注册软键盘监听
     */
    public static void registerSoftInputChangedListener(final Activity activity, final OnSoftInputChangedListener listener) {
        final int flags = activity.getWindow().getAttributes().flags;
        if ((flags & WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS) != 0) {
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        final FrameLayout contentView = activity.findViewById(android.R.id.content);
        sDecorViewInvisibleHeightPre = getDecorViewInvisibleHeight(activity);
        onSoftInputChangedListener = listener;
        onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (onSoftInputChangedListener != null) {
                    int height = getDecorViewInvisibleHeight(activity);
                    if (sDecorViewInvisibleHeightPre != height) {
                        onSoftInputChangedListener.onSoftInputChanged(height);
                        sDecorViewInvisibleHeightPre = height;
                    }
                }
            }
        };
        contentView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /**
     * 取消软键盘监听
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static void unregisterSoftInputChangedListener(final Activity activity) {
        final View contentView = activity.findViewById(android.R.id.content);
        contentView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        onSoftInputChangedListener = null;
        onGlobalLayoutListener = null;
    }

    private static int getDecorViewInvisibleHeight(final Activity activity) {
        final View decorView = activity.getWindow().getDecorView();
        if (decorView == null) return sDecorViewInvisibleHeightPre;
        final Rect outRect = new Rect();
        decorView.getWindowVisibleDisplayFrame(outRect);
        int delta = Math.abs(decorView.getBottom() - outRect.bottom);
        if (delta <= getNavBarHeight()) {
            sDecorViewDelta = delta;
            return 0;
        }
        return delta - sDecorViewDelta;
    }

    private static int getNavBarHeight() {
        Resources res = Resources.getSystem();
        int resourceId = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId != 0) {
            return res.getDimensionPixelSize(resourceId);
        } else {
            return 0;
        }
    }


    public interface OnSoftInputChangedListener {
        // 如果软键盘是关闭状态，height为0，软键盘弹出状态，height为软键盘高度
        void onSoftInputChanged(int height);
    }
}