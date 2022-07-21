package com.example.jsontojava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jsontojava.model.UserResponse;
import com.example.jsontojava.model.mo;
import com.example.jsontojava.model.usermodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    apiinterface apiinterface;



    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerView);




    apiinterface=retrofitinstance.getRetrofit().create(apiinterface.class);
    apiinterface.getposts().enqueue(new Callback<List<mo>>() {
        @Override
        public void onResponse(Call<List<mo>> call, Response<List<mo>> response) {
            if (response.body().size() > 0 ) {

                List<mo>postlist =response.body();
                readapter adapter=new readapter(MainActivity.this, postlist);
                LinearLayoutManager linearLayoutManager= new LinearLayoutManager(MainActivity.this);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(adapter);





            } else{
                Toast.makeText(MainActivity.this, "empty", Toast.LENGTH_LONG).show();
            }

        }

        @Override
        public void onFailure(Call<List<mo>> call, Throwable t) {
            Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

        }
    });







    }
}