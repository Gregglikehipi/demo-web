package com.example.demoweb.model.com.example.demoweb.model;

public class Post {
    public String text;
    public Integer likes;
    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }
    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
}
