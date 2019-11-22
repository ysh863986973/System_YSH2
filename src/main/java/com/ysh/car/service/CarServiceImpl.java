package com.ysh.car.service;

import com.ysh.car.dao.ICarDao;
import com.ysh.car.service.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    private ICarDao carDao;

    @Override
    public List<Car> findByCidService(Map<String, Object> condition) {
        return carDao.findByCidDao(condition);
    }

    @Override
    public List<Car> findByIdService(int carId) {
        return carDao.findByIdDao(carId);
    }
}
