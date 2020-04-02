package com.erlita.lirikku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    private TextView name;
    private ImageView foto;
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

    public void handleMulai(View view) {
       Intent intent = new Intent(this, BandActivity.class);
        startActivity(intent);
    }
}
