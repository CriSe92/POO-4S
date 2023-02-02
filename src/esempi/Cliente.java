package esempi;

public class Cliente {
	private String nome;
	private String partitaIVA;
	private double saldo;
	
	public Cliente(String n, String pIVA) {
		this.nome = n;
		if(pIVA.length() != 11) {
			System.err.println("PArtita IVA non valida!");
			System.exit(-1);
		}
		this.partitaIVA = pIVA;
		this.saldo = 0;
	}
	
	public Cliente(String n, String pIVA, double s) {
		this(n,pIVA);
		this.saldo = s;
	}
	
	public static void main(String[] args) {
		Cliente c = new Cliente("mario","12345678910",200);
	}
}
