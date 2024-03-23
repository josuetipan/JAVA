package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numeroPosibles = new ArrayList<Numero>();
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private ArrayList<Carta> auxiliar = new ArrayList<Carta>();
	
	
	public Naipe() {
		Palos polos = new Palos();
		String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] valores = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] palos = {polos.getCorazonRojo(), polos.getCorazonNegro(), polos.getDiamante(), polos.getTrebol()};

        for (int i = 0; i < numeros.length; i++) {
            Numero numero = new Numero(numeros[i], valores[i]);
            this.numeroPosibles.add(numero);}
        
        for (String palo : palos) {
            for (Numero numero : numeroPosibles) {
                Carta carta = new Carta(numero, palo);
                this.cartas.add(carta);
            }
        }
	}
	
	public ArrayList<Carta> barajar(){
		auxiliar = new ArrayList<>();
		for(int i=1;i<100;i++) {
			int resultado = Random.obtenerPosicion();
			Carta encontrado = this.cartas.get(resultado);
			if(encontrado.getEstado().equals("N")) {
				auxiliar.add(encontrado);
				encontrado.setEstado("C");
			}
		}
		for(Carta carta : this.cartas) {
			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		return auxiliar;
	}
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	
	
	
	
}
