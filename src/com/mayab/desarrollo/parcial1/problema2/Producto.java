package com.mayab.desarrollo.parcial1.problema2;

public class Producto {
	private String name;
	private IVASort ivaSort;
	private double precioVirgen;
	
	Producto(String name, IVASort ivaSort, double precioVirgen){
		this.name = name;
		this.ivaSort = ivaSort;
		this.precioVirgen = precioVirgen;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public IVASort getIvaSort() {
		return this.ivaSort;
	}
	
	public void setIVASort(IVASort ivaSort) {
		this.ivaSort = ivaSort;
	}
	
	public double getPrecioVirgen() {
		return this.precioVirgen;
	}
	
	public void setPrecioVirgen(float price) {
		this.precioVirgen = price;
	}
	
	public double getPrecio() {
		return ivaSort.calcularPrecio(precioVirgen, 0);
	}
	
	public double getPrecioProcesado(double descuento) {
		return ivaSort.calcularPrecio(precioVirgen, descuento);
	}
	
}
