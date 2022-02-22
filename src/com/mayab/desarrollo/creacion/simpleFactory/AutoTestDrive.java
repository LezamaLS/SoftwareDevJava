package com.mayab.desarrollo.creacion.simpleFactory;

public class AutoTestDrive {

    public static void main(String[] args){
        ProductionLine electric = new Electric();
        ProductionLine pickUp = new PickUp();
        ProductionLine sedan = new Sedan();

        Auto auto = electric.ensamble("Leaf");
        System.out.println("Lezama ordered a " + auto.getName() + "\n");

        Auto auto2 = pickUp.ensamble("Frontier");
        System.out.println("Lezama ordered a " + auto2.getName() + "\n");

        Auto auto3 = sedan.ensamble("Sentra");
        System.out.println("Lezama ordered a " + auto3.getName() + "\n");
    }
}
