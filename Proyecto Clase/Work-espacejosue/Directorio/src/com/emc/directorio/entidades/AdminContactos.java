package com.emc.directorio.entidades;

public class AdminContactos {
	public double buscarMasPesado(Contacto c1, Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1.getPeso();
		}else if(c1.getPeso()<c2.getPeso()){
			return c2.getPeso();
		}else {
			return 0;
		}
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		Telefono tel = c1.getTelefono();
		Telefono tel2 = c2.getTelefono();
		if (tel.getOperadora() == tel2.getOperadora()) {
			return true;
			
		}else {
			return false;
		}
	}
	public void activarUsuario(Contacto c1) {
		Telefono tel = c1.getTelefono();
		if(tel.isTieneWhatsapp() == true) {
			c1.setActivo(true);
		}else {
			c1.setActivo(false);
		}
	}
	
	
}
