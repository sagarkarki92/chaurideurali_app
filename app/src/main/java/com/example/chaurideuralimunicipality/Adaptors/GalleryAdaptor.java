package com.example.chaurideuralimunicipality.Adaptors;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.widget.TextView;

import com.example.chaurideuralimunicipality.Activities.FullScreenActivity;
import com.example.chaurideuralimunicipality.Activities.GalleryDetails;

import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.Gallery;
import com.squareup.picasso.Picasso;


import java.io.Serializable;
import java.util.List;


public class GalleryAdaptor extends RecyclerView.Adapter<GalleryAdaptor.GalleryViewHolder> implements Serializable {

    Context mcontext;
    List<Gallery> mlist;

    public GalleryAdaptor(Context mcontext, List<Gallery> mlist) {
        this.mcontext = mcontext;
        this.mlist = mlist;
        Picasso.setSingletonInstance(
                new Picasso.Builder(this.mcontext)
                        // additional settings
                        .build());

    }

//    @NonNull
//    @Override
//    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(mcontext).inflate(R.layout.photo_card, null);
//        return new GalleryViewHolder(view);
//    }



    @NonNull
    @Override

    public GalleryAdaptor.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.photo_card, null);
        return new GalleryViewHolder(view);
    }

    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int position) {

        final Gallery gallery = mlist.get(position);
        galleryViewHolder.title.setText(gallery.getTitle());
        if (mcontext != null) {
            Picasso.get().load(gallery.getUrls().get(0)).into(galleryViewHolder.thumbnail);
            System.out.println("here it is from galary activity" + mcontext);
            //when user clicked one album it should take inside of that album
            galleryViewHolder.album_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mcontext, GalleryDetails.class);
                    intent.putExtra("galleryobject", gallery);
                    mcontext.startActivity(intent);

                }
            });
        }
        //thumbnail keeping decision yet to make


        }
    @Override
    public int getItemCount() {

        return 0;
    }

        public class GalleryViewHolder extends RecyclerView.ViewHolder {

            LinearLayout album_layout;
            TextView title;
            ImageView thumbnail;


            public GalleryViewHolder(@NonNull View itemView) {
                super(itemView);
                album_layout = itemView.findViewById(R.id.album_card_layout);
                thumbnail = itemView.findViewById(R.id.album_thumbnail);
                title = itemView.findViewById(R.id.album_name);


            }

        }

}