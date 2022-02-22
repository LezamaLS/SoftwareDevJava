package com.mayab.desarrollo.parcial1.problema3;

public class DriverGas {

	public static void main(String[] args) {
		
		
		Gas gas = new GasHP(10, 200, 5, 500, 450, 10, 134);
		gas.productPack();
		
		gas = new GasLiquid(15, 1500, 1430);
		gas.productPack();
		
		gas = new GasAcetylene(4, 690, 586);
		gas.productPack();
		
		
	}
	
}
