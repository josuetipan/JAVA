package com.KrakeDev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		calcu = new Calculadora();
		int resultadoSuma;
		resultadoSuma=calcu.sumar(5, 3);
		
		System.out.println("Resultado: "+resultadoSuma);
		double resultadoResta;
		resultadoResta=calcu.restar(10, 2);
		System.out.println("Resultado resta de 10 -2: "+resultadoResta);
		// multiplication
		double resultadoM;
		resultadoM = calcu.multiplicar(10, 5);
		System.out.println("El resultado de la multiplicacion es: "+resultadoM);
		// division
		double resultadoD;
		resultadoD = calcu.dividir(10, 5);
		System.out.println("El resultado de dividir es: "+ resultadoD);
		// primed
		double promedio;
		promedio = calcu.promediar(9.80, 10, 9.50);
		System.out.println("El promedio del Sr.Tipan es de: "+ promedio);
		// result
		calcu.mostrarResultado();
		
	}

}
