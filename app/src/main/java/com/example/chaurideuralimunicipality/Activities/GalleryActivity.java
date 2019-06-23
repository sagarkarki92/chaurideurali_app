package com.example.chaurideuralimunicipality.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.chaurideuralimunicipality.R;

public class GalleryActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        toolbar = findViewById(R.id.gallery_toolbar);
        toolbar.setTitle("Gallery");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
    }
}
