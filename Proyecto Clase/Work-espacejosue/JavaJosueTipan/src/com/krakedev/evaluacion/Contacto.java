package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Dirreccion direccion;
	private ArrayList<Telefono> telefono = new ArrayList<Telefono>();
	


	public void agregarTelefono(Telefono telefono1) {
		if(telefono1!=null) {
			telefono.add(telefono1);

		}else {
		}
	}
	
	public void mostrarTelefonos() {
		System.out.println("Télefono con estado 'C'");
		for(int i=0;i<telefono.size();i++){
			Telefono telefonoEncontrado = telefono.get(i);
			if(telefonoEncontrado.getEstado().equalsIgnoreCase("C")) {				
				System.err.println("Número: "+telefonoEncontrado.getNumero()+", Tipo: "+telefonoEncontrado.getTipo());
			}else {
				
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> telefonos = new ArrayList<>();
		for(int i=0;i<telefono.size();i++) {
			Telefono errores = telefono.get(i);
			if(errores.getEstado().equalsIgnoreCase("E")) {
				  telefonos.add(errores);
			}
		}
		return telefonos;
	}
	
	public void imprimir() {
		System.out.println("***"+nombre+"**");
		if(direccion != null) {
			String recuperada = direccion.getCallePrincipal();
			if(recuperada.equals(direccion.getCallePrincipal()) && direccion != null && recuperada!=null) {			
				System.out.println("Dirección: "+direccion.getCallePrincipal());
			}else {
				
			}
		}else {
			System.out.println("No tiene asociada una dirección");
		}
			
	}
	
	public void imprimir1() {
		System.out.println("Informacion del Contacto");
		if(direccion != null) {
			String recuperada = direccion.getCallePrincipal();
			if(recuperada.equals(direccion.getCallePrincipal()) && direccion != null && recuperada!=null) {
				System.out.println("cedula: "+cedula);
				System.out.println("Nombre: "+nombre+" "+apellido);
				System.out.println("Dirección: ");
				System.out.println("  Calle Principal:"+direccion.getCallePrincipal());
				System.out.println("  Calle Secundaria:"+direccion.getCalleSecundaria());
			}else {
				
			}
		}else {
			System.out.println("No tiene asociada una dirección");
		}
			
	}
	
	public Contacto(String cedula, String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
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

	public Dirreccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Dirreccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
