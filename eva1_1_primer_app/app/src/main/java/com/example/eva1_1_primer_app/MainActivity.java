/*
 Instituto Tecnologico de Chihuahua II
 Practica 1: primer app
 Proyecto: eva1_1_primer_app
 Autor: Hiram Quintero
*/
package com.example.eva1_1_primer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Ciclo de vida de la app

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}