package com.mayab.desarrollo.parcial1.problema2;

public class IVASortA implements IVASort {

	public String getType() {
		return "El IVA es del tipo A";
	}

	public double calcularPrecio(double cantidad, double descuento) {
		return (cantidad + (0.16 * cantidad) - (descuento * cantidad));
	}

}
