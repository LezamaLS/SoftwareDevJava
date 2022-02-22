package com.mayab.desarrollo.parcial1.problema4;

public class DataBaseA extends DataBase {
		
	DataBaseA(String sentencia) {
		this.sentencia = sentencia;
	}

	public String ejecutarSentencia() {
		this.sentencia = sentencia.toUpperCase();
		System.out.println("Ejecutando \"" + sentencia + "\"\n");
		return sentencia;
	}

	
}
