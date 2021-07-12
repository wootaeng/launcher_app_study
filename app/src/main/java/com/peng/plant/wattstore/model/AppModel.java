package com.peng.plant.wattstore.model;

public class AppModel {

    private String appName;
    private String appIcon;

    public AppModel(String appName, String appIcon) {
        this.appName = appName;
        this.appIcon = appIcon;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }
}
