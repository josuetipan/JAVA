package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1754772778");
			System.out.println("conexion exitosa");
			ps=connection.prepareCall("insert into clientes(cedula,nombre,apellido)"
					+ "values (?,?,?)");
			ps.setString(1, "1728547742");
			ps.setString(2, "Java");
			ps.setString(3, "Tipan");			
			System.out.println("ejecuta insert");
			//-----------------------------------------------
			ps=connection.prepareCall("insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)"
					+ "values (?,?,?,?)");
			ps.setInt(1, 1014578);
			ps.setString(2, "1245577288");
			
			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String FechaStr = "2024/03/12 08:00:00";
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
				
				ps.setDate(3, fechaSQL);
				ps.setTime(4, timeSQL);
				System.out.println("Ejecuto regristro");
				
				ps.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
				
			}
			//--------------------------
			ps=connection.prepareCall("insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+ "values (?,?,?,?,?,?)");
			ps.setInt(1, 12445);
			ps.setString(2, "17547");
			ps.setBigDecimal(3, new BigDecimal(500.00));
			ps.setString(4,"C" );
			
			SimpleDateFormat sft = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String FechaStrt = "2024/03/16 14:00:00";
			try {
				Date fecha =sft.parse(FechaStrt);
				System.out.println(fecha);
				long fechaMiles=fecha.getTime();
				System.out.println(fechaMiles);
				//crea un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMiles);
				System.out.println(fechaSQL);
				Time timeSQL = new Time(fechaMiles);
				System.out.println(timeSQL);
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
				System.out.println("Ejecucion de Transacciones");
				ps.executeUpdate();
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
