package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String CLAVE = "1754772778";
	private static final Logger  LOGGER = LogManager.getLogger(ConexionBDD.class); 
	
	public static  Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,CLAVE);
			LOGGER.debug("conexion exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura", e);
			throw new Exception("Error en la infraestructura");
		} catch(SQLException e) {
			LOGGER.error("Error al conectarse, revise usuario y clave", e);
			e.printStackTrace();
			throw new Exception("Error al conectarse, revise usuario y clave");
		}
		return connection;
	}
	
}
