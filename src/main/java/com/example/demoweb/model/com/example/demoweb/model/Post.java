package com.example.demoweb.model.com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }
    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
    public Date getCreationDate()
    {
        return creationDate;
    }
    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
}
