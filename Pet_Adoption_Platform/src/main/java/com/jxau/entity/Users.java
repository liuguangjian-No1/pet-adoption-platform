package com.jxau.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author 那年
 */
@Data
@ToString
public class Users {

    private Integer id;
    private String userName;
    private String password;
    private String sex;
    private Integer age;
    private String telephone;
    private String Email;
    private String address;
    private String pic;
    private Integer state=0;

    List<Comment> commentList;
    List<AdoptAnimal> animalList;

    public Users() {}

    public Users(Integer id, String userName, String password, String sex, Integer age,
                 String telephone, String email, String address, String pic,
                 Integer state, List<Comment> commentList, List<AdoptAnimal> animalList) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
        Email = email;
        this.address = address;
        this.pic = pic;
        this.state = state;
        this.commentList = commentList;
        this.animalList = animalList;
    }
}
