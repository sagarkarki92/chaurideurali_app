package com.example.chaurideuralimunicipality.Adaptors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.chaurideuralimunicipality.Activities.GalleryDetails;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.Gallery;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GalleryDetailsAdaptor extends RecyclerView.Adapter<GalleryDetailsAdaptor.GalleryDetailsViewHolder> {

    Context mcontext;
    Gallery gallery;

    public GalleryDetailsAdaptor(Context context,Gallery gallery) {
        this.mcontext = context;
        this.gallery = gallery;
    }

    @NonNull
    @Override
    public GalleryDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.photo_card,null);
        return new GalleryDetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryDetailsViewHolder galleryDetailsViewHolder, int i) {

       Log.d("from bind i url",gallery.getUrls().get(i));
     Picasso.get().load(gallery.getUrls().get(i)).into(galleryDetailsViewHolder.photo);

    }

    @Override
    public int getItemCount() {
        return gallery.getUrls().size();
    }

    public class GalleryDetailsViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;

        public GalleryDetailsViewHolder(@NonNull View itemView) {
            super(itemView);
            photo =itemView.findViewById(R.id.photos);

        }
    }
}
