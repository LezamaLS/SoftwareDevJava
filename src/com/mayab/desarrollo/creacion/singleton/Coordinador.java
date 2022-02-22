package com.mayab.desarrollo.creacion.singleton;

public class Coordinador {

    public String nombre;
    public String materia;

    public Coordinador(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    public void agregarClase(String hora, String materia){
        Horario.getInstance().agregarClase(hora, materia);
    }

}
