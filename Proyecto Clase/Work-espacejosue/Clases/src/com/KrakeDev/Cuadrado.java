package com.KrakeDev;

public class Cuadrado {
	public int lado;
	public double calcularArea () {
		double areaC = Math.pow(lado, 2);
		return areaC;
	}
	public double calcularPerimetro() {
		double perimetro = lado * 3; 
		return perimetro;
	}
	
}
