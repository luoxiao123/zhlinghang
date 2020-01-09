package com.king.easychat.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luoxiao on 2020/1/9.
 */
public class UpdApp {


    /**
     * result : true
     * resultDesc : 操作成功
     * switch : 1
     * url : http://www.baidu.com
     */

    private boolean result;
    private String resultDesc;
    @SerializedName("switch")
    private int switchX;
    private String url;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public int getSwitchX() {
        return switchX;
    }

    public void setSwitchX(int switchX) {
        this.switchX = switchX;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
