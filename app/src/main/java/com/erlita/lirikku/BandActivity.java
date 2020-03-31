package com.erlita.lirikku;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.erlita.lirikku.adapters.BandAdapter;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;
import java.util.List;

public class BandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<BandImage> teams = new ArrayList<>();
        teams.add(new BandImage("R.drawable.kahitna", "Kahitna"));
        teams.add(new BandImage("R.drawable.noah", "Noah"));

        BandAdapter adapter = new BandAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        teamsView.setLayoutManager(layoutManager);
    }
}
