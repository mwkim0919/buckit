package com.mwkim0919.services;

import com.mwkim0919.models.User;

/**
 * Created by Minwoo on 2017-07-16.
 */
public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
