package com.mayab.desarrollo.parcial1.problema4;

public class DataBaseB extends DataBase {

	
	DataBaseB(String sentencia) {
		this.sentencia = sentencia;
	}
	
	public String ejecutarSentencia() {
		this.sentencia = sentencia.toLowerCase();
		System.out.println("Ejecutando \"" + sentencia + "\"\n");
		return sentencia;
	}

}
