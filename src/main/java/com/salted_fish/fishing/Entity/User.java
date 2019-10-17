package com.salted_fish.fishing.Entity;

import java.sql.Date;

public class User {

    private Integer userId;

    private String userName;

    private String password;

    private String phone;

    private String avatar;

    private String token;

    private Date expireTime;

    public User() {}

    public User(Integer userId, String userName, String password, String phone, String avatar, String token, Date expireTime) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.avatar = avatar;
        this.token = token;
        this.expireTime = expireTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}