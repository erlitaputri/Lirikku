package com.erlita.lirikku.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erlita.lirikku.R;
import com.erlita.lirikku.models.BandImage;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class LirikAdapter extends RecyclerView.Adapter<LirikAdapter.ViewHolder> {

    private Context context;
    private List<BandImage> items;

    public LirikAdapter(Context context, List<BandImage> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_lirik, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BandImage band = items.get(position);
        Picasso.get().load(band.getImage()).into(holder.liriklagu);
        holder.judullagu.setText(band.getName());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView judullagu;
        ImageView liriklagu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judullagu = itemView.findViewById(R.id.band_name_judul_lagu);
            liriklagu = itemView.findViewById(R.id.lirik_lagu);
        }
    }
}
