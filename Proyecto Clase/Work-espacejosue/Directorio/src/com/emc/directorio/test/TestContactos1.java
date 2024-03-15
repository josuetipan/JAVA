package com.emc.directorio.test;

import com.emc.directorio.entidades.AdminContactos;
import com.emc.directorio.entidades.Contacto;
import com.emc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("movi","0987619484",10);
		Telefono tel2 = new Telefono("movi","0987619484",10);
		Contacto con1 = new Contacto("Josue","Tipan",tel1,10.5);
		Contacto con2 = new Contacto("Tatiana","Vazques",tel2,20.5);
		AdminContactos ad = new AdminContactos();
		double resu = ad.buscarMasPesado(con1, con2);
		if(resu == 0) {
			System.out.println("Son iguales");
		}else {
			System.out.println("El el mayor peso es de: "+resu);
		}
		
		boolean res = ad.compararOperadoras(con1, con2);
		if (res == true) {
			System.out.println("Los dos pertenecen a la misma operadora");
		}else {
			System.out.println("Son diferentes");
		}
		 
	}

}
