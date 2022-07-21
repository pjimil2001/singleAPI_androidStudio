package com.example.jsontojava;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jsontojava.model.UserResponse;
import com.example.jsontojava.model.mo;
import com.example.jsontojava.model.usermodel;

import java.util.List;

public class readapter extends RecyclerView.Adapter<readapter.ViewHolder> {

    private List<mo> listdata;
    Context context;

//     RecyclerView recyclerView;
    public readapter(Context context,List<mo> listdata) {
        this.context=context;
        this.listdata = listdata;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_main, parent, false));
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final mo myListData = listdata.get(position);


        holder.textView1.setText(myListData.getUserId());
        holder.textView2.setText(myListData.getId());
        holder.textView3.setText(myListData.getTitle());
        holder.textView.setText(myListData.getBody());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "click on item: " + myListData.getBody(), Toast.LENGTH_LONG).show();


                Intent intent=new Intent(context,MainActivity2.class);

                intent.putExtra("uid",myListData.getUserId());
                intent.putExtra("id",myListData.getId());
                intent.putExtra("title",myListData.getTitle());
                intent.putExtra("body",myListData.getBody());


                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);



            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView,textView1,textView3,textView2;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.tv);
            this.textView1 = itemView.findViewById(R.id.tv1);
            this.textView2 = itemView.findViewById(R.id.tv2);
            this.textView3 = itemView.findViewById(R.id.tv3);


        }
    }
}