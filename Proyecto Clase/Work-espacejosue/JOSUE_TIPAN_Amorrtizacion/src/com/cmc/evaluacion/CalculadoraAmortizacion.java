package com.cmc.evaluacion;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {
		
		public static double calcularCuota(Prestamo prestamo) {
			double monto = prestamo.getMonto();
		    double interesMensual = prestamo.getInteres() / 12 / 100; 
		    int plazo = prestamo.getPlazo();

		    double cuota = (monto * interesMensual) / (1 - Math.pow(1 + interesMensual, -plazo));

		    return cuota;
		}

		public static void generarTabla(Prestamo prestamo) {
			// Creamos una copia del array de cuotas para poder interactuar sin confilctos
			Cuota[] cuotas = prestamo.getCuota();
			// Calculamos los interes del prestamo
			double interesPrestamo = prestamo.getInteres() / 12 / 100; //
			// Calculamos el valor de cuotas del prestamos
			double calcularCuota = calcularCuota(prestamo);
			for (int i = 0; i < cuotas.length; i++) {
				// Creamos una instacia de cuota y establecemos la cuota
				Cuota cuota = new Cuota(i + 1);
				cuota.setCuota(calcularCuota);
				prestamo.getCuota()[i] = cuota;
				if (i == 0) {
					prestamo.getCuota()[i].setInicio(prestamo.getMonto());
				}
				
			}
			
			for(int i = 0; i < cuotas.length; i++) {
				Cuota cuota=cuotas[i];
				if (i < cuotas.length - 1) {
					
					calcularValoresCuota(interesPrestamo, cuota, cuotas[i + 1]);

				} else {
					calcularValoresCuota(interesPrestamo, cuota, null);

				}
			}
		
		
		
		}

		public static void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
			//Calculamos los valores de los interes, abonoCapital y saldo
			double valorInteres = cuotaActual.getInicio() * interes;
			double abonoCapital = cuotaActual.getCuota() - valorInteres;
			double saldo = cuotaActual.getInicio() - abonoCapital;
			
			//Asignamos los atrbutos en la cuenta actual
			cuotaActual.setInteres(valorInteres);
			cuotaActual.setAbonoCapital(abonoCapital);
			cuotaActual.setSaldo(saldo);
			//Verificamos que la cuota siguiente no sea null o la ultima cuota
			if (cuotaSiguiente != null) {
				
				cuotaSiguiente.setInicio(saldo);
				
			} else {
			cuotaActual.setAbonoCapital(abonoCapital+saldo);
				cuotaActual.setCuota(cuotaActual.getCuota()+saldo);
				// En caso q no hay cuota siguiente
				cuotaActual.setSaldo(0);
			}

		}
		   public static void mostrarTabla(Prestamo prestamo) {
		        Cuota[] cuotas = prestamo.getCuota();

		        // Encabezado de la tabla
		        System.out.println("Tabla de Amortización:");
		        System.out.println("Numero | Cuota | Inicio | Interes | Abono capital | Saldo |");

		        // Iterar sobre cada cuota y mostrar sus detalles
		        for (Cuota cuota : cuotas) {
		           cuota.mostrarPrestamo();
		        }
		    }
}
