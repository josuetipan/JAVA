package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Josue");
		estudiante.calificar(2);
		System.out.println("El estudiante: "+estudiante.getNombre());
		System.out.println("Tiene como nota un: "+ estudiante.getResultao());

	}

}
