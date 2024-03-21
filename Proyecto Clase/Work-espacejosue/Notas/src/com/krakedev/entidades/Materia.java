package com.krakedev.entidades;

public class Materia {
	private String codigo;
	private String nombre;
	
	
	
	
	
	
	
	
	public Materia() {
		
	}
	//-----------------
	public String getCodigo() {
		return codigo;
	}
	public Materia(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
