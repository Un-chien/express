package com.example.express.domain;

import java.sql.Timestamp;

public class Package {

    private String number;
    private String status;
    private String pickcode;
    private String type;
    private Integer amount;
    private Timestamp time;
    private String send_account;
    private Integer send_no;
    private String recv_name;
    private String recv_phone;
    private String recv_addr;
    private String location;

    private String name;
    private String phone;
    private String address;

    public Package() {
    }

    public Package(String number, String status, String pickcode, String type, Integer amount, Timestamp time, String send_account, Integer send_no, String recv_name, String recv_phone, String recv_addr, String location, String name, String phone, String address) {
        this.number = number;
        this.status = status;
        this.pickcode = pickcode;
        this.type = type;
        this.amount = amount;
        this.time = time;
        this.send_account = send_account;
        this.send_no = send_no;
        this.recv_name = recv_name;
        this.recv_phone = recv_phone;
        this.recv_addr = recv_addr;
        this.location = location;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPickcode() {
        return pickcode;
    }

    public void setPickcode(String pickcode) {
        this.pickcode = pickcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getSend_account() {
        return send_account;
    }

    public void setSend_account(String send_account) {
        this.send_account = send_account;
    }

    public Integer getSend_no() {
        return send_no;
    }

    public void setSend_no(Integer send_no) {
        this.send_no = send_no;
    }

    public String getRecv_name() {
        return recv_name;
    }

    public void setRecv_name(String recv_name) {
        this.recv_name = recv_name;
    }

    public String getRecv_phone() {
        return recv_phone;
    }

    public void setRecv_phone(String recv_phone) {
        this.recv_phone = recv_phone;
    }

    public String getRecv_addr() {
        return recv_addr;
    }

    public void setRecv_addr(String recv_addr) {
        this.recv_addr = recv_addr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
