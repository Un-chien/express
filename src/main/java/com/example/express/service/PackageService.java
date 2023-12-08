package com.example.express.service;

import com.example.express.domain.Package;

import java.sql.Timestamp;
import java.util.List;

public interface PackageService {

    public List<Package> getPackage();

    public Package getPackageByNumber(String number);

    public Package getPackageByPhone(String phone);

    public void updatePackage(String recv_name, String recv_phone, String recv_addr, String number);

    public void addPackage(Timestamp time, String send_account, Integer send_no, String recv_name, String recv_phone, String recv_addr);
}
