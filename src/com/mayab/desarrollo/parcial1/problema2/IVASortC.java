package com.mayab.desarrollo.parcial1.problema2;

public class IVASortC implements IVASort {

	public String getType() {
		return "El IVA es del tipo C";
	}

	public double calcularPrecio(double cantidad, double descuento) {
		return (cantidad - (descuento * cantidad));
	}

}
