package compagniaFerroviaria;

public class Treno {

	private int codiceUnivoco;
	private String marca;
	private String modello;
	private int annoFabbricazione;
	private static int codice;

	public Treno(String marca, String modello, int annoFabbricazione) {
		this.marca = marca;
		this.modello = modello;
		this.annoFabbricazione = annoFabbricazione;
		codiceUnivoco = codice;
		codice++;
	}

	public int getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public int getAnnoFabbricazione() {
		return annoFabbricazione;
	}

	public String toString() {
		return "Codice treno: " + codiceUnivoco + "Marca: " + marca + "Modello: " + modello + "Anno di fabbricazione: "
				+ annoFabbricazione;

	}

}