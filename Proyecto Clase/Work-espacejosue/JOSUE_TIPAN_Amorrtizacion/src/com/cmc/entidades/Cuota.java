package com.cmc.entidades;

import com.cmc.evaluacion.Utilitario;

public class Cuota {
	private int numero;
	private double cuota,capital,inicio,interes,abonoCapital,saldo;
	Utilitario utilitario=null;

	public Cuota(int numero) {
		this.numero = numero;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = Utilitario.redondear(cuota);
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = Utilitario.redondear(capital);
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = Utilitario.redondear(inicio);
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = Utilitario.redondear(interes);
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = Utilitario.redondear(abonoCapital);
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = Utilitario.redondear(saldo);;
	}

	public void mostrarPrestamo() {
		
		
		System.out.println(numero+"      |"+getCuota()+" | "+getInicio()+"  |  "
		+getInteres()+"  |  "+getAbonoCapital()+"    | "+getSaldo());
	}
}
