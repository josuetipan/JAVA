package com.KrakeDev;

public class Rectangulo {
	private int base;
	private int altura;
	
	public int calcularArea() {
		int area;
		area = base * altura;
		return area;
	}
	public double calcularPerimetro() {
		double base1 = (base + base);
		double altura1 = (altura + altura);
		double perimetro = base1 + altura1;
		return perimetro;
	}
	//--------
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
