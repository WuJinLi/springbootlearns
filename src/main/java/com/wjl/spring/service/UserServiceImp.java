package com.wjl.spring.service;

import com.wjl.spring.dao.IUserDao;
import com.wjl.spring.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements IUserService {


    @Resource
    private IUserDao userDao;

    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}
