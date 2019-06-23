package com.example.chaurideuralimunicipality.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.chaurideuralimunicipality.R;

public class Notice_details extends AppCompatActivity {

    Toolbar toolbar;
    TextView title,information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_details);
        title = findViewById(R.id.notice_details_title);
        information = findViewById(R.id.notice_details_information);

        // -----------setting up toolbar
        toolbar = findViewById(R.id.notice_details_toolbar);
        toolbar.setTitle("NoticeActivity");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

    }
}
