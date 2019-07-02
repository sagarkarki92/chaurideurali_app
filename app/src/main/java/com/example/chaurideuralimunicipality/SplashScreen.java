package com.example.chaurideuralimunicipality;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

import com.example.chaurideuralimunicipality.Activities.MainActivity;

public class SplashScreen extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
