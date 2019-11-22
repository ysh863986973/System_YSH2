package com.ysh.city.service;

import com.ysh.city.service.pojo.City;

import java.util.List;

public interface ICityService {
    City findByIdService(int cityId);

    List<City> findByPidService(int cityPid);

    List<City> listService();
}
