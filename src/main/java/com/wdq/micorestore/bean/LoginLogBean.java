package com.wdq.micorestore.bean;

//`id` int(64) NOT NULL AUTO_INCREMENT,
//        `uid` int(64) NOT NULL,
//        `data` varchar(255) NOT NULL,
//        `drviceNum` varchar(255) NOT NULL,
//        `drviceType` varchar(255) NOT NULL,
//        `appVersion` varchar(255) NOT NULL,
public class LoginLogBean {
    private int id;
    private String uid;
    private String data;
    private String drviceNum;
    private String drviceType;
    private String appVersion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDrviceNum() {
        return drviceNum;
    }

    public void setDrviceNum(String drviceNum) {
        this.drviceNum = drviceNum;
    }

    public String getDrviceType() {
        return drviceType;
    }

    public void setDrviceType(String drviceType) {
        this.drviceType = drviceType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
