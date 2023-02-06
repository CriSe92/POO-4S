package esempi;

public class Fatturazione {
	public static void main(String[] args) {
		Cliente giovanni = new Cliente("Giovanni","12345678910");
		Fattura f = new Fattura(giovanni);
		f.setDescrizione("melanzane");
		f.setPrezzoUnitario(2.59);
		f.setQta(3.5);
		f.setPrezzoUnitario(2.39);
		
		f.stampaFattura();
		giovanni.stampaSituazione();
		
		f.emettiFattura();
		giovanni.stampaSituazione();
		
		giovanni.paga(5.10);
		giovanni.stampaSituazione();
	}
}
