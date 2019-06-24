package com.example.chaurideuralimunicipality.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chaurideuralimunicipality.Activities.WardDetailsActivity;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.WardDetailInformation;

import java.io.Serializable;


public class WardInformationFragment extends Fragment implements Serializable {

    TextView sachibname, ward_population,ward_contactnumber,ward_number;
    ImageView img_warddetails;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ward_information, container, false);
        sachibname = view.findViewById(R.id.ward_sachibname);
        ward_population = view.findViewById(R.id.ward_population);
        ward_contactnumber = view.findViewById(R.id.ward_contactnumber);
        ward_number = view.findViewById(R.id.ward_number);
        img_warddetails = view.findViewById(R.id.img_warddetails);

        //getting data from ward list activity via wardDetailsActivity to check and return required information of that specific ward

        WardDetailsActivity wardDetailsActivity = (WardDetailsActivity) getActivity();
        if(wardDetailsActivity!=null) {
            WardDetailInformation information = wardDetailsActivity.getWardinfo();
            sachibname.setText(information.getSachivName());
            ward_population.setText(information.getPopulation());
            ward_contactnumber.setText(information.getWard_phone_number());
            ward_number.setText(information.getWardno());

        }
        return view;
     }

}
