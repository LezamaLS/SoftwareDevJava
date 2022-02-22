package com.mayab.desarrollo.parcial1.problema3;

public class GasAcetylene extends Gas{
	
	GasAcetylene(int ammount, int rawMatA, int rawMatB){
		this.ammount = ammount;
		this.rawMatA = rawMatA;
		this.rawMatB = rawMatB;
		
	};
	
	
	public void initialReg() {
		System.out.println("***********Reporte Inicial***********");
		System.out.println(
				"Materia Prima Inicial : " + this.rawMatA + " tambores.\n");

		
	};
	public void finalReg() {
		System.out.println("***********Reporte Final***********");
		System.out.println(
				"Materia Prima Final : " + this.rawMatB + " tambores.\n");
		
	};
	

}