package com.emc.directorio.test;

import com.emc.directorio.entidades.Contacto;
import com.emc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movil","098761948",10);
		Contacto c = new Contacto("Josue","Tipan",telef,5.5);
		System.out.println("Dato: "+c.getNombre()+" "+c.getApellido()+" "+telef.getOperadora()+" "+c.getPeso());

	}

}
