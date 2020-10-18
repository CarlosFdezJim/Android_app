package com.example.primerarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //***********************************************************************//
        // 3) Instanciamos el Boton.
        Button ButtonMarca = findViewById(R.id.Marca);
        // 4) Añadimos el nombre al Botón.
        ButtonMarca.setText("Marca");
        // 5) Añadimos el Listener al Botón.
        ButtonMarca.setOnClickListener(listenerButton);

        //***********************************************************************//
        // 3) Instanciamos el Boton.
        Button ButtoActividad2 = findViewById(R.id.Activity2);
        // 4) Añadimos el nombre al Botón.
        ButtoActividad2.setText("Inicio");
        // 5) Añadimos el Listener al Botón.
        ButtoActividad2.setOnClickListener(listenerActivity);

        //***********************************************************************//
    }

    // 1) Declaramos el Listener del botón.
    private final View.OnClickListener listenerButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 2) Declaramos el Intent
            Intent intentButton = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marca.com"));
            startActivity(intentButton);
        }
    };
    private final View.OnClickListener listenerActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 2) Declaramos el Intent y llamamos del package dónde estamos a dónde queremos abrir
            Intent intentActivity = new Intent(MainActivity.this, Actividad2.class);
            startActivity(intentActivity);
        }

    };
}