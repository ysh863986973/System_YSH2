package com.ysh.city.service;

import com.ysh.city.dao.ICityDao;
import com.ysh.city.service.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private ICityDao cityDao;

    @Override
    public City findByIdService(int cityId) {
        return cityDao.findByIdDao(cityId);
    }

    @Override
    public List<City> findByPidService(int cityPid) {
        return cityDao.findByPidDao(cityPid);
    }

    @Override
    public List<City> listService() {
        return cityDao.listDao();
    }
}
