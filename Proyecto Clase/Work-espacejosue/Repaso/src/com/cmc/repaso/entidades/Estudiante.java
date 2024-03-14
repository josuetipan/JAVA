package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultao;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(int nota) {
		this.nota = nota;
		if(nota <8) {
			setResultao("F");
		}else if(nota >= 8){
			setResultao("A");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getResultao() {
		return resultao;
	}
	public void setResultao(String resultao) {
		this.resultao = resultao;
	}
	
	
}
