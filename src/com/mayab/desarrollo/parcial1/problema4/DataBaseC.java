package com.mayab.desarrollo.parcial1.problema4;

public class DataBaseC extends DataBase {

	
	DataBaseC(String sentencia) {
		this.sentencia = sentencia;
	}
	
	public String ejecutarSentencia() {
		System.out.println("Ejecutando \"" + sentencia + "\"\n");
		return sentencia;
	}
	
}
