package com.example.demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BoardWriteFormController {
    @RequestMapping("/comunity/boardWriteForm")
    public String BoardWriteFormController() throws Exception {

        return"boardWriteForm_Comunity";
    }
}
