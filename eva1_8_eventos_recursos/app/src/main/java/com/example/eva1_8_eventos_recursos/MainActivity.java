package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener
{


    TextView txtNombre,txtApellido;
    EditText edTxtNombre,edTxtApellido;
    RadioGroup rdgIdioma;
    RadioButton rdbEsp, rdbIng;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        edTxtNombre = findViewById(R.id.edTxtNombre);
        edTxtApellido = findViewById(R.id.edTxtApellido);
        rdgIdioma = findViewById(R.id.rdgIdioma);
        rdbEsp = findViewById(R.id.rBtnEsp);
        rdbIng = findViewById(R.id.rBtnIng);
        rdgIdioma.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
    if(i == R.id.rBtnEsp){
        txtNombre.setText(R.string.txt_vw_nom);
        txtApellido.setText(R.string.txt_vw_Apellido);
        edTxtNombre.setHint(R.string.edtxt_nom);
        edTxtApellido.setHint(R.string.edtxt_Apellido);
        rdbEsp.setText(R.string.rd_btn_esp);
        rdbIng.setText(R.string.rd_btn_ing);
    }else{
        txtNombre.setText(R.string.txt_vw_nom_en);
        txtApellido.setText(R.string.txt_vw_Apellido_en);
        edTxtNombre.setHint(R.string.edtxt_nom_en);
        edTxtApellido.setHint(R.string.edtxt_Apellido_en);
        rdbEsp.setText(R.string.rd_btn_en);
        rdbIng.setText(R.string.rd_btn_ing_en);

    }
    }
}