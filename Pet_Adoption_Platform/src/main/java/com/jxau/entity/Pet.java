package com.jxau.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString
public class Pet {

    private Integer id;
    private String petName;
    private String petType;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String pic;
    private Integer state;
    private String remark;

    private List<AdoptAnimal> adoptAnimalList=new ArrayList<>();

    private List<Comment> commentList=new ArrayList<>();


    public Pet() {
    }

    public Pet(Integer id, String petName, String petType, String sex, Date birthday, String pic, Integer state, String remark, List<AdoptAnimal> adoptAnimal, List<Comment> commentList) {
        this.id = id;
        this.petName = petName;
        this.petType = petType;
        this.sex = sex;
        this.birthday = birthday;
        this.pic = pic;
        this.state = state;
        this.remark = remark;
        this.adoptAnimalList = adoptAnimal;
        this.commentList = commentList;
    }
}
