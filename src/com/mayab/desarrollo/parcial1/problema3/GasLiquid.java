package com.mayab.desarrollo.parcial1.problema3;

public class GasLiquid extends Gas{
	
	GasLiquid(int ammount, int rawMatA, int rawMatB){
		this.ammount = ammount;
		this.rawMatA = rawMatA;
		this.rawMatB = rawMatB;
		
	};
	
	
	public void initialReg() {
		System.out.println("***********Reporte Inicial***********");
		System.out.println(
				"Materia Prima Inicial (cantidad): " + this.rawMatA + "\n");

		
	};
	public void finalReg() {
		System.out.println("***********Reporte Final***********");
		System.out.println(
				"Materia Prima Final (cantidad): " + this.rawMatB + "\n");
		
	};

}