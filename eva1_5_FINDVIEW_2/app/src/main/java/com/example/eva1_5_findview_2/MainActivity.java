package com.example.eva1_5_findview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgVwMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // OBJ = NEW CLASS();

        //Tiene que ser despues del setContentView
        imgVwMostrar = findViewById(R.id.imgVwMostrar);
        //Ya podemos usar la imagen
        imgVwMostrar.setImageResource(R.drawable.twentyone1);
    }
}