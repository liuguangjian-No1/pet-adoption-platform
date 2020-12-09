package com.jxau.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
public class Answer {

    private int id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date answerTime;
    private String content;

    private Users user;
    private Answer answer;
    private Comment comment;


    public Answer() {
    }

    public Answer(int id, Date answerTime, String content, Users user, Answer answer, Comment comment) {
        this.id = id;
        this.answerTime = answerTime;
        this.content = content;
        this.user = user;
        this.answer = answer;
        this.comment = comment;
    }


}
