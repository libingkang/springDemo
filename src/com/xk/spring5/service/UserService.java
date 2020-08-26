package com.xk.spring5.service;

import com.xk.spring5.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(){

        userDao.update();
    }
}
