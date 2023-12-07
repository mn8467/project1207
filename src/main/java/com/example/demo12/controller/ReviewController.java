package com.example.demo12.controller;

import com.example.demo12.mapper.ReviewMapper;
import com.example.demo12.model.Post;
import com.example.demo12.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    ReviewMapper reviewMapper;

    @RequestMapping("/Review/")
    public String Review(Model model) {
        List<Review> Review = reviewMapper.getReview();

        model.addAttribute("Reviews1", Review);
        return "Review";






















    }
}
