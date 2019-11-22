package com.ysh.order.service;

import com.ysh.order.dao.IOrderDao;
import com.ysh.order.service.pojo.MyOrder;
import com.ysh.order.service.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderDao orderDao;

    @Override
    @Transactional
    public int addService(Map<String, Object> condition) {
        return orderDao.addDao(condition);
    }

    @Override
    @Transactional
    public int deleteService(int orderId) {
        return orderDao.deleteDao(orderId);
    }

    @Override
    public List<MyOrder> listService(Map<String, Object> condition) {
        return orderDao.listDao(condition);
    }
    @Override
    public int pageCountService(int userId) {
        return orderDao.pageCountDao(userId);
    }
}
