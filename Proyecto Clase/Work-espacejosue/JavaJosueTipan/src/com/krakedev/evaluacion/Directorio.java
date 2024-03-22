package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();;
	private Date FechaModificacion = new Date();
	private ArrayList<Contacto> correcto = new ArrayList<Contacto>();
	private ArrayList<Contacto> incorrecto = new ArrayList<Contacto>();
	
	
	public void depurar() {
		for(int i = 0;i<contactos.size();i++) {
			Contacto encontrado = contactos.get(i);
			if(encontrado.getDireccion()!=null) {
				correcto.add(encontrado);
			}else if(encontrado.getDireccion()==null) {
				incorrecto.add(encontrado);
			}
		}
	}
	
	
	//--------
	
	public ArrayList<Contacto> getCorrecto() {
		return correcto;
	}


	public void setCorrecto(ArrayList<Contacto> correcto) {
		this.correcto = correcto;
	}


	public ArrayList<Contacto> getIncorrecto() {
		return incorrecto;
	}


	public void setIncorrecto(ArrayList<Contacto> incorrecto) {
		this.incorrecto = incorrecto;
	}


	public int contarFijos() {
		int contador = 1;
		for (int i = 0;i<contactos.getFirst().getTelefono().size();i++) {
			Contacto encontrado = contactos.get(i);
			if(encontrado.getTelefono().getLast().getTipo().equals("Convencional") && encontrado.getTelefono().getLast().getEstado().equals("C")) {
				contador+=1;
			}
		}
		return contador;
	}
	
	
	public int contarPerdidos() {
		int contador = 0;
		for (int i = 0;i<contactos.size();i++) {
			Contacto encontrado = contactos.get(i);
			if(encontrado.getDireccion()==null) {
				contador+=1;
			}
		}
		return contador;
	}
	
	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		 String nueva =formato.format(FechaModificacion);
		 return nueva;
	}
	
	
	public boolean agregarContacto(Contacto cont) {
		boolean listo = false;
		Contacto nuevo =buscarPorCedula(cont.getCedula());
		if(nuevo==null) {
			contactos.add(cont);
			listo = true;
		}else {
			
		}		
		return listo;
		}
	public Contacto buscarPorCedula(String cedula) {
		
		Contacto encontradoContacto=null;
		for(int i=0;i<contactos.size();i++) {
			Contacto cedulaEncontrada = contactos.get(i);
			if(cedulaEncontrada.getCedula().equals(cedula)) {
				encontradoContacto = cedulaEncontrada;
			}else {
				
			}
		}
		return encontradoContacto;
	}
	
	
	//----------
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public Date getFechaModificacion() {
		return FechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		FechaModificacion = fechaModificacion;
	}
	
	
}
