//package com.example.chaurideuralimunicipality.Fragments;
//
//import android.content.Context;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.GridLayoutManager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//
//import com.example.chaurideuralimunicipality.Activities.MainActivity;
//import com.example.chaurideuralimunicipality.Adaptors.NoticeAdaptor;
//import com.example.chaurideuralimunicipality.R;
//import com.example.chaurideuralimunicipality.model.Notice;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.example.chaurideuralimunicipality.R;
//
//
//public class NoticeFragment extends Fragment {
//
//    List<com.example.chaurideuralimunicipality.model.Notice> mlist;
//    Toolbar toolbar;
//    RecyclerView recyclerView;
//    NoticeAdaptor adaptor;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_notice);
//
//        //setting up toolbar
//        toolbar = findViewById(R.id.notice_toolbar);
//        toolbar.setTitle("NoticeActivity");
//        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), MainActivity.class));
//            }
//        });
//        mlist = new ArrayList<>();
//        noticeDataRecyclerView();
//    }
//
//    private void noticeDataRecyclerView() {
//
//    }
//}
