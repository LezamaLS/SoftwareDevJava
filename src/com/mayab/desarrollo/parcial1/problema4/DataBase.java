package com.mayab.desarrollo.parcial1.problema4;

public abstract class DataBase {
	protected String sentencia;
	
	final public void persistenciaDatos() {
		
		abrirConexion();
		crearSentencia();
		ejecutarSentencia();

	}
	public void abrirConexion() {
		System.out.println("Abriendo la Conexion.....");
		System.out.println("Conexion Establecida Con Exito.\n");
	}
	
	public String crearSentencia() {
		System.out.println("Sentencia Recibida.\n");
		
		return sentencia;
	}
	
	abstract String ejecutarSentencia();
	
}