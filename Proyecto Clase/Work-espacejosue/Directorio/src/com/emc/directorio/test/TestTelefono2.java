package com.emc.directorio.test;

import com.emc.directorio.entidades.AdminTelefono;
import com.emc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movil","098234234",20);
		AdminTelefono at = new AdminTelefono();
		//--------------------------------
		at.activarMensajeria(telf);
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Número: "+telf.getNumero());
		System.out.println("Codigo: "+telf.getCodigo());
		System.out.println("Tiene Whatssap?: "+telf.isTieneWhatsapp());
	}

}
