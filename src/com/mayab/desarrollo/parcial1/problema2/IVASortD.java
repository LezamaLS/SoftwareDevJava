package com.mayab.desarrollo.parcial1.problema2;

public class IVASortD implements IVASort {

	public String getType() {
		return "El IVA es del tipo B";
	}


	public double calcularPrecio(double cantidad, double descuento) {
		return (cantidad - (descuento * cantidad) + (.02 * cantidad));
	}

}
