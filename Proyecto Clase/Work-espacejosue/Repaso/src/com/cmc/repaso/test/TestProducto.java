package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("Jugo de mora",3.00);
		producto.setPrecio(3.00);
		double resultado;
		resultado = producto.calcularPrecioPromo(20);
		System.out.println("El nombre del producto es: "+producto.getNombre());
		System.out.println("El porcentaje del producto es: "+resultado);
	}

}
