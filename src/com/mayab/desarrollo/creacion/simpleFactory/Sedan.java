package com.mayab.desarrollo.creacion.simpleFactory;

public class Sedan extends ProductionLine {

    Auto create(String item){
        if(item.equals("Sentra")){
            return new Sentra();
        } else return null;
    }

}
