package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.servicios.AdminRegistro;
import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestEliminar {

	public static void main(String[] args) {

		try {
			AdminPersonas.eliminar("1725156622");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		try {
			AdminRegistro.eliminar(1142);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		try {
			AdminTransacciones.eliminar(1245);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
}
