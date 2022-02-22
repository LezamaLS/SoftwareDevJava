package com.mayab.desarrollo.creacion.simpleFactory;

public abstract class ProductionLine {

    abstract Auto create(String item);

    public Auto ensamble(String type){

        Auto auto = this.create(type);
        System.out.println("--- Making a " + auto.getName() + " ---");

        return auto;
    }

}
