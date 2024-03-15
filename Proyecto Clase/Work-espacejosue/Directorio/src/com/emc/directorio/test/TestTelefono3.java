package com.emc.directorio.test;

import com.emc.directorio.entidades.AdminTelefono;
import com.emc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("movil","0987619484",10);
		Telefono tel2 = new Telefono("movil","0958860697",20);
		Telefono tel3 = new Telefono("claro","0962965764",30);
		
		AdminTelefono ad = new AdminTelefono();
		int cont;
		cont = ad.contarMovil(tel1, tel2, tel3);
		System.out.println("Cuntos movil hay?: "+cont);

	}

}
