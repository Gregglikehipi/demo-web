package com.example.demoweb.model.com.example.demoweb.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(Long id, String text) {
        this.id = id;
        this.text = text;
        Calendar cal = Calendar.getInstance();
        this.creationDate = cal.getTime();
        this.likes = Math.abs(new Random().nextInt(100));
    }

    public Post() {

    }

    public Long getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }
}

