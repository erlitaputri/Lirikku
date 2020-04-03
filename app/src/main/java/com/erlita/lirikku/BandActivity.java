package com.erlita.lirikku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.erlita.lirikku.adapters.BandAdapter;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;
import java.util.List;

public class BandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);

        RecyclerView bandView = findViewById(R.id.rv_bandImage);

        List<BandImage> band = new ArrayList<>();
        band.add(new BandImage("http://www.google.com", "Armada"));
        band.add(new BandImage("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Kahitna"));

        BandAdapter adapter = new BandAdapter(this, band);
        bandView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        bandView.setLayoutManager(layoutManager);
    }


}
