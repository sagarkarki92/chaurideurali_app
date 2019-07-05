package com.example.chaurideuralimunicipality.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.chaurideuralimunicipality.R;
import com.squareup.picasso.Picasso;

public class FullScreenActivity extends AppCompatActivity {

    ImageView fullimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        fullimage = findViewById(R.id.fullscreen_image);
        String image = getIntent().getStringExtra("imageuri");
        Picasso.get().load(image).into(fullimage);
    }
}
