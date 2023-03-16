package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    Post mas = new Post(0,"Масюня", new Date());
    Post NECO = new Post(1,"НекоАрк", new Date());
    List<Post> posts = new ArrayList<Post>(Arrays.asList(mas, NECO));
    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(posts.size() ,text, new Date()));
    }
}
