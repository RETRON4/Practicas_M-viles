package com.example.eva1_11_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listVw;
    String[] aCanciones={
            "Levitate",
            "Holding on to you",
            "Heavydirtysoul",
            "Truce",
            "Trees",
            "Nico and the niners",
            "My blood",
            "The hype",
            "Polarize",
            "Ruby",
            "Oh Ms. Believer",
            "Stressed Out",
            "Ride",
            "Hometown",
            "Leave the city",
            "Neon Gravestones",
            "Pet cheetah",
            "Jumpsuit",
            "Heathens",
            "Car Radoio",
            "Kitchen Sink",


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listVw = findViewById(R.id.listVw);
        listVw.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                aCanciones
                ));
        listVw.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(this,aCanciones[i],Toast.LENGTH_SHORT).show();
    }
}