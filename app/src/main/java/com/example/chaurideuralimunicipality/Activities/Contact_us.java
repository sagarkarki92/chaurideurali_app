package com.example.chaurideuralimunicipality.Activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.chaurideuralimunicipality.R;

public class Contact_us extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        toolbar = findViewById(R.id.contact_us_toolbar);
        toolbar.setTitle("Contact Us");

    }

}