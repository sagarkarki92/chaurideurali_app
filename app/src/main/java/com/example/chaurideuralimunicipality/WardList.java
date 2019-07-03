package com.example.chaurideuralimunicipality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class WardList extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_list);
        toolbar = findViewById(R.id.ward_list_toolbar);
        toolbar.setTitle("Ward List");

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void Ward1(View V){
        Intent intent = new Intent(this, Ward.class);

        String message = "1";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward2(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "2";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward3(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "3";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward4(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "4";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward5(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "5";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward6(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "6";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward7(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "7";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward8(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "8";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
    public void Ward9(View v){
        Intent intent = new Intent(this, Ward.class);

        String message = "9";
        intent.putExtra("Data", message);
        startActivity(intent);


    }
}
