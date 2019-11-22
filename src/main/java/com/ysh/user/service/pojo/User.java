package com.ysh.user.service.pojo;

public class User {
    private int userId;
    private String email;
    private String password;
    private String captcha;

    public User() {
    }

    public User(int userId, String email, String password, String captcha) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.captcha = captcha;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", captcha='" + captcha + '\'' +
                '}';
    }
}
