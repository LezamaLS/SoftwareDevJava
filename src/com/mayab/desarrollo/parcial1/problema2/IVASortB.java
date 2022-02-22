package com.mayab.desarrollo.parcial1.problema2;

public class IVASortB implements IVASort {

	public String getType() {
		return "El IVA es del tipo B";
	}

	public double calcularPrecio(double cantidad, double descuento) {
		return (cantidad + (0.08 * cantidad) - (descuento * cantidad) + (.02 * cantidad));
	}

}
