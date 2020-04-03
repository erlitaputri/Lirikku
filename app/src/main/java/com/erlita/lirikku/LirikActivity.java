package com.erlita.lirikku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.erlita.lirikku.adapters.JudulAdapter;
import com.erlita.lirikku.adapters.LirikAdapter;

import java.util.ArrayList;
import java.util.List;

public class LirikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lirik);


    }
}
