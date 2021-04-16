package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Eventos Onclick
    public void onClickCDSistema(View v){

        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo android")
                .setMessage("Que pedo GENTEEEEEEEEEEEEE")
                .setPositiveButton("Tatakae",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton TATAKAE",Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton(
                        "Tatakae",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton Alianza",Toast.LENGTH_SHORT).show();
                            }
                        }
                )
                .setNeutralButton("Tatakae",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton Jeager",Toast.LENGTH_SHORT).show();
                            }
                        }).show();

    }
    public void onClickCDCustom(View v){
        Dialog dlgMiCuadroDialogo = new Dialog(this);

        dlgMiCuadroDialogo.setContentView(R.layout.cuadrodialogo);

        TextView txtVwTitu;
        EditText edtTextDatos;
        Button btnAccion;
        txtVwTitu = dlgMiCuadroDialogo.findViewById(R.id.txtTitulo);
        edtTextDatos = dlgMiCuadroDialogo.findViewById(R.id.edtMensaje);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnOk);
        txtVwTitu.setText("este es un cuadro de dialogo personalizado");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),edtTextDatos.getText().toString(),Toast.LENGTH_SHORT).show();
                        dlgMiCuadroDialogo.dismiss();
                    }
                }
        );
        dlgMiCuadroDialogo.show();
    }
}