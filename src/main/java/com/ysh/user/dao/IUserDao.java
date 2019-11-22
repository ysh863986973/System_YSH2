package com.ysh.user.dao;

import com.ysh.user.service.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IUserDao {
    int signInDao(User user);

    int updateDao(User user);

    List<User> findByIdDao(int userId);

    List<User> findByEmailDao(String email);
}
