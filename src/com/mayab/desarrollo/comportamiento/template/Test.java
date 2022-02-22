package com.mayab.desarrollo.comportamiento.template;

public abstract class Test {
	
	final void executeTest() {
		setUp();
		run();
		verify();
		tearDown();
		
	}
	
	abstract void run();
	
	abstract void verify();
	
	public void setUp() {
		System.out.println("Creando conexion a base de datos...");
	}
	
	public void tearDown() {
		System.out.println("Cerrando conexion a base de datos...");
	}
	

}
