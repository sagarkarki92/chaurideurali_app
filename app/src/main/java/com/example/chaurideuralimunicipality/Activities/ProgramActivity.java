package com.example.chaurideuralimunicipality.Activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

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
        //setting up toolbar
        toolbar = findViewById(R.id.program_toolbar);
        toolbar.setTitle("Program");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //setting recyclerview
        recyclerView = findViewById(R.id.program_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        //message for waiting
        Toast.makeText(ProgramActivity.this, "लोड हुँदैछ", Toast.LENGTH_SHORT).show();
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
                if(!mlist.isEmpty()) {
                    mlist.clear();
                }
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    Program program = dataSnapshot1.getValue(Program.class);
                    if(program!=null) {
//
                            mlist.add(program);
//                        System.out.println("-----------------------------");
//                        System.out.println(program.getTitle());
//                        System.out.println(program.getBody());
//                        System.out.println(program.getDate());
//                        System.out.println("-----------------------------");
                    }else{
                        Toast.makeText(ProgramActivity.this, "माफ गर्नुहोस्! कुनै प्रोग्राम डेटा छैन", Toast.LENGTH_SHORT).show();
                    }
                }

                    recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}
