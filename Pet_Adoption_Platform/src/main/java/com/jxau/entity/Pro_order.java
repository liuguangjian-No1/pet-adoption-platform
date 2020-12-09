package com.jxau.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
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
}
