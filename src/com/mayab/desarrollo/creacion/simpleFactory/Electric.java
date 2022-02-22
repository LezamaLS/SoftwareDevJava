package com.mayab.desarrollo.creacion.simpleFactory;

public class Electric extends ProductionLine {

    Leaf create(String item){
        if(item.equals("Leaf")){
            return new Leaf();
        } else return null;
    }

}
