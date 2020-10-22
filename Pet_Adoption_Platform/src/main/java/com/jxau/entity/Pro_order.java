package com.jxau.entity;

import java.util.Date;

public class Pro_order {
    private Integer id;
    private Integer pro_id;
    private String username;
    private Integer num;
    private String orderStatement;
    private Date date;

    public Pro_order() {
    }

    public Pro_order(Integer id, Integer pro_id, String username, Integer num, String orderStatement, Date date) {
        this.id = id;
        this.pro_id = pro_id;
        this.username = username;
        this.num = num;
        this.orderStatement = orderStatement;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pro_order{" +
                "id=" + id +
                ", pro_id=" + pro_id +
                ", username='" + username + '\'' +
                ", num=" + num +
                ", orderStatement='" + orderStatement + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOrderStatement() {
        return orderStatement;
    }

    public void setOrderStatement(String orderStatement) {
        this.orderStatement = orderStatement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
