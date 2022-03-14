package com.example.recipeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{
    ArrayList<Post> feed;
    public PostAdapter(ArrayList<Post> feed) {
        this.feed = feed;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate card view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_card_layout, parent, false);
        //pass v to view holder
        ViewHolder holder = new ViewHolder(v);
        // create view holder
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //bind data to view holder
        holder.textViewUsername.setText(feed.get(position).getUsername());
        holder.textViewPostText.setText(feed.get(position).getPostText());

    }

    @Override
    public int getItemCount() {
        return feed.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewUsername;
        TextView textViewPostText;
        public ViewHolder(@NonNull View itemView){

            super(itemView);
            textViewUsername = itemView.findViewById(R.id.textViewUsername);
            textViewPostText = itemView.findViewById(R.id.textViewPostText);

        }

    }


}
