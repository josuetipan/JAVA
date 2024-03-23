package entidades;

public class Carta {
	private Numero numeroCarta;
	private String palo;
	private String estado = "N";
	//--------------
	
	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void mostrar() {
		if(numeroCarta!=null && palo!=null) {
			System.out.println(numeroCarta+"-"+palo);
		}
	}
	
	
	//--------------
	public Carta(Numero numero, String palo) {
		this.numeroCarta = numero;
		this.palo = palo;
	}
	public Carta() {

	}
	public Numero getNumero() {
		return numeroCarta;
	}
	public void setNumero(Numero numero) {
		this.numeroCarta = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
}
