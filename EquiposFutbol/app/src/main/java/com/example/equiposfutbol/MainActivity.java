package com.example.equiposfutbol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    Equipo equipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Equipo> listLaLiga = new ArrayList<Equipo>();

        Equipo equipo1 = new Equipo("Gaizka Garitano", "Athletic Club", "San Mames");
        listLaLiga.add(equipo1);
        Equipo equipo2 = new Equipo("Diego Pablo Simeone" ,"Atlético de Madrid","Wanda Metropolitano");
        listLaLiga.add(equipo2);
        Equipo equipo3 = new Equipo("Jagoba Arraste" ,"CA Osasuna","Estadio El Sadar");
        listLaLiga.add(equipo3);
        Equipo equipo4 = new Equipo("Alvaro Cervera" ,"Cádiz CF","Estadio Ramón de Carranza");
        listLaLiga.add(equipo4);
        Equipo equipo5 = new Equipo("Pablo Machín" ,"Deportivo Alavés","Estadio de Mendizorroza");

        //Iniciación RecycleView
        recycler = (RecyclerView) findViewById(R.id.RecyclerViewID);
        recycler.setHasFixedSize(false);

        //Crear Adaptador, pasándole los datos
        AdapterDatos adapter = new AdapterDatos(listLaLiga);
        recycler.setAdapter(adapter);

        //Fija un Layout linear al recycleView
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }

    public ArrayList DataBase(){

        ArrayList<Equipo> listLaLiga = new ArrayList<Equipo>();

        Equipo equipo1 = new Equipo("Gaizka Garitano", "Athletic Club", "San Mames");
        listLaLiga.add(equipo1);
        Equipo equipo2 = new Equipo("Diego Pablo Simeone" ,"Atlético de Madrid","Wanda Metropolitano");
        listLaLiga.add(equipo2);
        Equipo equipo3 = new Equipo("Jagoba Arraste" ,"CA Osasuna","Estadio El Sadar");
        listLaLiga.add(equipo3);
        Equipo equipo4 = new Equipo("Alvaro Cervera" ,"Cádiz CF","Estadio Ramón de Carranza");
        listLaLiga.add(equipo4);
        Equipo equipo5 = new Equipo("Pablo Machín" ,"Deportivo Alavés","Estadio de Mendizorroza");
        listLaLiga.add(equipo5);
        Equipo equipo6 = new Equipo("Jorge Almirón" ,"Elche CF","Ciudad Deportiva Juan Ángel Romero");
        listLaLiga.add(equipo6);
        Equipo equipo7 = new Equipo("Ronald Koeman" ,"FC Barcelona","Camp Nou");
        listLaLiga.add(equipo7);
        Equipo equipo8 = new Equipo("José Bordalás" ,"Getafe CF","Coliseum Alfonso Pérez");
        listLaLiga.add(equipo8);
        Equipo equipo9 = new Equipo("Diego Martínez Penas" ,"Granada CF","Los Carmenes");
        listLaLiga.add(equipo9);
        Equipo equipo10 = new Equipo("Paco López" ,"Levante UD","Estadio Camilo Cano");
        listLaLiga.add(equipo10);
        Equipo equipo11 = new Equipo("Manuel Pellegrinni" ,"Real Betis Balompie","Benito Villamarín");
        listLaLiga.add(equipo11);
        Equipo equipo12 = new Equipo("Zinedine Zidane" ,"Real madrid CF","Santiago Bernabeu");
        listLaLiga.add(equipo12);
        Equipo equipo13 = new Equipo("Imanol Alguacil" ,"Real Sociedad","Anoeta");
        listLaLiga.add(equipo13);
        Equipo equipo14 = new Equipo("Sergio González" ,"Real Valladoliz CF","Estadio José Zorrilla");
        listLaLiga.add(equipo14);
        Equipo equipo15 = new Equipo("Jose Luis Mendilibar" ,"SD Eibar","Estadio Municipal de Ipurúa");
        listLaLiga.add(equipo15);
        Equipo equipo16 = new Equipo("Michel" ,"SD Huesca","El Alcoraz");
        listLaLiga.add(equipo16);
        Equipo equipo17 = new Equipo("Julen Lopetegi" ,", Sevilla CF","Estadio Sánchez Pizjuan");
        listLaLiga.add(equipo17);
        Equipo equipo18 = new Equipo("Javi García" ,"Valencia CF","Estadio de Mestalla");
        listLaLiga.add(equipo18);
        Equipo equipo19 = new Equipo("Unai Emery" ,"Villareal CF","Estadio de la Cerámica");
        listLaLiga.add(equipo19);

        return listLaLiga;
    }
}