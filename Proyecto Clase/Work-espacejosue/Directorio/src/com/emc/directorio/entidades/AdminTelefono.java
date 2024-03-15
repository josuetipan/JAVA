package com.emc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono tel) {
		if(tel.getOperadora() == "movil") {
			tel.setTieneWhatsapp(true);
		}
	}
	public int contarMovil(Telefono tel1,Telefono tel2,Telefono tel3) {
		int con = 0;
		if(tel1.getOperadora() == "movil") {
			con = con +1;
		}
		if(tel2.getOperadora() == "movil") {
			con = con +1;
		}
		if(tel3.getOperadora() == "movil") {
			con = con +1;
		}
		return con;
	}
	public int contarClaro (Telefono tel1,Telefono tel2,Telefono tel3,Telefono tel4){
		int con = 0;
		if(tel1.getOperadora() == "claro") {
			con = con +1;
		}
		if(tel2.getOperadora() == "claro") {
			con = con +1;
		}
		if(tel3.getOperadora() == "claro") {
			con = con +1;
		}
		if(tel4.getOperadora() == "claro") {
			con = con +1;
		}
		return con;
	}
}
