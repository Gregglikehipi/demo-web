package com.example.demoweb.com.example.demoweb.controller;

import com.example.demoweb.com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsCreateController {
    @Autowired
    PostService postsService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("appName", "Молчат дома");
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postsService.create(text);
        return "redirect:/";
    }
}
