package com.cmc.test;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCuota {
    public static void main(String[] args) {
    	CalculadoraAmortizacion interes = new CalculadoraAmortizacion();
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        double cuota = interes.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
