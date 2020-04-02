package com.erlita.lirikku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.erlita.lirikku.adapters.JudulAdapter;

import java.util.ArrayList;
import java.util.List;

public class JudulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judul);
        RecyclerView judulView = findViewById(R.id.rv_judul);

        List<String> judul = new ArrayList<>();
        judul.add("Armada - Awas Jatuh Cinta");
        judul.add("Noah - Separuh Aku");
        judul.add("Kahitna - Cantik");
        judul.add("Viera - Kesepian");

        JudulAdapter adapter = new JudulAdapter(judul);
        judulView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        judulView.setLayoutManager(layoutManager);
    }
}
