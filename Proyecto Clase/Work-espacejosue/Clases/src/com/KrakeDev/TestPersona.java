package com.KrakeDev;
/*Hola soy un mensaje*/
public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; //1. Declaro una variable llamada p de tipo persona
		Persona p2 = new Persona();
		p=new Persona();// 2. Insatarciar un objeto Persona, referenciarlo con p
		//3. Accedo a los atributos
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		//4. Modificar los atributos
		p.setNombre( "Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		System.out.println("-------------------------");
		//5.Accedo a los atributos
		System.out.println("nombre:"+ p.getNombre());
		System.out.println("edad:"+ p.getEdad());
		System.out.println("estatura:"+ p.getEstatura());
		System.out.println("-------------------------");
		p2.setNombre("Josue");
		System.out.println("nombre:"+ p2.getNombre());
		
		
	}

}
