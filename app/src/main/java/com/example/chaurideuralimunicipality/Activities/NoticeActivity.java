package com.example.chaurideuralimunicipality.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.chaurideuralimunicipality.Adaptors.NoticeAdaptor;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.Notice;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;


public class NoticeActivity extends AppCompatActivity {

    List<Notice> mlist;
    Toolbar toolbar;
    RecyclerView recyclerView;
    NoticeAdaptor adaptor;
    FirebaseDatabase database;
    DatabaseReference myrefrence;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        progressDialog= new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        Toast.makeText(NoticeActivity.this, "लोड हुँदैछ", Toast.LENGTH_SHORT).show();


        progressDialog.show();

        //setting up toolbar
        toolbar = findViewById(R.id.notice_toolbar);
        toolbar.setTitle("Notice");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });

        recyclerView = findViewById(R.id.notice_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        mlist = new ArrayList<>();
        loadUrlData();


        adaptor = new NoticeAdaptor(NoticeActivity.this,mlist);
        recyclerView.setAdapter(adaptor);
    }

    private void loadUrlData() {


       //getting notice from database i.e now from fire base database !!!
        database = FirebaseDatabase.getInstance();
        myrefrence = database.getReference("Notices");
        progressDialog.dismiss();
        myrefrence.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(!mlist.isEmpty()) {
                    mlist.clear();
                }
                  for(DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {

                    Notice notice = dataSnapshot1.getValue(Notice.class);
                    if(notice!=null) {
                        mlist.add(notice);
                    }else{
                        Toast.makeText(NoticeActivity.this, "माफ गर्नुहोस्! सूचना डेटा छैन", Toast.LENGTH_SHORT).show();

                    }

                }
                recyclerView.getAdapter().notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),"Error occured",Toast.LENGTH_SHORT).show();
            }

        });



    }
}

