package com.xk.spring5.dao.impl;

import com.xk.spring5.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("dao update");
    }
}
