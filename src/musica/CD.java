package musica;

public class CD {
	private String titolo;
	private String autore;
	private int numeroBrani;
	private double durata;

//costruttore normale
	public CD(String titolo0, String autore0, int numeroBrani0, double durata0) {
		this.titolo = titolo0;
		this.autore = autore0;
		this.numeroBrani = numeroBrani0;
		this.durata = durata0;
	}

//costruttore di copia
	public CD(CD c) {
		this.titolo = c.titolo;
		this.autore = c.autore;
		this.numeroBrani = c.numeroBrani;
		this.durata = c.durata;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public int getNumeroBrani() {
		return numeroBrani;
	}

	public double getDurata() {
		return durata;
	}

	public void setTitolo(String titolo0) {
		this.titolo = titolo0;
	}

	public void setAutore(String autore0) {
		this.autore = autore0;
	}

	public void setNumeroBrani(int numeroBrani0) {
		this.numeroBrani = numeroBrani0;
	}

	public void setDurata(double durata0) {
		this.durata = durata0;
	}

	public String toString() {
		return "Il titolo del CD è: " + titolo + "\nL'autore è: " + autore + "\nContiene " + numeroBrani + " brani e dura "
				+ durata;
	}

	public int confrontaDurata(CD c) {
		if (this.durata > c.durata) {
			return 1;
		} else if (this.durata == c.durata) {
			return 0;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//Creazione di un CD
		CD cd1 = new CD("CDJava","Marconi",10,120);
		//Copia del CD creato al passo precedente
		CD cd2 = new CD(cd1);
		//Modifica al CD2
		cd2.setNumeroBrani(15);
		cd2.setDurata(200);
		cd2.setTitolo("NuovoCDJava");
		//Stampa dei CD
		System.out.println(cd1);
		System.out.println(cd2);
		
		//Uso il metodo per il confronto della durata
		if (cd1.confrontaDurata(cd2) > 0) {
			System.out.println("Il cd1 ha durata maggiore");
		}else {
			System.out.println("Il cd2 ha durata maggiore");
		}
	}

}
