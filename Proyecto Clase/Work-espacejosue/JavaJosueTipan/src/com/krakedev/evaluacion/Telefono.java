package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		
		if(numero != null && tipo != null) {
			if(numero.length()==10) {
				this.estado = "C";
				this.tipo=tipo;
			}else if(numero.length()==7){
				this.estado = "C";
				this.tipo=tipo;
			}else {
				this.estado = "E";
				this.tipo=tipo;
			}
			
		}else {
			this.estado = "E";
		}
	}
	//-----------------
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
}
