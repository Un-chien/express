package com.example.express.controller;

import com.example.express.domain.Address;
import com.example.express.domain.Package;
import com.example.express.service.AddressService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class AddressController {

    @Resource
    private AddressService addressService;

    @RequestMapping("getaddress")
    public List<Address> getAddress(String account) {
        return addressService.getAddress(account);
    }

    @RequestMapping("getaddressbynumber")
    public Address getAddressByNumber(Integer no, String account) {
        return addressService.getAddressByNumber(no,account);
    }

    @CrossOrigin
    @RequestMapping("updateaddress")
    public void updateAddress(String name, String phone, String address, Integer no, String account) {
        addressService.updateAddress(name,phone,address,no,account);
    }

    @CrossOrigin
    @RequestMapping("addaddress")
    public void addAddress(String name, String phone, String address, Integer no, String account) {
        addressService.addAddress(name,phone,address,no,account);
    }

}
