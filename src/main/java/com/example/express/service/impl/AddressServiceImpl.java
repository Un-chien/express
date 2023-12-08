package com.example.express.service.impl;

import com.example.express.domain.Address;
import com.example.express.domain.Package;
import com.example.express.mapper.AddressMapper;
import com.example.express.mapper.PackageMapper;
import com.example.express.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getAddress(String account) {
        return addressMapper.getAddress(account);
    }

    @Override
    public Address getAddressByNumber(Integer no, String account) {
        return addressMapper.getAddressByNumber(no,account);
    }

    @Override
    public void updateAddress(String name, String phone, String address, Integer no, String account) {
        addressMapper.updateAddress(name,phone,address,no,account);
    }

    @Override
    public void addAddress(String name, String phone, String address, Integer no, String account) {
        addressMapper.addAddress(name,phone,address,no,account);
    }
}
