package com.erlita.lirikku.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erlita.lirikku.R;
import com.erlita.lirikku.models.BandImage;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BandAdapter extends RecyclerView.Adapter<BandAdapter.ListViewHolder> {


    //private ArrayList<BandImage> listBand;
    private Context context;
    private List<BandImage> items;

    public BandAdapter(Context context, List<BandImage> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_band, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        BandImage band = items.get(position);
        Picasso.get().load(band.getImage()).into(holder.bandImage);
        holder.bandName.setText(band.getName());

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
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
