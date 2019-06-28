package com.example.chaurideuralimunicipality.Fragments;

import android.content.Context;
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

import java.util.Collections;
import java.util.List;


public class WardPeopleFragment extends Fragment {

    ListView listView;
    TextView peoplename,peoplepost,peoplenumber;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ward_people, container, false);
        listView = view.findViewById(R.id.wardpeople_listview);

        WardDetailsActivity detailsActivity = (WardDetailsActivity) getActivity();
        People people = detailsActivity.getPeopleInfo();
        listView.setAdapter(new MyAdaptor(getActivity(),R.layout.wardpeople_card,people));
        return view;

    }
    class MyAdaptor extends ArrayAdapter<People>{

        TextView name,post,number;
        public MyAdaptor( Context context, int resource,People objects) {
            super(context, resource, Collections.singletonList(objects));
        }
        List<People> mlist;

        @Override
        public View getView(int position, View convertView,ViewGroup parent) {
          View view = LayoutInflater.from(getContext()).inflate(R.layout.wardpeople_card,null);
          name = view.findViewById(R.id.peoplename);
          post = view.findViewById(R.id.peoplepost);
          number = view.findViewById(R.id.peoplephone);
          ;

            return super.getView(position, convertView, parent);
        }
    }

}
