package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.Util;


public class TestAlarmas {

	public static void main(String[] args) {
		int valor=Util.formatearHora(2);
		String val =Util.formatearDia(0);
		Alarma al = new Alarma(val,valor,24);
		
		
		AdminAlarmas admin = new AdminAlarmas();
		
		admin.agregarAlarma(al);
		ArrayList<Alarma>alarmasActuales = admin.getAlarma();
		
		System.out.println(alarmasActuales);
		
		

	}

}
