package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA="yyyy/MM/dd";
	private static final String FORMATO_HORA="hh:mm";
	private static final Logger  LOGGER = LogManager.getLogger(Convertidor.class); 
	
	public static Date convertirFecha(String fechaStr) throws Exception{
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			LOGGER.trace("convertido fecha");
			fechaDate =sf.parse(fechaStr);
			LOGGER.trace("fecha convertida");
		} catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto", e);
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto");
		}
		return fechaDate;
	}
	public static Date convertirHora(String horaStr) throws Exception{
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate = null;
		try {
			LOGGER.trace("convirtiendo Hora");
			horaDate =sf.parse(horaStr);
			LOGGER.trace("Hora convertida exitoso");
		} catch (ParseException e) {
			LOGGER.error("La Hora no tiene el formato correcto", e);
			throw new Exception("La Hora no tiene el formato correcto");
		}
		return horaDate;
	}
}
