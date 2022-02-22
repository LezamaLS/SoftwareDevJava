package com.mayab.desarrollo.parcial1.problema3;

import java.time.LocalDateTime;

public abstract class Gas {
	protected int ammount;
	protected int rawMatA;
	protected int rawMatB;
	protected int rawMatDif;
	protected String volumeCalc;
	protected int pumpUsage;
	protected int usageHours;
	protected int packTemp;
	protected int pressurePack;
	
	
	final public void productPack() {
		initialReg();
		finalReg();
		volumeReg();
		securityReg();
		reportOutput();
	}

	
	abstract void initialReg();
	abstract void finalReg();
	private void volumeReg() {
			System.out.println("***********Reporte de Volumen***********");
			System.out.println(
					"El calculo de volumen se realiza con la formula proporcionada por el gerente de produccion utilizando: \n" + 
					"Materia Prima Inicial:" + this.rawMatA + " y " + "Materia Prima Final:" + this.rawMatB + "\n");
	}
	
	
	private void securityReg() {
		System.out.println("***********Reporte de Seguridad***********");
		System.out.println("Imprimiendo Reporte de seguridad proporcionado por el gerente de seguridad....\n");		
	}
	
	private void reportOutput() {
		
		this.rawMatDif= this.rawMatA - this.rawMatB;
		System.out.println("***********Reporte de Llenado***********");
		System.out.println("Fecha:" + LocalDateTime.now() +"\n"
				+ "Cantidad Envasada: " + this.ammount + "\n"
				+ "Material utilizado: " + this.rawMatDif + "\n\n\n"
				+ "Firma Operador: ________________________ \n\n\n"
				+ "Firma Inspector:________________________ \n");
		
	}

	

	
	
	

	
	
	
	
	

}
