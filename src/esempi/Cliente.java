package esempi;

public class Cliente {
	private String nome;
	private String partitaIVA;
	private double saldo;
	
	public Cliente(String n, String pIVA) {
		this.nome = n;
		if(pIVA.length() != 11) {
			System.err.println("Partita IVA non valida!");
			System.exit(-1);
		}
		this.partitaIVA = pIVA;
		this.saldo = 0;
	}
	
	public Cliente(String n, String pIVA, double s) {
		this(n,pIVA);
		this.saldo = s;
	}
	
	public void addebita(double importo) {
		saldo = saldo +importo;
	}
	
	public void paga(double importo) {
		saldo = saldo - importo;
	}
	
	public void stampaSituazione() {
		System.out.println("-----------------------");
		System.out.println("Nome: "+nome);
		System.out.println("P.IVA: "+partitaIVA);
		System.out.println("Saldi: € "+saldo);
		System.out.println("-----------------------");
	}
	
	public String toString() {
		return nome+" [P.IVA: "+partitaIVA+"]";
	}
	
	public static void main(String[] args) {
		Cliente c = new Cliente("mario","12345678910",200);
		c.stampaSituazione();
		c.addebita(100);
		c.stampaSituazione();
		c.paga(50);
		c.stampaSituazione();
	}
}
