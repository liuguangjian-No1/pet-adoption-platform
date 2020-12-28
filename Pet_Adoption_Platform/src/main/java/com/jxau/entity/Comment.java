package com.jxau.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date commentTime;
    private String content;

    private Users user;
    private Admin admin;
    private Pet pet;
    private List<Answer> answer;

/*    public Comment() {
    }

    public Comment(Integer id, Date commentTime, String content, Users user, Admin admin, Pet pet, List<Answer> answer) {
        this.id = id;
        this.commentTime = commentTime;
        this.content = content;
        this.user = user;
        this.admin = admin;
        this.pet = pet;
        this.answer = answer;
    }*/
}
