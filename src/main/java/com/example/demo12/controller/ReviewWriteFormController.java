package com.example.demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewWriteFormController {
    @RequestMapping("/Review/reviewWriteForm")
    public String ReviewWriteFormController() throws Exception {

        return"reviewWriteForm";
    }
}
