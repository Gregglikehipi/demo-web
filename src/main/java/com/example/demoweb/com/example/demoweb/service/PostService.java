package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import com.example.demoweb.com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public Iterable<Post> listAllPosts() {
            return postRepository.findAll();
    }
    public Post create(String text) {
        Post post = new Post(null, text);
        postRepository.save(post);
        return post;
    }
}
