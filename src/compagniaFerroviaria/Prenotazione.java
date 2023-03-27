package compagniaFerroviaria;

import java.util.Scanner;

public class Prenotazione {

	private int codiceUnivoco;

	// Passeggero
	private String nome;
	private String cognome;
	private String codiceFiscale;

	private double prezzo;

	private static int codice = 1;

	public Prenotazione(String nome, String cognome, double prezzo, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.prezzo = prezzo;
		this.codiceFiscale = codiceFiscale;

		codiceUnivoco = codice;
		codice++;
	}

	public int getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String toString() {
		return "Prenotazione di codice " + codiceUnivoco + ", nome viaggiatore =" + nome + ", cognome viaggiatore ="
				+ cognome + ", codice fiscale viaggiatore =" + codiceFiscale + ", prezzo pagato =" + prezzo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserire il nome del viaggiatore");
		String nome = sc.next();

		System.out.println("Inserire il cognome del viaggiatore");
		String cognome = sc.next();

		System.out.println("Inserire il codice fiscale del viaggiatore");
		String codiceFiscale = sc.next();
		while (codiceFiscale.length() != 16) {
			System.out.println("Inserire un codice fiscale valido!");
			codiceFiscale = sc.next();
		}

		System.out.println("Inserire l'importo pagato");
		double prezzo = sc.nextDouble();

		Prenotazione p = new Prenotazione(nome, cognome, prezzo, codiceFiscale);

		System.out.println(p);
	}
}
