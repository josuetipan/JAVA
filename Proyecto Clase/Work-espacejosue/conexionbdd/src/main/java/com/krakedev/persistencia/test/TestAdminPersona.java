package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Registro;
import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.servicios.AdminRegistro;
import com.krakedev.persistencia.servicios.AdminTransacciones;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		Compras com = new Compras(1541,"1725156622",12.30);
		try {
			AdminPersonas.insertar(new Persona(com,"Tatiana","Vazques"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//-----------------------------------------
		Registro res = new Registro(1142,"1745214621");
		Date fecha = null;
		Date hora = null;
		try {
			fecha=Convertidor.convertirFecha("2023/12/05");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			hora = Convertidor.convertirHora("14:05");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.setFecha(fecha);
		res.setHora(hora);
		
		try {
			AdminRegistro.insertar(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Transacciones tran = new Transacciones(1245,"121",new BigDecimal(100.10),"C");
		Date fechaTrans = null;
		Date horaTrans = null;
		try {
			fechaTrans = Convertidor.convertirFecha("2024/21/12");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			horaTrans = Convertidor.convertirHora("13:15");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tran.setFecha(fechaTrans);
		tran.setHora(horaTrans);
		
		try {
			AdminTransacciones.insertar(tran);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
