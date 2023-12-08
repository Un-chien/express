package com.example.express.service;

import com.example.express.domain.Address;
import com.example.express.domain.Package;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AddressService {

    public List<Address> getAddress(String account);

    public Address getAddressByNumber(Integer no, String account);

    public void updateAddress(String name, String phone, String address, Integer no, String account);

    public void addAddress(String name, String phone, String address, Integer no, String account);

}
