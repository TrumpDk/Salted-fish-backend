package com.salted_fish.fishing.Dto;

public class UserRegisterDto {

    private String userName;

    private String password;

    private String phone;

    public String getUserName() {
        return userName;
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

    public void setUserName(String userName) {
        this.userName = userName;
    }

}