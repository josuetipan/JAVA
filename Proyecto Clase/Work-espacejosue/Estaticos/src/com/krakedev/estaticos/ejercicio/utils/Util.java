package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static int formatearHora(int numero ) {
		int valor = 0;
		if(numero<10){
			valor =  0+numero;
		}else {
			valor = numero;
		}
		return valor;
	}
	
	public static String formatearDia(int numero) {
		String lun = null;
		if(numero == DiasSemana.LUNES) {
			lun = "Lunes";
		}else if(numero == DiasSemana.MARTES) {
			lun = "Martes";
		}else if(numero == DiasSemana.MIERCOLES) {
			lun = "Miercoles";
		}else if(numero == DiasSemana.JUEVES) {
			lun = "Jueves";
		}else if(numero == DiasSemana.VIERNES) {
			lun = "Viernes";
		}else if(numero == DiasSemana.SABADO) {
			lun = "Sabado";
		}else if(numero == DiasSemana.DOMIENTO) {
			lun = "Domingo";
		}
		return lun;
	}
}
