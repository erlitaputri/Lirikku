package com.erlita.lirikku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.erlita.lirikku.adapters.BandAdapter;
import com.erlita.lirikku.adapters.JudulAdapter;
import com.erlita.lirikku.adapters.LirikAdapter;
import com.erlita.lirikku.models.BandImage;

import java.util.ArrayList;

public class ProfilActivity extends AppCompatActivity {

    private RecyclerView rvBand;
    private TextView name;
    private ImageView foto;
    private ArrayList<BandImage> list = new ArrayList<>();
   // private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        name = findViewById(R.id.name);
        foto = findViewById(R.id.foto);
       // button = findViewById(R.id.button);

        Bundle extras = getIntent().getExtras();
        Bitmap bitmap = extras.getParcelable("foto");

        foto.setImageBitmap(bitmap);
        name.setText(extras.getString(MainActivity.NAME_KEY));

     //   button.setOnClickListener(new View.OnClickListener() {

      //  });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }


    private void showRecyclerList() {
        Intent intent = new Intent(this, BandActivity.class);
        startActivity(intent);
    }
    private void showRecyclerJudul() {
        Intent intent = new Intent(this, JudulActivity.class);
        startActivity(intent);
    }

    private void showRecyclerLirik() {
        Intent intent = new Intent(this, LirikActivity.class);
        startActivity(intent);
    }

  //  public void handleBand(View view) {
    //    Intent intent = new Intent(this, BandActivity.class);
      //  startActivity(intent);
    //}

    //public void handleJudul(View view) {
      //  Intent intent = new Intent(this, JudulActivity.class);
        //startActivity(intent);
    //}


    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_band:
                showRecyclerList();
                break;
            case R.id.action_judul:
                showRecyclerJudul();
                break;
            case R.id.action_lirik:
                showRecyclerLirik();
                break;
        }
    }
}
