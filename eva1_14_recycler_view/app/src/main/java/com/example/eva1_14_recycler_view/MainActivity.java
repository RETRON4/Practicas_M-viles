package com.example.eva1_14_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcVwLista;
    String[] aDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aDatos = new String[100];
        for(int j = 0; j<100; j++){
            aDatos[j] = "Elemento numero: "+j;
        }
        rcVwLista = findViewById(R.id.rcVwLista);
        rcVwLista.setAdapter(new MiAdaptador(aDatos));
        rcVwLista.setLayoutManager(new LinearLayoutManager(this));
       // rcVwLista.setLayoutManager(new GridLayoutManager(this,2));
    }


}