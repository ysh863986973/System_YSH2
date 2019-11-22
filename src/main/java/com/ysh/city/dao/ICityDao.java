package com.ysh.city.dao;

import com.ysh.city.service.pojo.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityDao {
    City findByIdDao(int cityId);

    List<City> findByPidDao(int cityPid);

    List<City> listDao();
}
