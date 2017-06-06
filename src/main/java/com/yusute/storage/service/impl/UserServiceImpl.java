package com.yusute.storage.service.impl;

import com.yusute.storage.dao.UserMapper;
import com.yusute.storage.model.User;
import com.yusute.storage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yusutehot
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User loadUserById() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateUser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
