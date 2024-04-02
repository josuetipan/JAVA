package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Registro {
	private int codigo_registro;
	private String cedula_empleado;
	private Date fecha;
	private Date hora;
	
	public Registro() {
		
	}
	
	public Registro(int codigo_registro, String cedula_empleado) {
		super();
		this.codigo_registro = codigo_registro;
		this.cedula_empleado = cedula_empleado;
		
	}
	
	public Registro(int codigo_registro, String cedula_empleado, Date fecha, Date hora) {
		super();
		this.codigo_registro = codigo_registro;
		this.cedula_empleado = cedula_empleado;
		this.fecha = fecha;
		this.hora = hora;
	}
	public int getCodigo_registro() {
		return codigo_registro;
	}
	public void setCodigo_registro(int codigo_registro) {
		this.codigo_registro = codigo_registro;
	}
	public String getCedula_empleado() {
		return cedula_empleado;
	}
	public void setCedula_empleado(String cedula_empleado) {
		this.cedula_empleado = cedula_empleado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Registro [codigo_registro=" + codigo_registro + ", cedula_empleado=" + cedula_empleado + ", fecha="
				+ fecha + ", hora=" + hora + "]";
	}
	
	
	
	
	
}
