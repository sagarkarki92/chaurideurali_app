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
import com.example.chaurideuralimunicipality.model.People;
import com.example.chaurideuralimunicipality.model.WardDetailInformation;
import com.example.chaurideuralimunicipality.model.Wards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WardAdaptor extends RecyclerView.Adapter<WardAdaptor.WardViewHolder> implements Serializable {

    private Context mcontext;
    private List<Wards> wardsList;
    private String wardno;
    private WardDetailInformation detailInformation;
    private People people;


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
                if(wards.getWardname().equals(mcontext.getString(R.string.ward1))){
                    wardno= "Ward no. 1";
                    //sending data of ward 1 to class and to fragment via serializable
                    detailInformation = new WardDetailInformation(R.drawable.ic_photo_camera_black_24dp,wardno,mcontext.getString(R.string.ward_1_personal_contact_number),
                            mcontext.getString(R.string.ward_1_population),mcontext.getString(R.string.ward_1_contact_number));
                    List<String> names = new ArrayList<>();
                    names.add("Asdasd");
                    names.add("sdasd");
                    names.add("sdasd");
                    names.add("sdasd");
                    names.add("sdasd");
                    people = new People(names,"aadachya","98418575785");
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward2))){
                    wardno= "Ward no. 2";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward2,wardno,mcontext.getString(R.string.ward_2_personal_contact_number),
                            mcontext.getString(R.string.ward_2_population),mcontext.getString(R.string.ward_2_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward3))){
                    wardno= "Ward no. 3";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward3,wardno,mcontext.getString(R.string.ward_3_personal_contact_number),
                            mcontext.getString(R.string.ward_3_population),mcontext.getString(R.string.ward_3_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward4))){
                    wardno= "Ward no. 4";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward4,wardno,mcontext.getString(R.string.ward_4_personal_contact_number),
                            mcontext.getString(R.string.ward_4_population),mcontext.getString(R.string.ward_4_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward5))){
                    wardno= "Ward no. 5";
                    detailInformation = new WardDetailInformation(R.drawable.ward_5,wardno,mcontext.getString(R.string.ward_5_personal_contact_number),
                            mcontext.getString(R.string.ward_5_population),mcontext.getString(R.string.ward_5_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward6))){
                    wardno= "Ward no. 6";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward6,wardno,mcontext.getString(R.string.ward_6_personal_contact_number),
                            mcontext.getString(R.string.ward_6_population),mcontext.getString(R.string.ward_6_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward7))){
                    wardno= "Ward no. 7";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward7,wardno,mcontext.getString(R.string.ward_7_personal_contact_number),
                            mcontext.getString(R.string.ward_7_population),mcontext.getString(R.string.ward_7_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward8))){
                    wardno= "Ward no. 8";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward8,wardno,mcontext.getString(R.string.ward_8_personal_contact_number),
                            mcontext.getString(R.string.ward_8_population),mcontext.getString(R.string.ward_8_contact_number));
                }
                else if(wards.getWardname().equals(mcontext.getString(R.string.ward9))){
                    wardno= "Ward no. 9";
                    detailInformation = new WardDetailInformation(R.drawable.img_ward9,wardno,mcontext.getString(R.string.ward_9_personal_contact_number),
                            mcontext.getString(R.string.ward_9_population),mcontext.getString(R.string.ward_9_contact_number));
                }

                    Intent intent = new Intent(mcontext,WardDetailsActivity.class);
                    intent.putExtra("wardinfo", detailInformation);
                    intent.putExtra("wardpeople", people);
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
//    int[] image = {R.drawable.img_ward2,R.drawable.img_ward3,R.drawable.img_ward4,R.drawable.ward_5,
//                    R.drawable.img_ward6,R.drawable.img_ward7,R.drawable.img_ward8,R.drawable.img_ward9};

}
