package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Dirreccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");

        // Settear la dirección
        Dirreccion Dirreccion = new Dirreccion("Cdl del ejercito", "Pasaje 2B");
        contacto.setDireccion(Dirreccion);

        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        contacto.imprimir();
    }
}

