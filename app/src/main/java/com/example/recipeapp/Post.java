package com.example.recipeapp;

// post class for main activity's feed

public class Post {
    String username;
    String postText;

    public Post(String username, String postText) {
        this.username = username;
        this.postText = postText;
    }

    public String getUsername() {
        return username;
    }

    public String getPostText() {
        return postText;
    }
}
