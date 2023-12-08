package com.example.express.mapper;

import com.example.express.domain.Address;
import com.example.express.domain.Package;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface AddressMapper {

    @Select("select * from address where account=#{account}")
    List<Address> getAddress(String account);

    @Select("select * from address where no=#{no} and account=#{account}")
    Address getAddressByNumber(Integer no, String account);

    @Update({"update address set name = #{name},phone = #{phone},address = #{address} where no = #{no} and account=#{account}"})
    void updateAddress(String name, String phone, String address, Integer no, String account);

    @Insert("insert into address(name,phone,address,no,account) values(#{name},#{phone},#{address},#{no},#{account})")
    void addAddress(String name, String phone, String address, Integer no, String account);
}
