package com.ysh.car.service.pojo;

public class Car {
    private int carId;
    private int carCid;
    private String carName;
    private String carType;
    private int carSeating;
    private double carPrice;
    private int carNumber;
    private String carPicture;

    public Car() {
    }

    public Car(int carId, int carCid, String carName, String carType, int carSeating, double carPrice, int carNumber, String carPicture) {
        this.carId = carId;
        this.carCid = carCid;
        this.carName = carName;
        this.carType = carType;
        this.carSeating = carSeating;
        this.carPrice = carPrice;
        this.carNumber = carNumber;
        this.carPicture = carPicture;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCarCid() {
        return carCid;
    }

    public void setCarCid(int carCid) {
        this.carCid = carCid;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarSeating() {
        return carSeating;
    }

    public void setCarSeating(int carSeating) {
        this.carSeating = carSeating;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarPicture() {
        return carPicture;
    }

    public void setCarPicture(String carPicture) {
        this.carPicture = carPicture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carCid=" + carCid +
                ", carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                ", carSeating=" + carSeating +
                ", carPrice=" + carPrice +
                ", carNumber=" + carNumber +
                ", carPicture='" + carPicture + '\'' +
                '}';
    }
}
