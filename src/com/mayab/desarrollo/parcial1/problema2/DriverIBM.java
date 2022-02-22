package com.mayab.desarrollo.parcial1.problema2;

public class DriverIBM {

	public static void main(String[] args) {
		
		System.out.println("***********Inicio De La Simulacion***********");
		Producto producto = new Producto("Playera Manga Corta", new IVASortA(), 233.59);
		System.out.println("En este producto aplica el IVA A\n");
		System.out.println(producto.getName() + ": " + producto.getPrecio() + "\n");
		
		
		System.out.println("*********************************************");
		producto.setIVASort(new IVASortB());
		System.out.println("En este producto aplica el IVA B\n");
		System.out.println(producto.getName() + ": " + producto.getPrecio() + "\n");
		
		
		System.out.println("*********************************************");
		producto.setIVASort(new IVASortC());
		System.out.println("En este producto aplica el IVA C\n");
		System.out.println(producto.getName() + ": " + producto.getPrecio() + "\n");
		
		
		System.out.println("*********************************************");
		producto.setIVASort(new IVASortD());
		System.out.println("En este producto aplica el IVA D\n");
		System.out.println(producto.getName() + ": " + producto.getPrecio() + "\n");
		
		
		System.out.println("*********************************************");
		System.out.println("En este producto aplica el IVA A y descuento\n");
		System.out.println(producto.getName() + ": " + producto.getPrecioProcesado(0.05) + "\n");
		
		
		System.out.println("*********************************************");
		producto.setIVASort(new IVASortB());
		System.out.println("En este producto aplica el IVA B y descuento\n");
		System.out.println(producto.getName() + ": " + producto.getPrecioProcesado(0.05) + "\n");
		
		
		System.out.println("*********************************************");
		producto.setIVASort(new IVASortC());
		System.out.println("En este producto aplica el IVA C y descuento\n");
		System.out.println(producto.getName() + ": " + producto.getPrecioProcesado(0.05) + "\n");
		
		
		System.out.println("*********************************************");
		producto.setIVASort(new IVASortD());
		System.out.println("En este producto aplica el IVA D y descuento\n");
		System.out.println(producto.getName() + ": " + producto.getPrecioProcesado(0.05) + "\n");
		
		
		System.out.println("************Fin De La Simulacion*************");
	}

}
