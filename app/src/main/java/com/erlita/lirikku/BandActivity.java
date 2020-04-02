package com.erlita.lirikku;

import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;

public class BandActivity{

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
}
