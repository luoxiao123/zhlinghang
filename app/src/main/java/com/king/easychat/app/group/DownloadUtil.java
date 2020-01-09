package com.king.easychat.app.group;

import android.app.Activity;
import android.os.Environment;
import android.text.TextUtils;

import com.vector.update_app.UpdateAppBean;
import com.vector.update_app.UpdateAppManager;
import com.vector.update_app.UpdateDialogFragment;
import com.vector.update_app.service.DownloadService;
import com.vector.update_app.utils.AppUpdateUtils;

import java.io.File;

/**
 * Created by luoxiao on 2020/1/9.
 */
public class DownloadUtil {


    /**
     *
     * {
     *   "update": "Yes",
     *   "new_version": "1.1",
     *   "apk_file_url": "https://raw.githubusercontent.com/WVector/AppUpdateDemo/master/apk/sample-debug.apk",
     *   "update_log": "1，添加删除信用卡接口。\r\n2，添加vip认证。\r\n3，区分自定义消费，一个小时不限制。\r\n4，添加放弃任务接口，小时内不生成。\r\n5，消费任务手动生成。",
     *   "target_size": "5M",
     *   "new_md5":"b97bea014531123f94c3ba7b7afbaad2",
     *   "constraint": true
     * }
     * @param
     */

    public void onlyDownload(Activity activity,String url) {

        UpdateAppBean updateAppBean = new UpdateAppBean();

        //设置 apk 的下载地址
        updateAppBean.setApkFileUrl(url);

        String path = "";
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) || !Environment.isExternalStorageRemovable()) {
            try {
                path = activity.getExternalCacheDir().getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (TextUtils.isEmpty(path)) {
                path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            }
        } else {
            path =activity.getCacheDir().getAbsolutePath();
        }

        //设置apk 的保存路径
        updateAppBean.setTargetPath(path);
        //实现网络接口，只实现下载就可以
        updateAppBean.setHttpManager(new UpdateAppHttpUtil());

        UpdateAppManager.download(activity, updateAppBean, new DownloadService.DownloadCallback() {
            @Override
            public void onStart() {
                HProgressDialogUtils.showHorizontalProgressDialog(activity, "下载进度", false);

            }

            @Override
            public void onProgress(float progress, long totalSize) {
                HProgressDialogUtils.setProgress(Math.round(progress * 100));


            }

            @Override
            public void setMax(long totalSize) {

            }

            @Override
            public boolean onFinish(File file) {
                HProgressDialogUtils.cancel();
                AppUpdateUtils.installApp(activity, file);
                return true;
            }

            @Override
            public void onError(String msg) {
                HProgressDialogUtils.cancel();

            }

            @Override
            public boolean onInstallAppAndAppOnForeground(File file) {

                return false;
            }
        });
    }
}
