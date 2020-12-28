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
public class AdoptAnimal {

    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date adoptTime;
    private Integer state;

    private Pet pet;
    private Users user;

/*    public AdoptAnimal() {
    }

    public AdoptAnimal(Date adoptTime, Integer state, Pet pet, Users user) {
        this.adoptTime = adoptTime;
        this.state = state;
        this.pet = pet;
        this.user = user;
    }

    public AdoptAnimal(Date adoptTime, Integer state) {
        this.adoptTime = adoptTime;
        this.state = state;
    }

    public AdoptAnimal(Integer id, Date adoptTime, Integer state, Pet pet, Users user) {
        this.id = id;
        this.adoptTime = adoptTime;
        this.state = state;
        this.pet = pet;
        this.user = user;
    }*/


}
