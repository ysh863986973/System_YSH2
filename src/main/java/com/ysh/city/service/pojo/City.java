package com.ysh.city.service.pojo;

public class City {
    private int cityId;
    private String cityName;
    private String cityPid;

    public City() {
    }

    public City(int cityId, String cityName, String cityPid) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cityPid = cityPid;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityPid() {
        return cityPid;
    }

    public void setCityPid(String cityPid) {
        this.cityPid = cityPid;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", cityPid='" + cityPid + '\'' +
                '}';
    }
}
