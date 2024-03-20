package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public Maquinadulces() {
		celdas = new ArrayList<Celda>();
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {

		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Codigo celda: " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigoCelda)) {

				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() == null) {
				System.out.println("****" + elementoCelda.getCodigo());
				System.out.println("Stock: " + elementoCelda.getStock());
				System.out.println("La celda no tiene producto !!!");
			} else {
				System.out.println("****" + elementoCelda.getCodigo());
				System.out.println("Stock: " + elementoCelda.getStock());
				System.out.println("Nombre producto: " + elementoCelda.getProducto().getNombre() + "\n"
						+ "Precio producto: " + elementoCelda.getProducto().getPrecio() + "\n" + "Codigo producto: "
						+ elementoCelda.getProducto().getCodigo());
			}

		}
		System.out.println("Saldo: "+getSaldo());
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Producto productoEncontrado=null;
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getCodigo().equals(codigoCelda)) {
				productoEncontrado=elementoCelda.getProducto();
			}
		}
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigoCelda) {
		double precio=0.0;
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getCodigo().equals(codigoCelda)) {
				precio=elementoCelda.getProducto().getPrecio();
			}
		}
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celdaEncotrada=null;
	
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto()!=null) {
				if(elementoCelda.getProducto().getCodigo().equals(codigoProducto)) {
					
				}
				celdaEncotrada=elementoCelda;
			}
		}
	
		return celdaEncotrada;
	}
	
	public void incrementarProductos(String codigoProducto,int cantIncrementar) {
		Celda celdaEncontrada =buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantIncrementar);
	}
	public void vender(String codigoCelda) {
		
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		setSaldo(getSaldo()+valorProducto);
		mostrarProductos();
	}
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		setSaldo(getSaldo()+valorProducto);
		return valorIngresado-valorProducto;
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> listaMenores= new ArrayList<Producto>();
		
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto()!=null) {
				if(elementoCelda.getProducto().getPrecio()<=limite) {
					listaMenores.add(elementoCelda.getProducto());
				}
			}
		}
		return listaMenores;
		
	}

}