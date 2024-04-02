package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestConsultaTransacciones {

	public static void main(String[] args) {
		
		try {
			ArrayList<Transacciones> tran =  AdminTransacciones.buscarPorCodigo(12445);
			System.out.println(tran);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ArrayList<Transacciones> tran = AdminTransacciones.buscarPorTipo("D");
			System.out.println(tran);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
