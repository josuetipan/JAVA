package com.emc.directorio.test;

import com.emc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi","09941234123",10);
		//----------------------------
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Número: "+telf.getNumero());
		System.out.println("Codigo: "+telf.getCodigo());

	}

}
