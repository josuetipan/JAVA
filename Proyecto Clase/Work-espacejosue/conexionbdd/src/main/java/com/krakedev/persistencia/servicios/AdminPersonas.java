package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	
	private static final Logger  LOGGER = LogManager.getLogger(AdminPersonas.class); 
	
	public static void insertar(Persona persona) throws Exception {
		Connection  con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>"+persona);
		try {
			// abrir la conexion
			 con = ConexionBDD.conectar();
			 ps=con.prepareCall("insert into clientes(cedula,nombre,apellido)"
						+ "values (?,?,?)");
				ps.setString(1, persona.getCedula().getCedula());
				ps.setString(2, persona.getNombre());
				ps.setString(3, persona.getApellido());			
				System.out.println("ejecuta insert");
				ps.executeUpdate();
			 
			 
			System.out.println("Insertar");
		}catch(Exception e) {
			//mostrar el error al usuario
			//loggear el error
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
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
	
	public static void actualizar(Persona persona)throws Exception {
		Connection  con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>"+persona);
		try {
			// abrir la conexion
			 con = ConexionBDD.conectar();
			 ps=con.prepareCall("UPDATE clientes SET nombre=?, apellido=? WHERE cedula=?");
				ps.setString(1, persona.getNombre());
				ps.setString(2, persona.getApellido());
				ps.setString(3, persona.getCedula().getCedula());;		
				System.out.println("ejecuta insert");
				ps.executeUpdate();
			 
			 
			System.out.println("Insertar");
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
	
	public static void eliminar(String cedula) throws Exception{
		Connection  con = null;
		PreparedStatement ps;
		try {
			// abrir la conexion
			 con = ConexionBDD.conectar();
			 ps=con.prepareCall("Delete from clientes where cedula=? ");
			 	ps.setString(1, cedula);;		
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
