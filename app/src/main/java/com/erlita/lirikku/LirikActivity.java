package com.erlita.lirikku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.erlita.lirikku.adapters.JudulAdapter;
import com.erlita.lirikku.adapters.LirikAdapter;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;
import java.util.List;

public class LirikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lirik);

        RecyclerView bandView = findViewById(R.id.rv_lirik_lagu);

        List<BandImage> band = new ArrayList<>();
        band.add(new BandImage("https://1.bp.blogspot.com/-JVdGMTjzIkM/Xl3zUgFlKFI/AAAAAAAACcA/BMVrUlvQTJkelcxcOpmOJAUDTf8MF-QOACLcBGAsYHQ/s1600/Armada%2B-%2BAwas%2BJatuh%2BCinta.jpg", "Armada - Awas Jatuh Cinta"));
        band.add(new BandImage("https://3.bp.blogspot.com/-vm-Zvjdvjcc/W154ePchPtI/AAAAAAAABCY/oKaI982_1ecDPz_iCX_rdV2aqC3C6UvjgCLcBGAs/s1600/peterpan%2Bkau%2Byang%2Bku%2Binginkan-min.jpg", "Noah"));
        band.add(new BandImage("https://image.slidesharecdn.com/bukukumpulanliriklaguindonesiakuncigitar-150429080924-conversion-gate01/95/buku-kumpulan-lirik-lagu-indonesia-kunci-gitar-44-638.jpg?cb=1430295233", "Kahitna - Cantik"));
        band.add(new BandImage("https://3.bp.blogspot.com/-tS-lxE08Yb8/VxpOow-in5I/AAAAAAAALF0/UOdlpeW2AS8VAsRZVUhwh7BVbyGxRAGIACLcB/s1600/Not%252BAngka%252BPianika%252BLagu%252BTerlalu%252BLama%252BVierra.png", "Vierra - Terlalu Lama"));
        band.add(new BandImage("https://imgv2-2-f.scribdassets.com/img/document/419410001/original/8217441fa1/1584296620?v=1", "Geisha - Lumpuhkan Ingatanku"));
        band.add(new BandImage("https://image.isu.pub/170926143538-bd2af1877cb2b6ff5a8df84428ec1adc/jpg/page_1.jpg", "D'Masiv - Pergilah Kasih"));
        band.add(new BandImage("https://1.bp.blogspot.com/-qqBZxKpKhP0/WPJJ2pu6rhI/AAAAAAAAB5o/R9Se-ThSQQ8CtuQ1FLcHNUm72zA886kXgCK4B/s1600/Pelan%2B-%2BPelan%2BSaja%2B-%2BKotak-min.png", "Kotak - Pelan Pelan Saja"));

        LirikAdapter adapter = new LirikAdapter(this, band);
        bandView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        bandView.setLayoutManager(layoutManager);
    }
}
