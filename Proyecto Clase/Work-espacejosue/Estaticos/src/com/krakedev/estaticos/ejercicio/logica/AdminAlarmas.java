package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarma = new ArrayList<Alarma> ();

	public ArrayList<Alarma> getAlarma() {
		return alarma;
	}
	
	
	public void agregarAlarma(Alarma valor) {
		alarma.add(valor);
		
	}
	
	
	
	
	
	
	
	
	
	
} 
