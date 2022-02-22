package com.mayab.desarrollo.creacion.simpleFactory;

public class PickUp extends ProductionLine{

    Auto create(String item){
        if(item.equals("Frontier")){
            return new Frontier();
        } else return null;
    }

}
