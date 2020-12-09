package com.jxau.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class Admin {
    private Integer id;
    private String adminName;
    private String adminPwd;
    private String realName;
    private String telephone;
    private String Email;
    /*@JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")*/
    private String birthday;
    private String sex;
    private String pic;
    private String remark;

    List<Comment> commentList;

    public Admin() {
    }


    public Admin(Integer id, String adminName, String adminPwd, String realName, String telephone, String email, String birthday, String sex, String pic, String remark, List<Comment> commentList) {
        this.id = id;
        this.adminName = adminName;
        this.adminPwd = adminPwd;
        this.realName = realName;
        this.telephone = telephone;
        Email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.pic = pic;
        this.remark = remark;
        this.commentList = commentList;
    }

}
