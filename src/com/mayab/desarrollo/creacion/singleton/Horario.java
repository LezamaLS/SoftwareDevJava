package com.mayab.desarrollo.creacion.singleton;

import java.util.HashMap;
import java.util.Map;

public class Horario {

    private static Horario uniqueInstance = null;
    private HashMap<String, String> horario = new HashMap<String, String>();

    private Horario() {
    }

    public static Horario getInstance(){
        if (uniqueInstance == null){
            System.out.println("Creando unique instance del Horario");
            uniqueInstance = new Horario();
        }
        System.out.println("Returning unique instance del Horario");
        return uniqueInstance;
    }

    public void agregarClase(String hora, String materia){
        horario.put(hora, materia);
    }

    public void verificarHorario(){
        //TODO
    }

    public void imprimirHorario() {
        System.out.println();
        for (Map.Entry print : horario.entrySet()) {
            System.out.format("%20s%20s", " | Hora: " + print.getKey() + " | ", print.getValue() + " | \n");
        }
    }

}
