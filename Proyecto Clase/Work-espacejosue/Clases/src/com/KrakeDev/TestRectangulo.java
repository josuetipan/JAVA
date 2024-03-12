package com.KrakeDev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p1 = new Rectangulo();
		
		int area;
		r1.setBase(10);
		r1.setAltura(5);
		area = r1.calcularArea();
		
		int area2;
		r2.setBase(8);
		r2.setAltura(3);
		area2 = r2.calcularArea();
		System.out.println("Area de r1: "+area);
		System.out.println("Area de r2: "+area2);
		
		double perimetro;
		p1.setAltura(2); 
		p1.setBase(4); 
		perimetro = p1.calcularPerimetro();
		System.out.println("Area de p1: "+perimetro);
		
		
		

	}

}
