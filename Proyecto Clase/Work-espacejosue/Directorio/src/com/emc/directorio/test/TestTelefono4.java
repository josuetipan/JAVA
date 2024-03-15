package com.emc.directorio.test;

import com.emc.directorio.entidades.AdminTelefono;
import com.emc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("claro","0987619484",10);
		Telefono tel2 = new Telefono("claro","0958860697",10);
		Telefono tel3 = new Telefono("claro","0962965764",10);
		Telefono tel4 = new Telefono("movil","0984294576",10);
		
		AdminTelefono ad = new AdminTelefono();
		int cont = ad.contarClaro(tel1, tel2, tel3, tel4);
		System.out.println("Cuantos telefonos con la operadora Claro existen: "+cont);
		

	}

}
