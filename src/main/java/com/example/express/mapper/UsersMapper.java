package com.example.express.mapper;

import com.example.express.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> getUsers();

    @Select("select * from users where account=#{account}")
    Users getUsersByAccount(String account);

    @Insert("insert into users(account,password) values(#{account},#{password})")
    void addUsers(String account, String password);

    @Update({"update users set password = #{password} where account = #{account}"})
    void updateUsers(String password, String account);

}