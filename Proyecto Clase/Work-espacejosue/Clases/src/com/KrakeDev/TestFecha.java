package com.KrakeDev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(2024,11,03);
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
		fecha1.setAnio(200); 
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		
	}

}
