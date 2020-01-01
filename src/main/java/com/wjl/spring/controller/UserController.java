package com.wjl.spring.controller;


import com.wjl.spring.model.User;
import com.wjl.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @PostMapping("/selectuser")
    public User selectById(@RequestBody Map<String, String> map) throws Exception {
        User user = service.selectById(Integer.parseInt(map.get("id")));
        if (user != null) {
            return user;
        }
        throw new Exception("查询数据为空");
    }


    @PostMapping("/add")
    public int insertUser(@RequestBody User user) {
        return service.insertUser(user);
    }


    @PostMapping("/selectAll")
    public List<User> insertUser() {
        return service.selectAll();
    }


    @PostMapping("/deleteUserById")
    public int deleteUserById(@RequestBody Map<String, String> map) {
        return service.deleteUserById(Integer.parseInt(map.get("id")));
    }


    @PostMapping("/update")
    public int updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

}
