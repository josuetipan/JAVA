package com.KrakeDev;
/*Hola soy un mensaje*/
public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; //1. Declaro una variable llamada p de tipo persona
		Persona p2 = new Persona();
		p=new Persona();// 2. Insatarciar un objeto Persona, referenciarlo con p
		//3. Accedo a los atributos
		System.out.println("nombre:"+p.nombre);
		System.out.println("edad:"+p.edad);
		System.out.println("estatura:"+p.estatura);
		//4. Modificar los atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;
		System.out.println("-------------------------");
		//5.Accedo a los atributos
		System.out.println("nombre:"+ p.nombre);
		System.out.println("edad:"+ p.edad);
		System.out.println("estatura:"+ p.estatura);
		System.out.println("-------------------------");
		p2.nombre = "Josue";
		System.out.println("nombre:"+ p2.nombre);
		
		
	}

}
