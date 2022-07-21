package com.example.jsontojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    ImageView img;
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        img=(ImageView)findViewById(R.id.img);

        tv2=(TextView)findViewById(R.id.uid);
        tv1=(TextView)findViewById(R.id.id);
        tv3=(TextView)findViewById(R.id.title);
        tv4=(TextView)findViewById(R.id.body);



//        img.setImageResource(getIntent().getIntExtra("img",0));
        tv2.setText(getIntent().getStringExtra("uid"));
        tv1.setText(getIntent().getStringExtra("id"));
        tv3.setText(getIntent().getStringExtra("title"));
        tv4.setText(getIntent().getStringExtra("body"));
    }
}