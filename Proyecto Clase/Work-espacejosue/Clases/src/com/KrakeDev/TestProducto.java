package com.KrakeDev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto("CremaCero","Para escaldadura",5.00,100);
		Producto productoB = new Producto("Crema","para quemadura",7.00,500);
		Producto productoC = new Producto("lemonflu","para la gripe",2.00,80);
		System.out.println("Nombre del producto 1: "+productoA.getNombre() );
		System.out.println("Descripcion del producto 1: "+productoA.getDescripcion());
		System.out.println("Precio del producto 1: "+productoA.getPrecio());
		System.out.println("Stock Actual del producto 1: "+productoA.getStockActual());
		System.out.println("----------------------------------------");
		System.out.println("Nombre del producto 2: "+productoB.getNombre() );
		System.out.println("Descripcion del producto 2: "+productoB.getDescripcion());
		System.out.println("Precio del producto 2: "+productoB.getPrecio());
		System.out.println("Stock Actual del producto 2: "+productoB.getStockActual());
		System.out.println("----------------------------------------");
		System.out.println("Nombre del producto 3: "+productoC.getNombre() );
		System.out.println("Descripcion del producto 3: "+productoC.getDescripcion());
		System.out.println("Precio del producto 3: "+productoC.getPrecio());
		System.out.println("Stock Actual del producto 3: "+productoC.getStockActual());
		
		
		//producto A
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Para los dolores del cuerpo");
		productoA.setPrecio(5.00);
		productoA.setStockActual(15);
		//Producto B
		productoB.setNombre("Inyecciones");
		productoB.setDescripcion("de varios tamaños para inyectar");
		productoB.setPrecio(1.00);
		productoB.setStockActual(300);
		// Producto C
		productoC.setNombre("Protector Solar");
		productoC.setDescripcion("De alta proteccion 100% contra el sol");
		productoC.setPrecio(20.00);
		productoC.setStockActual(50);
		//mostrar en pantalla
		System.out.println("Nombre del producto 1: "+productoA.getNombre() );
		System.out.println("Descripcion del producto 1: "+productoA.getDescripcion());
		System.out.println("Precio del producto 1: "+productoA.getPrecio());
		System.out.println("Stock Actual del producto 1: "+productoA.getStockActual());
		System.out.println("----------------------------------------");
		System.out.println("Nombre del producto 2: "+productoB.getNombre() );
		System.out.println("Descripcion del producto 2: "+productoB.getDescripcion());
		System.out.println("Precio del producto 2: "+productoB.getPrecio());
		System.out.println("Stock Actual del producto 2: "+productoB.getStockActual());
		System.out.println("----------------------------------------");
		System.out.println("Nombre del producto 3: "+productoC.getNombre() );
		System.out.println("Descripcion del producto 3: "+productoC.getDescripcion());
		System.out.println("Precio del producto 3: "+productoC.getPrecio());
		System.out.println("Stock Actual del producto 3: "+productoC.getStockActual());
		
				
		
		

	}

}
