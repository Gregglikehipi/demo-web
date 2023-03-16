package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {

    @Autowired
    PostService postService;
    public int like(long postId){
        Post post = postService.listAllPosts().get((int)postId);
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }

}
