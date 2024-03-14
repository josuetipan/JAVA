package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item();
		item.setNombre("Papas fritas");
		item.setProductosActuales(20);
		item.imprimir();
		item.vender(5);
		item.imprimir();
		item.devolver(5);
		item.imprimir();

	}

}
