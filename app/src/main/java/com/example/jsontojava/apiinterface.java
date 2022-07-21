package com.example.jsontojava;

import com.example.jsontojava.model.UserResponse;
import com.example.jsontojava.model.mo;
import com.example.jsontojava.model.usermodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiinterface {

//    https://jsonplaceholder.typicode.com/posts

    @GET("posts")
    Call<List<mo>> getposts();


    @GET("comments")
    Call<List<usermodel>> getpost();

}
