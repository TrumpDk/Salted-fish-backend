package com.salted_fish.fishing.Dto;

public class UserInfo {

    private String userName;

    private String avatar;

    public String getUserName() {
        return userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInfo(String userName, String avatar) {
        this.userName = userName;
        this.avatar = avatar;
    }
}