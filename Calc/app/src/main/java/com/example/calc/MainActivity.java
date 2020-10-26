package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Mostrar;
    String Operador;
    String Reserva;
    double Resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txt1 = findViewById(R.id.textView1);
        final TextView txt2 = findViewById(R.id.textView2);

        final Button botonSumar = findViewById(R.id.buttonSumar);
        final Button botonRestar = findViewById(R.id.buttonRestar);
        final Button botonDividir = findViewById(R.id.buttonDividir);
        final Button botonMultiplicar = findViewById(R.id.buttonMultiplicar);
        final Button botonPorciento = findViewById(R.id.buttonPorCiento);
        final Button botonIgual = findViewById(R.id.buttonIgual);
        final Button botonMasMenos = findViewById(R.id.buttonMasMenos);
        //final Button botonBorrar = findViewById(R.id.buttonBorrar);


        final Button botonPunto = findViewById(R.id.buttonPunto);
        final Button botonC = findViewById(R.id.buttonC);
        final Button boton00 = findViewById(R.id.button00);
        final Button boton0 = findViewById(R.id.button0);
        final Button boton1 = findViewById(R.id.button1);
        final Button boton2 = findViewById(R.id.button2);
        final Button boton3 = findViewById(R.id.button3);
        final Button boton4 = findViewById(R.id.button4);
        final Button boton5 = findViewById(R.id.button5);
        final Button boton6 = findViewById(R.id.button6);
        final Button boton7 = findViewById(R.id.button7);
        final Button boton8 = findViewById(R.id.button8);
        final Button boton9 = findViewById(R.id.button9);

        //Toast.makeText(this,"No se puede dividir entre 0", Toast.LENGTH_SHORT).show();

        botonMasMenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Double cambio;
                //Reserva = txt2.getText().toString();
                cambio = Double.parseDouble(txt2.getText().toString());
                if( cambio > 0) {
                    cambio = cambio - (cambio * 2);
                    txt2.setText(String.valueOf(cambio));
                    //txt2.setText(cambio);
                }else{
                    cambio = cambio + (cambio * 2);
                    txt2.setText(String.valueOf(cambio));
                    //txt2.setText(cambio);
                }
            }
        });

        botonPorciento.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Reserva = txt2.getText().toString();
                Operador = "%";
                Resultado = (Double.parseDouble(Reserva) / 100);
                txt2.setText("");
                txt2.setText(String.valueOf(Resultado));

            }
        });

        botonSumar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Reserva = txt2.getText().toString();
                Operador = "+";
                txt1.setText(Reserva + " " + Operador);
                txt2.setText("");
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Reserva = txt2.getText().toString();
                Operador = "-";
                txt1.setText(Reserva + " " + Operador);
                txt2.setText("");
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Reserva = txt2.getText().toString();
                Operador = "/";
                txt1.setText(Reserva + " " + Operador);
                txt2.setText("");
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Reserva = txt2.getText().toString();
                Operador = "*";
                txt1.setText(Reserva + " " + Operador);
                txt2.setText("");
            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "1";

                if(Operador.equals("-")){
                    Resultado = Double.parseDouble(Reserva) - Double.parseDouble(txt2.getText().toString());
                    txt2.setText(String.valueOf(Resultado));
                }
                if(Operador.equals("+")){
                    Resultado = Double.parseDouble(Reserva) + Double.parseDouble(txt2.getText().toString());
                    txt2.setText(String.valueOf(Resultado));
                }
                if(Operador.equals("/")){
                    Resultado = Double.parseDouble(Reserva) / Double.parseDouble(txt2.getText().toString());
                    txt2.setText(String.valueOf(Resultado));
                }
                if(Operador.equals("*")){
                    Resultado = Double.parseDouble(Reserva) * Double.parseDouble(txt2.getText().toString());
                    txt2.setText(String.valueOf(Resultado));
                }
                txt1.setText("");
            }
        });

        botonPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + ".";
                txt2.setText(Mostrar);
            }
        });

        botonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Mostrar = "";
                txt1.setText(Mostrar);
                txt2.setText(Mostrar);
                Reserva = "";
                Operador = "";
            }
        });

        boton00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "00";
                txt2.setText(Mostrar);
            }
        });

        boton0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "0";
                txt2.setText(Mostrar);
            }
        });


        boton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "1";
                txt2.setText(Mostrar);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "2";
                txt2.setText(Mostrar);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "3";
                txt2.setText(Mostrar);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "4";
                txt2.setText(Mostrar);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "5";
                txt2.setText(Mostrar);
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "6";
                txt2.setText(Mostrar);
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "7";
                txt2.setText(Mostrar);
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "8";
                txt2.setText(Mostrar);
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Mostrar = txt2.getText().toString();
                Mostrar = Mostrar + "9";
                txt2.setText(Mostrar);
            }
        });
    }

}