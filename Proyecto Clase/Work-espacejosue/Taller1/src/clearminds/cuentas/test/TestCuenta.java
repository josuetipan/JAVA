package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		//Creo el objeto Cuenta y lo referencio con cuenta1
		Cuenta cuenta1 = new Cuenta("03476");
		// Coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675); 
		//Creo el objeto Cuenta y lo referencio con cuenta2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		System.out.println("---------Valores Iniciales----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-----Valores Modificados---------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		//-----------------------
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		cuenta4.imprimirConMiEstilo();
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		cuenta5.imprimirConMiEstilo();
		Cuenta cuenta6 = new Cuenta("0666", "A",0);
		cuenta6.imprimirConMiEstilo();
		
	}

}
