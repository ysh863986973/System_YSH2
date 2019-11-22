package com.ysh.user.service;

import com.ysh.user.service.pojo.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    int signInService(User user);

    int updateService(User user);

    List<User> findByIdService(int userId);

    List<User> findByEmailDao(String email);


//    boolean emailservice(User user);
}
