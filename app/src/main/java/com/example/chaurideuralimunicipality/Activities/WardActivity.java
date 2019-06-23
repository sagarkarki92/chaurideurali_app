package com.example.chaurideuralimunicipality.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.chaurideuralimunicipality.Adaptors.WardAdaptor;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.Wards;

import java.util.ArrayList;
import java.util.List;

public class WardActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    WardAdaptor adaptor;
    List<Wards> mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward);

        //setting up toolbar
        toolbar = findViewById(R.id.ward_toolbar);
        toolbar.setTitle("Wards");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        mlist = new ArrayList<>();
        setUpRecyclerView();

    }

    private void setUpRecyclerView() {


        recyclerView = findViewById(R.id.ward_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        mlist.add(new Wards(1,getString(R.string.ward1)));
        mlist.add(new Wards(2,getString(R.string.ward2)));
        mlist.add(new Wards(3,getString(R.string.ward3)));
        mlist.add(new Wards(3,getString(R.string.ward4)));
        mlist.add(new Wards(3,getString(R.string.ward5)));
        mlist.add(new Wards(3,getString(R.string.ward6)));
        mlist.add(new Wards(3,getString(R.string.ward7)));
        mlist.add(new Wards(3,getString(R.string.ward8)));
        mlist.add(new Wards(3,getString(R.string.ward9)));

        //setting up adaptor to recycler
        adaptor = new WardAdaptor(this,mlist);
        recyclerView.setAdapter(adaptor);




    }

}
