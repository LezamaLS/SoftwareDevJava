package com.mayab.desarrollo.creacion.singleton;

public class Control {

    public static void main(String[] args){

        Coordinador prof1 = new Coordinador("Alejandra", "Ciencias");
        prof1.agregarClase("16:00 - 17:30", "Ciencias");

        Coordinador prof2 = new Coordinador("Jorge", "Fisica");
        prof2.agregarClase("17:30 - 19:00", "Fisica");

        Coordinador prof3 = new Coordinador("Antonio", "SO");
        prof3.agregarClase("19:00 - 20:30", "SO");

        Horario.getInstance().imprimirHorario();

    }

}
