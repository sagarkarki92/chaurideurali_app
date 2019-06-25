package com.example.chaurideuralimunicipality.Adaptors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.Gallery;

import java.util.List;

public class GalleryAdaptor extends RecyclerView.Adapter<GalleryAdaptor.GalleryViewHolder> {
    Context mcontext;
    List<Gallery> mlist;   //gallery should have title and image of first index so that, that image could be use as background of gallery

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.album_card,null);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int i) {

        Gallery gallery = mlist.get(i);
        galleryViewHolder.title.setText(gallery.getTitle());
        //thumbnail keeoing decision yet to make
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GalleryViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView thumbnail;
        public GalleryViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.album_name);
            thumbnail = itemView.findViewById(R.id.album_thumbnail);
        }
    }
}
