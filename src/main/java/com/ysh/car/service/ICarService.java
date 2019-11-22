package com.ysh.car.service;

import com.ysh.car.service.pojo.Car;

import java.util.List;
import java.util.Map;

public interface ICarService {
    List<Car> findByCidService(Map<String, Object> condition);

    List<Car> findByIdService(int carId);
}
