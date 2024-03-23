package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<String> idJugadores;

	public Juego(ArrayList<String> idJugadores) {
		this.naipe = new Naipe();
		this.naipeBarajado = this.naipe.barajar();
		this.cartasJugador = new ArrayList<ArrayList<Carta>>();
		this.idJugadores = idJugadores;
		for (String id : idJugadores) {
			ArrayList<Carta> cartaJugador = new ArrayList<Carta>();
			this.cartasJugador.add(cartaJugador);
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public void entregarCartas(int cartasPorjugador) {
		int cantJugadores = cartasJugador.size();
		int cartasEntregadas = 0;

		while (cartasEntregadas < cartasPorjugador) {
			for (int i = 0; i < cantJugadores; i++) {
				ArrayList<Carta> cartasdeEntregadas = cartasJugador.get(i);
				Carta cartaEntregada = naipeBarajado.remove(0);
				cartasdeEntregadas.add(cartaEntregada);
				cartasEntregadas++;
			}
		}
	}

	public int devolverTotal(int idJugador) {
		ArrayList<Carta> cartasJugadores = cartasJugador.get(idJugador);
		int total = 0;
		for (Carta carta : cartasJugadores) {
			total += carta.getNumero().getValor();
		}
		return total;
	}

	public String determinarGanador() {
		String idGanador = idJugadores.get(0);
		int sumaGanador = devolverTotal(0);

		for (int i = 1; i < cartasJugador.size(); i++) {
			int sumaActual = devolverTotal(i);

			if (sumaActual >= sumaGanador) {
				idGanador = idJugadores.get(i);
				sumaGanador = sumaActual;
			}
		}

		return idGanador; 
	}

}

	
	
	

