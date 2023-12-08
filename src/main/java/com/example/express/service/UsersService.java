package com.example.express.service;

import com.example.express.domain.Users;

import java.util.List;

public interface UsersService {

    public List<Users> getUsers();

    public Users getUsersByAccount(String account);

    public void addUsers(String account, String password);

    public void updateUsers(String password, String account);

}
