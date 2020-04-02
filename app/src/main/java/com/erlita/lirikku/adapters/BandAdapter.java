package com.erlita.lirikku.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.erlita.lirikku.R;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;

public class BandAdapter extends RecyclerView.Adapter<BandAdapter.ListViewHolder> {

    private ArrayList<BandImage> listBand;

    public BandAdapter(ArrayList<BandImage> list){
        this.listBand = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_band, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        BandImage band = listBand.get(position);
        Glide.with(holder.itemView.getContext())
                .load(band.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.bandImage);
        holder.bandName.setText(band.getName());

    }

    @Override
    public int getItemCount() {
        return (listBand != null) ? listBand.size() : 0;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView bandImage;
        TextView bandName;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            bandImage = itemView.findViewById(R.id.rv_bandImage);
            bandName = itemView.findViewById(R.id.rv_bandName);
        }
    }
}
