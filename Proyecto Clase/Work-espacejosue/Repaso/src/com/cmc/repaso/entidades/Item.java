package com.cmc.repaso.entidades;

public class Item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevuenltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("Producto: "+getNombre());
		System.out.println("Producto Atuales: "+getProductosActuales());
		System.out.println("Productos Devueltos :"+getProductosDevuenltos());
		System.out.println("Productos Vendidos: "+getProductosVendidos());
	}
	public void vender(int cantidad) {
		this.productosActuales= getProductosActuales()-cantidad;
		this.productosVendidos= getProductosVendidos()+cantidad;
	}
	public void devolver(int cantidad) {
		this.productosActuales=getProductosActuales()+cantidad;
		this.productosVendidos=getProductosVendidos()-cantidad;
		this.productosDevuenltos= getProductosDevuenltos()+cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevuenltos() {
		return productosDevuenltos;
	}
	public void setProductosDevuenltos(int productosDevuenltos) {
		this.productosDevuenltos = productosDevuenltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	

	
	
	
}
