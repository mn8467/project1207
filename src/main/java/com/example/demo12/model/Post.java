package com.example.demo12.model;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private String user_Id;
    private String title;
    private String content;
    private Date drawup;
    private int reference_No;
    private int board_No;
}
