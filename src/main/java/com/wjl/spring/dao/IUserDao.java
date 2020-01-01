package com.wjl.spring.dao;

import com.wjl.spring.model.User;

import java.util.List;

public interface IUserDao {
    User selectById(Integer id);
    int insertUser(User user);
    List<User> selectAll();
    int deleteUserById(int id);
    int updateUser(User user);
}
