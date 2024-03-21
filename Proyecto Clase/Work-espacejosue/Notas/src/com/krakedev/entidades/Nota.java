package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	//metodos
	public void mostrar() {
		System.out.println("Materia"+materia.getCodigo());
		System.out.println("Calficicacion1="+calificacion);
		
	}
	
	
	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}

	public Nota() {
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	



	//-------------------
	
	
	
}
