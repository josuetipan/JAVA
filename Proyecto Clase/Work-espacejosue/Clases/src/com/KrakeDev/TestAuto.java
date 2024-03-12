package com.KrakeDev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Chevrolet",2000,800.400);
		Auto auto2 = new Auto("Nisan",1990,440.500);
		System.out.println("marca del auto 1: "+ auto1.getMarca());
		System.out.println("año del auto 1 :"+ auto1.getAnio());
		System.out.println("precio del auto 1: "+ auto1.getPrecio());
		System.out.println("--------------------------");
		System.out.println("marca del auto 2: "+ auto2.getMarca());
		System.out.println("año marca del auto 2: "+ auto2.getAnio());
		System.out.println("precio marca del auto 2: "+ auto2.getMarca());
	}

}
