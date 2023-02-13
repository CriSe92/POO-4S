package esempi;

public class Cellulare {
	
	private int numSms;
	private int secondiChiamata;
	private Batteria b;
	
	//Costruttore default: cellulare nuovo
	public Cellulare() {
		numSms = 0;
		secondiChiamata = 0;
		b = new Batteria();
	}
	
	//Costruttore normale: cellulare usato
	public Cellulare(int numSms, int secondiChiamata, int capBatteria) {
		this.numSms = numSms;
		this.secondiChiamata = secondiChiamata;
		b = new Batteria(capBatteria);
	}
	
	public Cellulare(int numSms, int secondiChiamata, Batteria b) {
		this.numSms = numSms;
		this.secondiChiamata = secondiChiamata;
		this.b = new Batteria(b);
	}
	
	/*
	 * tenere traccia del numero di sms inviati
	 * un sms consuma un’unità di carica
	 * */
	public boolean sms() {
		if(b.getLivelloCarica()>0) {
			numSms++;
			b.consuma();
			return true;
		}
		return false;
	}
	
	/*
	 * Tenere traccia dei secondi di conversazione effettuati.
	 * una chiamata consuma un’unità di carica ogni 5 secondi.
	 * */
	public int telefona(int durata) {
		
		while(durata>0 && b.getLivelloCarica() > 0) {
			if(durata>=5) {
				durata = durata - 5;
				secondiChiamata = secondiChiamata + 5;
			}else {
				secondiChiamata = secondiChiamata + durata;
				durata = 0;
			}
			b.consuma();
		}
		
		return durata;
		
	}
	
	public int getLivelloCarica() {
		return b.getLivelloCarica();
	}
	
}
