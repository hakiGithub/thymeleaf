package com.haki.thymeleaf.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;



@Builder
@Data
public class Author implements Serializable {

    private String name;

    private Integer age;

    private String email;




}
