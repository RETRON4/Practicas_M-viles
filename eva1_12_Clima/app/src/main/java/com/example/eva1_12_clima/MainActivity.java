package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] climaCiudad  = {
            new Clima(R.drawable.sunny,"Chihuahua",28, "Despejado con viento"),
            new Clima(R.drawable.cloudy,"Trost",21, "riko"),
            new Clima(R.drawable.rainy,"Delicias",22, "Dfakiu"),
            new Clima(R.drawable.thunderstorm,"Juarez",25, "ciudad fea unu"),
            new Clima(R.drawable.tornado,"Nueva York",16, "the end of the fucking world niggas"),
            new Clima(R.drawable.atmospher,"Madera",19, "oh yeah"),
            new Clima(R.drawable.sunny,"Creel",15, "LA SIERRONGA"),
            new Clima(R.drawable.rainy,"Londres",10, "ahi woa vivir uwu"),
            new Clima(R.drawable.rainy,"Dema",12, "Shet Motherfucker"),
            new Clima(R.drawable.light_rain,"Ahumada",45, "feo uwu"),



    };

ListView lstVwClima;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstViewClima);
        lstVwClima.setAdapter(new clima_adaptador(this,R.layout.mi_lista_clima,climaCiudad));
    }
}

