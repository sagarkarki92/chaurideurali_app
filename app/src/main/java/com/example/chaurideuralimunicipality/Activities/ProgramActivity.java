package com.example.chaurideuralimunicipality.Activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.chaurideuralimunicipality.Adaptors.ProgramAdaptor;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.Program;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ProgramActivity extends AppCompatActivity {

    List<Program> mlist;
    Toolbar toolbar;
    RecyclerView recyclerView;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        toolbar = findViewById(R.id.program_toolbar);
        toolbar.setTitle("Program");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        //setting recyclerview
        recyclerView = findViewById(R.id.program_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        //getting data from database
        mlist = new ArrayList<>();
        getProgramData();

        //keeping data into recyclerview via adaptor
        ProgramAdaptor adaptor = new ProgramAdaptor(this,mlist);
        recyclerView.setAdapter(adaptor);
    }

    private void getProgramData() {

        database = FirebaseDatabase.getInstance();
        reference = database.getReference().child("Programs");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    Program program = dataSnapshot1.getValue(Program.class);
                    mlist.add(program);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}
