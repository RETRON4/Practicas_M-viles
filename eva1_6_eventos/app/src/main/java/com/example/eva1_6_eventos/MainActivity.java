package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    // OnClickListener
implements View.OnClickListener {

    Button btnListener, btnAnonimo, btnClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);

        btnAnonimo = findViewById(R.id.btnAnonimo);
        btnAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Evento por clase anonima", Toast.LENGTH_LONG).show();
            }
        });

        MiClaseOnClick objClick = new MiClaseOnClick();
        objClick.setContext(this);
        btnClase = findViewById(R.id.btnClase);
        btnClase.setOnClickListener(objClick);


    }
    //Usando la propiedad android:onclick del Widget
    //  public void NOMBREDELMETODO(view arg){}

    public void clickBtn (View arg){
    //MOSTRAR MENSAJE (TOAST)
        Toast.makeText( this,  "Evento por OnClick XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText( this,  "EVENTO POR LISTENER", Toast.LENGTH_LONG).show();
    }


}

