package com.example.demo12.controller;

import com.example.demo12.mapper.ListMapper;
import com.example.demo12.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListController {
    @Autowired
    private ListMapper listMapper;

    @RequestMapping("/comunity/list")
    public String list(Model model) {
        List<Post> posts = listMapper.getPosts();

        model.addAttribute("posts", posts);
        return "list";
    }

}
