package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> post3 = new ArrayList<>();
        post3.add(new Post("Масюня", 32));
        post3.add(new Post("Масюня", 33));
        post3.add(new Post("Масюня", 34));
        return post3;
    }
}
