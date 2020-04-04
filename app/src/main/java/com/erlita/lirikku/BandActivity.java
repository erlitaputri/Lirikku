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
        band.add(new BandImage("https://3.bp.blogspot.com/-cfgNsvpNHYA/UPPFPzlVonI/AAAAAAAAArU/Hn1xyigR20o/s1600/ARMADA+3.JPG", "Armada"));
        band.add(new BandImage("https://cdn0-production-images-kly.akamaized.net/unJRS1LxpVJzgYGPip7q4Z7lSWw=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/830167/original/091714900_1426578866-noah.jpg", "Noah"));
        band.add(new BandImage("https://www.ywmf.id/storage/galleries/image/thumbnails/13/artist/dsAIg9YOqy1541170436.jpg", "Kahitna"));
        band.add(new BandImage("https://2.bp.blogspot.com/_FzOZRiDFuDs/TMMFkjJE4hI/AAAAAAAAA_g/V3Oisg7WfDI/s1600/vierra-2.jpg", "Vierra"));
        band.add(new BandImage("https://cdn2.tstatic.net/wartakota/foto/bank/images/20180714-band-geisha_20180714_074800.jpg", "Geisha"));
        band.add(new BandImage("https://cdn1-production-images-kly.akamaized.net/-4LIMG0ldk9dBcOH0UvEabIj3bU=/640x640/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2772896/original/002321300_1554723298-D_MASIV_Do_a_Revisi_Foto.jpg", "D Masiv"));
        band.add(new BandImage("https://smartnewstapanuli.com/wp-content/uploads/2019/11/band-kotak-cover.jpg", "Kotak"));

        BandAdapter adapter = new BandAdapter(this, band);
        bandView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        bandView.setLayoutManager(layoutManager);
    }


}
