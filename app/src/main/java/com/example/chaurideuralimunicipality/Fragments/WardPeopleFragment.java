package com.example.chaurideuralimunicipality.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.chaurideuralimunicipality.Activities.WardDetailsActivity;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.People;

import java.util.List;


public class WardPeopleFragment extends Fragment {

    ListView listView;
    TextView peoplename,peoplepost,peoplenumber;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ward_people, container, false);
//        listView = view.findViewById(R.id.wardpeople_listview);
//        peoplename = view.findViewById(R.id.peoplename);
//        peoplepost = view.findViewById(R.id.peoplepost);
//        peoplenumber = view.findViewById(R.id.peoplephone);

        WardDetailsActivity detailsActivity = (WardDetailsActivity) getActivity();
        People people = detailsActivity.getPeopleInfo();
//        demotext.setText(people.getName());
//        String[] peopleinfo = {people.getName(),people.getPost(),people.getPhonenumber()};
//        ArrayAdapter<People> arrayAdapter = new ArrayAdapter<People>(getActivity(),R.layout.wardpeople_card, (List<People>) people);
//        listView.setAdapter(arrayAdapter);

        return view;
    }

}
