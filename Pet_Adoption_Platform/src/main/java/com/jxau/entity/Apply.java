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
public class Apply {

    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private String telephone;
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTime;
    private int state;

/*    public Apply() {
    }

    public Apply(Integer id, String name, String email, Integer age, String telephone, String message, Date applyTime, int state) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.telephone = telephone;
        this.message = message;
        this.applyTime = applyTime;
        this.state = state;
    }*/
}
