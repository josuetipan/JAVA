package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Registro;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminRegistro {

	private static final Logger  LOGGER = LogManager.getLogger(AdminRegistro.class); 
	
	public static void insertar(Registro registro) throws Exception {
		Connection  con = null;
		PreparedStatement ps;
		try {
			 con = ConexionBDD.conectar();
			 ps=con.prepareCall("insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)"
						+ "values (?,?,?,?)");
				ps.setInt(1, registro.getCodigo_registro());
				ps.setString(2, registro.getCedula_empleado());
				ps.setDate(3, new java.sql.Date(registro.getFecha().getTime()));
				ps.setTime(4, new Time(registro.getHora().getTime()));
				System.out.println("ejecuta insert");
				ps.executeUpdate();
			System.out.println("Insertado con exito");
		}catch(Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error",e);
				throw new Exception("Error en la base de error");
			}
		}
	}
	
	public static void actualizar(Registro registro)throws Exception {
		Connection  con = null;
		PreparedStatement ps;
		try {
			// abrir la conexion
			 con = ConexionBDD.conectar();
			 ps=con.prepareStatement("UPDATE registros_entrada SET cedula_empleado=?, fecha=?, hora=? WHERE codigo_registro=?");
				ps.setString(1, registro.getCedula_empleado());
				ps.setDate(2, new java.sql.Date(registro.getFecha().getTime()));
				ps.setTime(3, new Time(registro.getHora().getTime()));	
				ps.setInt(4,registro.getCodigo_registro());
				ps.executeUpdate();
				System.out.println("ejecuta insert");
			 
			 
			System.out.println("actualizado");
		}catch(Exception e) {
			//mostrar el error al usuario
			//loggear el error
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al actualizar");
		}finally {
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error",e);
				throw new Exception("Error en la base de error");
			}
		}
		
	}
	public static void eliminar(int codigo) throws Exception{
		Connection  con = null;
		PreparedStatement ps;
		try {
			// abrir la conexion
			 con = ConexionBDD.conectar();
			 ps=con.prepareCall("Delete from registros_entrada where codigo_registro=? ");
			 	ps.setInt(1, codigo);;		
			 	ps.executeUpdate();
			System.out.println("ejecuta insert");
			 
				System.out.println("Eliminado");
		}catch(Exception e) {
			//mostrar el error al usuario
			//loggear el error
			LOGGER.error("Error al Eliminar",e);
			throw new Exception("Error al Eliminar");
		}finally {
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error",e);
				throw new Exception("Error en la base de error");
			}
		}
		
		
	}
}
