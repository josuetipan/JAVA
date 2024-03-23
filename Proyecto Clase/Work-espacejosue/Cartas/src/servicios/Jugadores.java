package servicios;

import java.util.ArrayList;

import entidades.Carta;

public class Jugadores {

	private ArrayList<String> jugadores;
	
	public void jugar() {

        ArrayList<String> jugadores = new ArrayList<>();
        jugadores.add("Jugador1");
        jugadores.add("Jugador2");
        jugadores.add("Jugador3");

        Juego juego = new Juego(jugadores);
        juego.entregarCartas(5);

        for (int i = 0; i < jugadores.size(); i++) {
            ArrayList<Carta> cartasJugador = juego.getCartasJugador().get(i);
            int total = 0;
            for (int j=0;j<cartasJugador.size();i++) {
                total += 1;
            }
            System.out.println("Jugador " + jugadores.get(i) + " - Total: " + total);
        }

        
    }
	
	
	
	
	
	
	
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	
	
	
	
	
}
