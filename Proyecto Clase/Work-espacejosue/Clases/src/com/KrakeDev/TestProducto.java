package com.KrakeDev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		//producto A
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Para los dolores del cuerpo";
		productoA.precio = 5.00;
		productoA.stockActual = 15;
		//Producto B
		productoB.nombre = "Inyecciones";
		productoB.descripcion = "de varios tamaños para inyectar";
		productoB.precio = 1.00;
		productoB.stockActual  = 300;
		// Producto C
		productoC.nombre = "Protector Solar";
		productoC.descripcion = "De alta proteccion 100% contra el sol";
		productoC.precio = 20.00;
		productoC.stockActual  = 50;
		//mostrar en pantalla
		System.out.println("Nombre del producto 1: "+productoA.nombre );
		System.out.println("Descripcion del producto 1: "+productoA.descripcion);
		System.out.println("Precio del producto 1: "+productoA.precio);
		System.out.println("Stock Actual del producto 1: "+productoA.stockActual);
		System.out.println("----------------------------------------");
		System.out.println("Nombre del producto 2: "+productoB.nombre );
		System.out.println("Descripcion del producto 2: "+productoB.descripcion);
		System.out.println("Precio del producto 2: "+productoB.precio);
		System.out.println("Stock Actual del producto 2: "+productoB.stockActual);
		System.out.println("----------------------------------------");
		System.out.println("Nombre del producto 3: "+productoC.nombre );
		System.out.println("Descripcion del producto 3: "+productoC.descripcion);
		System.out.println("Precio del producto 3: "+productoC.precio);
		System.out.println("Stock Actual del producto 3: "+productoC.stockActual);
		
				
		
		

	}

}
