package com.example.express.controller;

import com.example.express.domain.Users;
import com.example.express.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin//处理跨域请求
public class UsersController {

    //    @Autowired
    @Resource
    private UsersService usersService;

    @RequestMapping("getusers")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @RequestMapping("getusersbyaccount")
    public Users getUsersByAccount(String account) {
        return usersService.getUsersByAccount(account);
    }

    @RequestMapping("addusers")
    @ResponseBody
    public void addUsers(String account, String password) {
        usersService.addUsers(account,password);
    }

    @RequestMapping("updateusers")
    @ResponseBody
    public void updateUsers(String password, String account) {
        usersService.updateUsers(password,account);
    }
}
