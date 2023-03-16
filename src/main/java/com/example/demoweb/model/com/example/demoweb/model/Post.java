package com.example.demoweb.model.com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes = 0;
    private Date creationDate;
    private Long id;
    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }
    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
    public Post(String text) {
        this.text = text;
    }

    public Post(long id, String text, Date creationDate) {
        this.id = id;
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
    public Long getId(){
        return id;
    }
    public void setCreationDate(Date date)
    {
        creationDate = date;
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public void setLikes(Integer num) {
        likes = num;
    }
}
