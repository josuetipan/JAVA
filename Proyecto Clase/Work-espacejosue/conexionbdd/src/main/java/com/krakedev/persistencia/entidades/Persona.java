package com.krakedev.persistencia.entidades;

public class Persona {

		private Compras cedula;
		private String nombre;
		private String apellido;
		
		public Persona() {
			
		}
		
		public Persona(Compras cedula, String nombre, String apellido) {
			super();
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
		}
		public Compras getCedula() {
			return cedula;
		}
		public void setCedula(Compras cedula) {
			this.cedula = cedula;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		@Override
		public String toString() {
			return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
		}
		
		
		
		
}
