package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminTransacciones {

	private static final Logger LOGGER = LogManager.getLogger(AdminRegistro.class);

	public static void insertar(Transacciones transa) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareCall(
					"insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)" + "values (?,?,?,?,?,?)");
			ps.setInt(1, transa.getCodigo());
			ps.setString(2, transa.getNumero_cuenta());
			ps.setBigDecimal(3, transa.getMonto());
			ps.setString(4, transa.getTipo());
			ps.setDate(5, new java.sql.Date(transa.getFecha().getTime()));
			ps.setTime(6, new Time(transa.getHora().getTime()));

			System.out.println("ejecuta insert");
			ps.executeUpdate();
			System.out.println("Insertado con exito");
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error", e);
				throw new Exception("Error en la base de error");
			}
		}

	}

	public static void actualizar(Transacciones tran) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE transacciones SET numero_cuenta=?, monto=?, tipo=?,fecha=?,hora=? WHERE codigo=?");
			ps.setString(1, tran.getNumero_cuenta());
			ps.setBigDecimal(2, tran.getMonto());
			ps.setString(3, tran.getTipo());
			ps.setDate(4, new java.sql.Date(tran.getFecha().getTime()));
			ps.setTime(5, new Time(tran.getHora().getTime()));
			ps.setInt(6, tran.getCodigo());
			ps.executeUpdate();
			System.out.println("ejecuta insert");

			System.out.println("actualizado");
		} catch (Exception e) {
			// mostrar el error al usuario
			// loggear el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al actualizar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error", e);
				throw new Exception("Error en la base de error");
			}
		}

	}

	public static void eliminar(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareCall("Delete from transacciones where codigo=? ");
			ps.setInt(1, codigo);
			;
			ps.executeUpdate();
			System.out.println("ejecuta insert");

			System.out.println("Eliminado");
		} catch (Exception e) {
			// mostrar el error al usuario
			// loggear el error
			LOGGER.error("Error al Eliminar", e);
			throw new Exception("Error al Eliminar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error", e);
				throw new Exception("Error en la base de error");
			}
		}

	}

	public static ArrayList<Transacciones> buscarPorCodigo(int codigo) throws Exception {
		ArrayList<Transacciones> transaciones = new ArrayList<Transacciones>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from transacciones where codigo = ?");
			ps.setInt(1, codigo);

			rs = ps.executeQuery();
			if (rs.next()) {
				int codigo1 = rs.getInt("codigo");
				String numero = rs.getString("numero_cuenta");
				BigDecimal monto = rs.getBigDecimal("monto");
				String tipo = rs.getString("tipo");
				Date fecha = rs.getDate("fecha");
				Date hora = rs.getTime("hora");
				Transacciones tra = new Transacciones();
				tra.setCodigo(codigo1);
				tra.setNumero_cuenta(numero);
				tra.setMonto(monto);
				tra.setTipo(tipo);
				tra.setFecha(fecha);
				tra.setHora(hora);
				transaciones.add(tra);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar", e);
			throw new Exception("Error al consultar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error", e);
				throw new Exception("Error en la base de error");
			}
		}

		return transaciones;
	}

	public static ArrayList<Transacciones> buscarPorTipo(String tipoBuscado) throws Exception {
		ArrayList<Transacciones> transaciones = new ArrayList<Transacciones>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from transacciones where tipo = ?");
			ps.setString(1, tipoBuscado);

			rs = ps.executeQuery();
			while (rs.next()) {
				int codigo1 = rs.getInt("codigo");
				String numero = rs.getString("numero_cuenta");
				//BigDecimal monto = rs.getBigDecimal("monto");
				String tipo = rs.getString("tipo");
				Date fecha = rs.getDate("fecha");
				Date hora = rs.getTime("hora");
				Transacciones tra = new Transacciones();
				tra.setCodigo(codigo1);
				tra.setNumero_cuenta(numero);
				//tra.setMonto(monto);
				tra.setTipo(tipo);
				tra.setFecha(fecha);
				tra.setHora(hora);
				transaciones.add(tra);
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar", e);
			throw new Exception("Error al consultar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de error", e);
				throw new Exception("Error en la base de error");
			}
		}

		return transaciones;
	}

}
