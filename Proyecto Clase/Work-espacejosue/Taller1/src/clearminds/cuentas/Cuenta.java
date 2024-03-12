package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;
	// constructores
	
	public Cuenta(String id) {
		this.id = id;
	}
	public Cuenta(String id,String tipo,double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	
	// saldo y tipo con get y set
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// id con get
	public String getId() {
		return id;
	}
	// metodo imprimir
	public void imprimir() {
		System.out.println("**************");
		System.out.println("CUENTA");
		System.out.println("**************");
		System.out.println("Número de Cuenta: "+ getId());
		System.out.println("Tipo: "+ getTipo());
		System.out.println("Saldo: USD"+ getSaldo());
	}
	public void imprimirConMiEstilo() {
		System.out.println("-------------------");
		System.out.println("Mi cuenta");
		System.out.println("*--------------------");
		System.out.println("Número de Cuenta: "+ getId());
		System.out.println("Tipo: "+ getTipo());
		System.out.println("Saldo: USD"+ getSaldo());
	}
	
	
}
