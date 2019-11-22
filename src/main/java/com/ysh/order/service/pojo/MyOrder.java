package com.ysh.order.service.pojo;

public class MyOrder {
   /* oid" column=
    ty="oprice"
    ty="cname" c
            ty="getcity"
    ty="backcity
    ty="ostatus"*/

    private int oid;
    private double oprice;
    private String cname;
    private String getcity;
    private String backcity;
    private String ostatus;

    public MyOrder() {
    }

    public MyOrder(int oid, double oprice, String cname, String getcity, String backcity, String ostatus) {
        this.oid = oid;
        this.oprice = oprice;
        this.cname = cname;
        this.getcity = getcity;
        this.backcity = backcity;
        this.ostatus = ostatus;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getGetcity() {
        return getcity;
    }

    public void setGetcity(String getcity) {
        this.getcity = getcity;
    }

    public String getBackcity() {
        return backcity;
    }

    public void setBackcity(String backcity) {
        this.backcity = backcity;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "oid=" + oid +
                ", oprice=" + oprice +
                ", cname='" + cname + '\'' +
                ", getcity='" + getcity + '\'' +
                ", backcity='" + backcity + '\'' +
                ", ostatus='" + ostatus + '\'' +
                '}';
    }
}
