package com.ysh.order.service;

import com.ysh.order.service.pojo.MyOrder;
import com.ysh.order.service.pojo.Order;

import java.util.List;
import java.util.Map;

public interface IOrderService {
    int addService(Map<String, Object> condition);

    int deleteService(int orderId);

    List<MyOrder> listService(Map<String, Object> condition);
    int pageCountService(int userId);
}
