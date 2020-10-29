package com.example.equiposfutbol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listLaLiga;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.RecyclerViewID);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));


        listLaLiga = new ArrayList<String>();
        listLaLiga.add("ENTRENADOR, EQUIPO, ESTADIO");
        listLaLiga.add(" ");
        listLaLiga.add("Gaizka Garitano, Athletic Club, San Mames");
        listLaLiga.add("Diego Pablo Simeone,Atlético de Madrid, Wanda Metropolitano");
        listLaLiga.add("Jagoba Arraste, CA Osasuna, Estadio El Sadar");
        listLaLiga.add("Alvaro Cervera, Cádiz CF, Estadio Ramón de Carranza");
        listLaLiga.add("Pablo Machín, Deportivo Alavés, Estadio de Mendizorroza");
        listLaLiga.add("Jorge Almirón, Elche CF, Ciudad Deportiva Juan Ángel Romero");
        listLaLiga.add("Ronald Koeman, CF Barcelona,Camp Nou");
        listLaLiga.add("José Bordalás, Getafe CF, Coliseum Alfonso Pérez");
        listLaLiga.add("Diego Martínez Penas, Granada CF, Los Carmenes");
        listLaLiga.add("Paco López, Levante UD, Estadio Camilo Cano");
        listLaLiga.add("Manuel Pellegrinni, Real Betis, Benito Villamarín");
        listLaLiga.add("Zinedine Zidane, Real madrid, Santiago Bernabeu");
        listLaLiga.add("Imanol Alguacil, Real Sociedad, Anoeta");
        listLaLiga.add("Sergio González, Real Valladoliz CF, Estadio José Zorrilla");
        listLaLiga.add("Jose Luis Mendilibar, SD Eibar, Estadio Municipal de Ipurúa");
        listLaLiga.add("Michel, SD Huesca, El Alcoraz");
        listLaLiga.add("Julen Lopetegi, Sevilla CF");
        listLaLiga.add("Javi García, Valencia CF, Estadio de Mestalla");
        listLaLiga.add("Unai Emery, Villareal CF, Estadio de la Cerámica");

        AdapterDatos adapter = new AdapterDatos(listLaLiga);
        recycler.setAdapter(adapter);
    }

}