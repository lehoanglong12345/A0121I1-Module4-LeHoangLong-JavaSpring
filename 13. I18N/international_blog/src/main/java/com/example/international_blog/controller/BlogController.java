package com.example.international_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {
    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String getBlogs() {
        return "index";
    }
}
