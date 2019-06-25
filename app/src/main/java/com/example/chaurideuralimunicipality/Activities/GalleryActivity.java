package com.example.chaurideuralimunicipality.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.chaurideuralimunicipality.R;

public class GalleryActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        //setting up toolbar
        toolbar = findViewById(R.id.gallery_toolbar);
        toolbar.setTitle("Gallery");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        //setting up recyclerview
        recyclerView = findViewById(R.id.gallery_recyclerview);

    }
}
