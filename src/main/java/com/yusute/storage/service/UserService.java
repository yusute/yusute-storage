package com.yusute.storage.service;

import com.yusute.storage.model.User;

/**
 * @author yusutehot
 */
public interface UserService {
    User loadUserById();
    int updateUser(User user);
}
