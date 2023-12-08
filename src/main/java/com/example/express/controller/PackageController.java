package com.example.express.controller;

import com.example.express.domain.Package;
import com.example.express.service.PackageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class PackageController {

    @Resource
    private PackageService packageService;

    @RequestMapping("getpackage")
    public List<Package> getPackage() {
        return packageService.getPackage();
    }

    @RequestMapping("getpackagebynumber")
    public Package getPackageByNumber(String number) {
        return packageService.getPackageByNumber(number);
    }

    @RequestMapping("getpackagebyphone")
    public Package getPackageByPhone(String phone) {
        return packageService.getPackageByPhone(phone);
    }

    @CrossOrigin
    @RequestMapping("updaterecv")
    public void updatePackage(String recv_name, String recv_phone, String recv_addr, String number) {
        packageService.updatePackage(recv_name,recv_phone,recv_addr,number);
    }

    @CrossOrigin
    @RequestMapping("addpackage")
    public void addPackage(String send_account, Integer send_no, String recv_name, String recv_phone, String recv_addr) throws ParseException {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sdate=format2.format(date);

        Timestamp time = Timestamp.valueOf(sdate);
        packageService.addPackage(time,send_account,send_no,recv_name,recv_phone,recv_addr);
    }

}
