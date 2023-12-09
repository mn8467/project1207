package com.example.demo12.controller;

import com.example.demo12.mapper.ReviewMapper;
import com.example.demo12.model.Post;
import com.example.demo12.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ReviewController {

    @Autowired
    ReviewMapper reviewMapper;

    @RequestMapping("/review")
    public String Review(Model model) {
        List<Review> review = reviewMapper.getReview();

        model.addAttribute("reviews",review);
        return "review/review";
    }

    @RequestMapping("/review/new")
    public String ReviewWriteFormController() throws Exception {

        return "review/new";
    }

    @RequestMapping("/review/detail/{reviewNo}")
    public String detail(@PathVariable("reviewNo") int reviewNo, Model model) throws Exception {
        Review review1 = new Review();
        review1.setReviewNo(reviewNo);
        Review review = reviewMapper.getReviewByReviewNo(review1);

        model.addAttribute("review", review);

        return "review/detail";
    }

    @RequestMapping("/review/edit/{reviewNo}")
    public String edit(@PathVariable("reviewNo") int reviewNo, Model model) throws Exception {
        Review review1 = new Review();
        review1.setReviewNo(reviewNo);
        Review review = reviewMapper.getReviewByReviewNo(review1);

        model.addAttribute("review", review);

        return "review/edit";
    }

    @RequestMapping(value = "/review/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(@RequestBody Review review) {
        reviewMapper.insertReview(review);

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("result", "ok");

        return resultMap;
    }

    @RequestMapping(value = "/review/editDetail", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> editDetail(@RequestBody Review review) {
        reviewMapper.updateReviewByReviewId(review);

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("result", "ok");

        return resultMap;
    }

    @RequestMapping(value = "/review/delete", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(@RequestBody Review review) {
        reviewMapper.deleteReviewByReviewId(review);

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("result", "ok");

        return resultMap;
    }


}
