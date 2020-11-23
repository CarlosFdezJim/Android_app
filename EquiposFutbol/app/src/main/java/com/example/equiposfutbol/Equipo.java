package com.example.equiposfutbol;

public class Equipo {

    String Nombre = null;
    String Entrenador = null;
    String Estadio = null;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEntrenador() {
        return Entrenador;
    }

    public void setEntrenador(String entrenador) {
        Entrenador = entrenador;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String estadio) {
        Estadio = estadio;
    }

    public Equipo(){
        this.Nombre = null;
        this.Entrenador = null;
        this.Estadio = null;

    }

    public Equipo(String entrenador, String nombre, String estadio){
        this.Nombre = nombre;
        this.Entrenador = entrenador;
        this.Estadio = estadio;
    }


}
