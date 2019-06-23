package com.example.chaurideuralimunicipality.Adaptors;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.chaurideuralimunicipality.Activities.WardDetailsActivity;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.WardDetailInformation;
import com.example.chaurideuralimunicipality.model.Wards;

import java.io.Serializable;
import java.util.List;

public class WardAdaptor extends RecyclerView.Adapter<WardAdaptor.WardViewHolder> implements Serializable {

    private Context mcontext;
    private List<Wards> wardsList;
    private String wardno;
    String ward1;
    WardDetailInformation detailInformation;


    public WardAdaptor(Context mcontext, List<Wards> wardsList) {
        this.mcontext = mcontext;
        this.wardsList = wardsList;
    }

    @NonNull
    @Override
    public WardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //this method returns wardviewholder instance and it creates the UI in recyclerview

        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.card_item,null);
        return new WardViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WardViewHolder wardViewHolder, int position) {

        final Wards wards = wardsList.get(position);
        wardViewHolder.wardlocation.setText(wards.getWardname());
        wardViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wards.getWardname().equals(ward1)){
                    wardno= "Ward no. 1";
                    //sending data of ward 1 to class and to fragment via serializable
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_1_personal_contact_number),
                            mcontext.getString(R.string.ward_1_population),mcontext.getString(R.string.ward_1_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward2))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_2_personal_contact_number),
                            mcontext.getString(R.string.ward_2_population),mcontext.getString(R.string.ward_2_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward3))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_3_personal_contact_number),
                            mcontext.getString(R.string.ward_3_population),mcontext.getString(R.string.ward_3_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward4))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_4_personal_contact_number),
                            mcontext.getString(R.string.ward_4_population),mcontext.getString(R.string.ward_4_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward5))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_5_personal_contact_number),
                            mcontext.getString(R.string.ward_5_population),mcontext.getString(R.string.ward_5_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward6))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_6_personal_contact_number),
                            mcontext.getString(R.string.ward_6_population),mcontext.getString(R.string.ward_6_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward7))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_7_personal_contact_number),
                            mcontext.getString(R.string.ward_7_population),mcontext.getString(R.string.ward_7_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward8))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_8_personal_contact_number),
                            mcontext.getString(R.string.ward_8_population),mcontext.getString(R.string.ward_8_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward9))){
                    detailInformation = new WardDetailInformation(mcontext.getString(R.string.ward_9_personal_contact_number),
                            mcontext.getString(R.string.ward_9_population),mcontext.getString(R.string.ward_9_contact_number));
                }

                    Intent intent = new Intent(mcontext,WardDetailsActivity.class);
                    intent.putExtra("wardinfo", (Serializable) detailInformation);
                    mcontext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return wardsList.size();
    }

    //this class holds the view in recyclerview

    public class WardViewHolder extends RecyclerView.ViewHolder {

        TextView wardlocation,wardno;
        LinearLayout linearLayout;
        public WardViewHolder(@NonNull View itemView) {
            super(itemView);

            wardlocation = itemView.findViewById(R.id.wardlocation);
//            wardno = itemView.findViewById(R.id.ward_no);
            linearLayout =itemView.findViewById(R.id.ward_carditem);
        }
    }
}
