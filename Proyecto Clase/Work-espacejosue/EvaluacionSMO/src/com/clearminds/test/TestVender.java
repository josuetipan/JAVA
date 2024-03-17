package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestVender {

	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("Papitas","KE34",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("Doritos","D456",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		maquina.vender("A1");
		maquina.vender("B1");
		
		maquina.mostrarProductos();

	}

}
