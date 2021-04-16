package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        RadioGroup rgSNK;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgSNK = findViewById(R.id.rgSNK);
// Asignar el Listener

        rgSNK.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override       // Rdgrp que genera el evento, ID del radiobutton seleccionado
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
            // Toast indicado cual radiobutton fue seleccionado
                /*switch (i){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(),"Mikasa",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(),"Levi",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(),"Eren",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(),"Armin",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(getApplicationContext(),"Erwin",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton6:
                        Toast.makeText(getApplicationContext(),"Jean",Toast.LENGTH_SHORT).show();
                        break;
                    default:

                }*/

                RadioButton rdBtnSel;
                rdBtnSel = findViewById(i);
                Toast.makeText(getApplicationContext(),rdBtnSel.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}