package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		
		//date -java.util.Date
		//Date-javasql.Date
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String FechaStr = "2020/03/22 10:05:04";
		try {
			Date fecha =sf.parse(FechaStr);
			System.out.println(fecha);
			long fechaMiles=fecha.getTime();
			System.out.println(fechaMiles);
			//crea un java.sql.Date, partiendo de un java.util.Date
			java.sql.Date fechaSQL = new java.sql.Date(fechaMiles);
			System.out.println(fechaSQL);
			Time timeSQL = new Time(fechaMiles);
			System.out.println(timeSQL);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
