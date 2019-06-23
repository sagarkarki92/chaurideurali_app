package com.example.chaurideuralimunicipality.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.chaurideuralimunicipality.R;

public class ProgramActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        toolbar = findViewById(R.id.program_toolbar);
        toolbar.setTitle("Program");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
    }
}
