package com.ysh.car.dao;

import com.ysh.car.service.pojo.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ICarDao {
    List<Car> findByCidDao(Map<String, Object> condition);

    List<Car> findByIdDao(int carId);
}
