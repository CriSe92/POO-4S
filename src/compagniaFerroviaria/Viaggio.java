package compagniaFerroviaria;

import java.time.LocalDateTime;

public class Viaggio {
	private int codUnivoco;
	private String partenza, destinazione;
	private LocalDateTime dataPartenza, dataArrivo;
	private Treno trenino;
	private Prenotazione[] elenco;
	private static int creaCodice = 0;
	private static int numPrenotazioni = 0;

	final int maxPrenotazioni = 10;

	public Viaggio(String partenza, String destinazione, LocalDateTime dataPartenza, LocalDateTime dataArrivo,
			Treno trenino) {
		this.partenza = partenza;
		this.destinazione = destinazione;
		this.dataPartenza = dataPartenza;
		this.dataArrivo = dataArrivo;
		creaCodice++;
		codUnivoco = creaCodice;
		elenco = new Prenotazione[maxPrenotazioni];
	}

	public void aggiungi(Prenotazione p) {
		if (numPrenotazioni < maxPrenotazioni) {
			elenco[numPrenotazioni] = p;
			numPrenotazioni++;
		}else {
			System.out.println("Numero massimo di prenotazioni aggiungibili raggiunto!");
		}
	}
	
	public void aggiungi_v2(Prenotazione p) {
		int i;
		if(numPrenotazioni == maxPrenotazioni) {
			System.out.println("Non è stato possibile aggiungere la prenotazione");
		}else {
			for(i=0; i<maxPrenotazioni; i++) {
				if(elenco[i] == null) {
					elenco[i] = p;
					numPrenotazioni++;
					System.out.println("Prenotazione aggiunta in posizione "+i);
					break;
				}
			}
		}
		
	}

	public void rimuovi(int codiceUnivoco) {
		if (numPrenotazioni > 0) {
			for (int i = 0; i < maxPrenotazioni; i++) {
				if (elenco[i] != null
						&& elenco[i].getCodiceUnivoco() == codiceUnivoco)
					elenco[i] = null;
					numPrenotazioni--;
					break;
			}
		}else{
			System.out.println("Non c'è più alcuna Prenotazioni registrata!");
		}
	}

}
