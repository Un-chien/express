package com.example.express.service.impl;

import com.example.express.domain.Package;
import com.example.express.mapper.PackageMapper;
import com.example.express.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageMapper packageMapper;

    @Override
    public List<Package> getPackage() {
        return packageMapper.getPackage();
    }

    @Override
    public Package getPackageByNumber(String number) {
        return packageMapper.getPackageByNumber(number);
    }

    @Override
    public Package getPackageByPhone(String phone) {
        return packageMapper.getPackageByPhone(phone);
    }

    @Override
    public void updatePackage(String recv_name, String recv_phone, String recv_addr, String number) {
        packageMapper.updatePackage(recv_name,recv_phone,recv_addr,number);
    }

    @Override
    public void addPackage(Timestamp time,String send_account, Integer send_no, String recv_name, String recv_phone, String recv_addr) {
        packageMapper.addPackage(time,send_account,send_no,recv_name,recv_phone,recv_addr);
    }

}
