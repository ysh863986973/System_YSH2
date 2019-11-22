package com.ysh.sys.temppojo;

import com.ysh.car.service.pojo.Car;
import com.ysh.city.service.pojo.City;
import com.ysh.order.service.pojo.MyOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Temp {
    private List<Car> cars;
    private String condition;
    private String size;
    private City getCity;
    private City backCity;
    private List<MyOrder> myOrders;


    public Temp() {
    }

    public Temp(List<Car> cars, String condition, String size, City getCity, City backCity, List<MyOrder> myOrders) {
        this.cars = cars;
        this.condition = condition;
        this.size = size;
        this.getCity = getCity;
        this.backCity = backCity;
        this.myOrders = myOrders;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public City getGetCity() {
        return getCity;
    }

    public void setGetCity(City getCity) {
        this.getCity = getCity;
    }

    public City getBackCity() {
        return backCity;
    }

    public void setBackCity(City backCity) {
        this.backCity = backCity;
    }

    public List<MyOrder> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(List<MyOrder> myOrders) {
        this.myOrders = myOrders;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "cars=" + cars +
                ", condition='" + condition + '\'' +
                ", size='" + size + '\'' +
                ", getCity=" + getCity +
                ", backCity=" + backCity +
                ", myOrders=" + myOrders +
                '}';
    }
}
