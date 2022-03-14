package com.example.recipeapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends Activity {
    Button buttonCapture;
    Button buttonSavedContent;

    RecyclerView recyclerViewFeed;
    PostAdapter adapter;

    ArrayList<Post> feed;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCapture = findViewById(R.id.buttonCapture);
        buttonSavedContent = findViewById(R.id.buttonSavedContent);

        recyclerViewFeed = findViewById(R.id.recyclerViewFeed);
        recyclerViewFeed.setLayoutManager(new LinearLayoutManager(this));

        feed = new ArrayList<>();
        adapter = new PostAdapter(feed);
        recyclerViewFeed.setAdapter(adapter);




        buttonCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Capture.class);
                startActivity(intent);

            }
        });

        buttonSavedContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SavedContent.class);
                startActivity(intent);
            }
        });
    }
}