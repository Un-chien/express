package com.example.express.domain;

public class Users {
    private String account;
    private String password;
    private Integer power;

    public Users() {
    }

    public Users(String account, String password, Integer power) {
        this.account = account;
        this.password = password;
        this.power = power;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
