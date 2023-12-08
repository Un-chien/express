package com.example.express.mapper;

import com.example.express.domain.Package;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface PackageMapper {

    @Select("select * from v_a_p")
    List<Package> getPackage();

    @Select("select * from v_a_p where number=#{number}")
    Package getPackageByNumber(String number);

    @Select("select * from v_a_p where phone=#{phone}")
    Package getPackageByPhone(String phone);

    @Update({"update package set recv_name = #{recv_name},recv_phone = #{recv_phone},recv_addr = #{recv_addr} where number = #{number}"})
    void updatePackage(String recv_name, String recv_phone, String recv_addr, String number);

    @Insert("insert into package(time,send_account,send_no,recv_name,recv_phone,recv_addr) values(#{time},#{send_account},#{send_no},#{recv_name},#{recv_phone},#{recv_addr})")
    void addPackage(Timestamp time, String send_account, Integer send_no, String recv_name, String recv_phone, String recv_addr);
}
