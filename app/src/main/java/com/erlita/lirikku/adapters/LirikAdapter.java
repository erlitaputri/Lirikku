package com.erlita.lirikku.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erlita.lirikku.R;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;

public class LirikAdapter extends RecyclerView.Adapter<LirikAdapter.ViewHolder> {
    public LirikAdapter(ArrayList<BandImage> list) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView bandName, judullagu, liriklagu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bandName = itemView.findViewById(R.id.rv_bandImage);
            judullagu = itemView.findViewById(R.id.rv_judul_lagu);
            liriklagu = itemView.findViewById(R.id.rv_lirik_lagu);
        }
    }
}
