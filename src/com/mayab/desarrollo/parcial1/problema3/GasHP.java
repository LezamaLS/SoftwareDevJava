package com.mayab.desarrollo.parcial1.problema3;

public class GasHP extends Gas{
	
	GasHP(int ammount, int pumpUsage,int usageHours, int rawMatA, int rawMatB, int packTemp, int pressurePack){
		this.ammount = ammount;
		this.pumpUsage = pumpUsage;
		this.usageHours = usageHours;
		this.rawMatA = rawMatA;
		this.rawMatB = rawMatB;
		this.packTemp = packTemp;
		this.pressurePack = pressurePack;
		
	};
	
	
	public void initialReg() {
		System.out.println("***********Reporte Inicial***********");
		System.out.println(
				"Uso de bomba: " + this.pumpUsage + " litros.\n" +
				"Horas de uso: " + this.usageHours + " Horas\n" + 
				"Materia Prima Inicial (cantidad): " + this.rawMatA + "\n");

		
	};
	public void finalReg() {
		System.out.println("***********Reporte Final***********");
		System.out.println(
				"Materia Prima Final (cantidad): " + this.rawMatB + "\n" + 
				"Temperatura Final del envase: " + this.packTemp + " grados.\n" + 
				"Presion Final del Envase: " + this.pressurePack + "PSI\n");
		
	};

}
