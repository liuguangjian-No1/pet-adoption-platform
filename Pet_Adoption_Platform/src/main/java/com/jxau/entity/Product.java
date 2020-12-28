package com.jxau.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String proName;
    private String proType;
    private double proPrice;
    private String proDesc;
    private Integer proNum;
    private String proPic;

/*    public Product(Integer id, String proName, String proType, double proPrice, String proDesc, Integer proNum, String proPic) {
        this.id = id;
        this.proName = proName;
        this.proType = proType;
        this.proPrice = proPrice;
        this.proDesc = proDesc;
        this.proNum = proNum;
        this.proPic = proPic;
    }
    public Product() {
    }*/
}
