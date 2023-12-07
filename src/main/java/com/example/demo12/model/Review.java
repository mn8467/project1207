package com.example.demo12.model;

import lombok.Data;

import java.util.Date;

@Data
public class Review {
    private String user_Id;
    private String title;
    private int course_No;
    private int review_No;
    private Date drawup;
    private int reference_No;
    private int recommend;
}
