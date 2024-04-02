package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
				ps.setString(1, persona.getCedula());
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
				ps.setString(3, persona.getCedula());;		
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
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda)throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection  con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps=con.prepareStatement("select * from clientes where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String cedula = rs.getString("cedula");
				Persona p = new Persona();
				p.setNombre(nombre);
				p.setApellido(apellido);
				p.setCedula(cedula);
				personas.add(p);
				
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar",e);
			throw new Exception("Error al consultar");
		}finally {
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error",e);
				throw new Exception("Error en la base de error");
			}
		}
		
		
		return personas;
	}
	
	
}
