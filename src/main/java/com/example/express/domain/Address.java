package com.example.express.domain;

public class Address {

    private String account;
    private Integer no;
    private String name;
    private String phone;
    private String address;

    public Address() {
    }

    public Address(String account, Integer no, String name, String phone, String address) {
        this.account = account;
        this.no = no;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
