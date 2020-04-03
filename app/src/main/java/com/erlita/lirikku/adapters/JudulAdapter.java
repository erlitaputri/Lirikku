package com.erlita.lirikku.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erlita.lirikku.JudulActivity;
import com.erlita.lirikku.R;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;
import java.util.List;

public class JudulAdapter extends RecyclerView.Adapter<JudulAdapter.ViewHolder> {

    private List<String> judul;

    public JudulAdapter(List<String> judul)
    {
        this.judul = judul;
    }

    public JudulAdapter(ArrayList<BandImage> list) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_judul, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = judul.get(position);
        holder.nameText.setText(item);
    }

    @Override
    public int getItemCount() {
        return (judul != null) ? judul.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
