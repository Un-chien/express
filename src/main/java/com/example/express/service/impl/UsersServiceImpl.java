package com.example.express.service.impl;

import com.example.express.domain.Users;
import com.example.express.mapper.UsersMapper;
import com.example.express.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {


    @Autowired  //依赖注入
    private UsersMapper usersMapper;

    @Override
    public List<Users> getUsers() {
        return usersMapper.getUsers();
    }

    @Override
    public Users getUsersByAccount(String account) {
        return usersMapper.getUsersByAccount(account);
    }

    @Override
    public void addUsers(String account, String password) {
        usersMapper.addUsers(account,password);
    }

    @Override
    public void updateUsers(String password, String account) {
        usersMapper.updateUsers(password, account);
    }


}
