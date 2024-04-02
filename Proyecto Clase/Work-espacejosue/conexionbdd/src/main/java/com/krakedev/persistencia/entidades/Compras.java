package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Compras {

		private int id_compra;
		private String cedula;
		private Date fecha_compra;
		private double monto;
		
		
		public Compras() {
			super();
		}
		public Compras(int id_compra, String cedula, double monto) {
			super();
			this.id_compra = id_compra;
			this.cedula = cedula;
			this.monto = monto;
		}
		
		public Compras(int id_compra, String cedula, Date fecha_compra, double monto) {
			super();
			this.id_compra = id_compra;
			this.cedula = cedula;
			this.fecha_compra = fecha_compra;
			this.monto = monto;
		}
		public int getId_compra() {
			return id_compra;
		}
		public void setId_compra(int id_compra) {
			this.id_compra = id_compra;
		}
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public Date getFecha_compra() {
			return fecha_compra;
		}
		public void setFecha_compra(Date fecha_compra) {
			this.fecha_compra = fecha_compra;
		}
		public double getMonto() {
			return monto;
		}
		public void setMonto(double monto) {
			this.monto = monto;
		}
		
		
}
