package com.ysh.order.service.pojo;

public class Order {
    private int orderId;
    private int cId;
    private int uId;
    private int getId;
    private int backId;
    private double oprice;
    private String status;

    public Order() {
    }

    public Order(int orderId, int cId, int uId, int getId, int backId, double oprice, String status) {
        this.orderId = orderId;
        this.cId = cId;
        this.uId = uId;
        this.getId = getId;
        this.backId = backId;
        this.oprice = oprice;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }

    public int getBackId() {
        return backId;
    }

    public void setBackId(int backId) {
        this.backId = backId;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", cId=" + cId +
                ", uId=" + uId +
                ", getId=" + getId +
                ", backId=" + backId +
                ", oprice=" + oprice +
                ", status='" + status + '\'' +
                '}';
    }
}
