package com.KrakeDev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado cua1 = new Cuadrado();
		Cuadrado cua2 = new Cuadrado();
		Cuadrado cua3 = new Cuadrado();
		Cuadrado per1 = new Cuadrado();
		Cuadrado per2 = new Cuadrado();
		Cuadrado per3 = new Cuadrado();

		cua1.lado = 4;
		cua2.lado = 2;
		cua3.lado = 8;
		per1.lado = 5;
		per2.lado = 7;
		per3.lado = 6;
		
		double area1;
		area1 = cua1.calcularArea();
		System.out.println("Area 1: "+area1);
		double area2;
		area2 = cua2.calcularArea();
		System.out.println("Area 2: "+area2);
		double area3;
		area3 = cua1.calcularArea();
		System.out.println("Area 3: "+area3);
		// perimetro
		double perimetro1;
		perimetro1 = per1.calcularPerimetro();
		System.out.println("El perimetro 1: "+perimetro1);
		double perimetro2;
		perimetro2 = per2.calcularPerimetro();
		System.out.println("El perimetro 2: "+perimetro2);
		double perimetro3;
		perimetro3 = per3.calcularPerimetro();
		System.out.println("El perimetro 3: "+perimetro3);
		
		
		

	}

}
