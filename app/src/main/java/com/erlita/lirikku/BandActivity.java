package com.erlita.lirikku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;

public class BandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);
    }

    private static String[] bandNames = {
            "Kahitna",
            "Noah",
            "Armada",
            "Viera"
    };
    private static int[] bandImages = {
            R.drawable.kahitna,
            R.drawable.noah,
            R.drawable.armada,
            R.drawable.viera
    };

    static ArrayList<BandImage> getListData(){
        ArrayList<BandImage> list = new ArrayList<>();
        for (int position = 0; position < bandNames.length; position++){
            BandImage band = new BandImage();
            band.setName(bandNames[position]);
            band.setImage(bandImages[position]);
            list.add((band));
        }
        return  list;
    }

    public void handleJudul(View view) {
        Intent intent = new Intent(this, JudulActivity.class);
        startActivity(intent);
    }
}
