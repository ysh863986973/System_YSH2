package com.ysh.order.dao;

import com.ysh.order.service.pojo.MyOrder;
import com.ysh.order.service.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IOrderDao {
    int addDao(Map<String, Object> condition);

    int deleteDao(int orderId);

    List<MyOrder> listDao(Map<String, Object> condition);

    int pageCountDao(int userId);
}
