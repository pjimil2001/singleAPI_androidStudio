package com.example.jsontojava.model;

public class mo{


    private String userId;
    private String id;
    private String title;
    private String body;




    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setBody(String body){
        this.body = body;
    }
    public String getBody(){
        return this.body;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}