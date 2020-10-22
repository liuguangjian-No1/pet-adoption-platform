package com.jxau.entity;

public class Product {
    private Integer id;
    private String proName;
    private String proType;
    private double proPrice;
    private String proDesc;
    private Integer proNum;
    private String proPic;

    public Product(Integer id, String proName, String proType, double proPrice, String proDesc, Integer proNum, String proPic) {
        this.id = id;
        this.proName = proName;
        this.proType = proType;
        this.proPrice = proPrice;
        this.proDesc = proDesc;
        this.proNum = proNum;
        this.proPic = proPic;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                ", proType='" + proType + '\'' +
                ", proPrice=" + proPrice +
                ", proDesc='" + proDesc + '\'' +
                ", proNum=" + proNum +
                ", proPic='" + proPic + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public String getProPic() {
        return proPic;
    }

    public void setProPic(String proPic) {
        this.proPic = proPic;
    }
}
