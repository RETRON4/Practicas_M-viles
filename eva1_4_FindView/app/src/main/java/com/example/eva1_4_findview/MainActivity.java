package com.example.eva1_4_findview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Falta conectar la variable
         txtView = (TextView) findViewById(R.id.txtView);
        txtView.setText("Hola Mundo Cruel!");
    }
}