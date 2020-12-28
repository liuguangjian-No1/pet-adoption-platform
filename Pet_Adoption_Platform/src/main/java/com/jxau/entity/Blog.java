package com.jxau.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date actionTime;
    private String address;
    private String peoples;
    private String event;
    private String title;

/*    public Blog() {
    }

    public Blog(Integer id, Date actionTime, String address, String peoples, String event, String title) {
        this.id = id;
        this.actionTime = actionTime;
        this.address = address;
        this.peoples = peoples;
        this.event = event;
        this.title = title;
    }*/
}
