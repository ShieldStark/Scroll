package com.example.cardscroll.model;

public class Card {

    private String appName;
    private String appId;
    private String appVersion;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Card(String appName, String appId, String appVersion){
        this.appName=appName;
        this.appId=appId;
        this.appVersion=appVersion;
    }
}
