package esempi;

import java.time.LocalDate;

public class Fattura {
	
	private Cliente destinatario;
	private double qta;
	private double prezzoUnitario;
	private int numero;
	private String descrizione;
	private LocalDate data;
	
	private static final double PERC_IVA = 0.22;
	private static int numeroCorrente = 1;
	
	public Fattura(Cliente dest) {
		this.destinatario = dest;
		data = LocalDate.now();
		this.numero = numeroCorrente;
		numeroCorrente++;
	}
	
	public Fattura(Cliente dest, String descrizione, double qta, double prezzoUnitario) {
		this(dest);
		this.descrizione = descrizione;
		this.qta = qta;
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public static int quanteFatture() {
		return numeroCorrente-1;
	}
	
	public String toString() {
		return "Fattura n. "+numero+" del "+data+"\n"+
		"Intestata a "+destinatario+"\n"+
		"Descrizione: "+descrizione+"\n"+
		"Quantità: "+qta+"\n"+
		"Prezzo Unitario: € "+prezzoUnitario;
	}
	
	public void setQta(double qta) {
		this.qta = qta;
	}

	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	private double calcolaImponibile() {
		return qta*prezzoUnitario;
	}
	
	private double calcolaImposta() {
		return calcolaImponibile()*PERC_IVA;
	}
	
	public double totaleFattura() {
		return calcolaImponibile()+calcolaImposta();
	}
	
	public void stampaFattura() {
		System.out.println(this);
	}
	
	public void emettiFattura() {
		destinatario.addebita(this.totaleFattura());
	}

	public static void main(String[] args) {
		Cliente fabrizio = new Cliente("Fabrizio","12345678910",0);
		Fattura f = new Fattura(fabrizio);
		System.out.println(f);
		System.out.println("Fatture create: "+Fattura.quanteFatture());
		f.setDescrizione("Melanzane");
		f.setPrezzoUnitario(2.50);
	}
}
