package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Registro;
import com.krakedev.persistencia.servicios.AdminRegistro;

public class TestConsultaRegistro {

	public static void main(String[] args) {
		
		try {
			ArrayList<Registro> res = AdminRegistro.buscarPorCedula("1754772778");
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
