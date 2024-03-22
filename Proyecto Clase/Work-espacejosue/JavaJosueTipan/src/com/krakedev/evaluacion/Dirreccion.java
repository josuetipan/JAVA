package com.krakedev.evaluacion;

public class Dirreccion {
	private String callePrincipal;
	private String CalleSecundaria;


	public Dirreccion(String callePrincipal, String calleSecundaria) {
		this.callePrincipal = callePrincipal;
		CalleSecundaria = calleSecundaria;
	}
	//---------------------------------
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return CalleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		CalleSecundaria = calleSecundaria;
	}
	
	
}
