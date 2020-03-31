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
import com.squareup.picasso.Target;

import java.text.CollationElementIterator;
import java.util.List;

public class BandAdapter extends RecyclerView.Adapter<BandAdapter.ViewHolder> {

    private Context context;
    private List<BandImage> items;

    public BandAdapter(Context context, List<BandImage> items){
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BandAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_band, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BandAdapter.ViewHolder holder, int position) {
        BandImage item = items.get(position);
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.nameText.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
