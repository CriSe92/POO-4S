package giochi;

public class MazzoDiCarte {
	private Carta[] mazzo;
	private final int numCarte = 40;
	private int cartaCorrente;
	
	public MazzoDiCarte() {
		mazzo = new Carta[numCarte];
		int k = 0;
		for(int valore=1; valore<=10; valore++) {
			for(int seme=0; seme<4; seme++) {
				mazzo[k] = new Carta(valore, seme);
				k++;
			}
		}
		cartaCorrente = numCarte;
	}
	
	public Carta dammiUnaCarta() {
		if(cartaCorrente>0) {
			Carta x = mazzo[cartaCorrente-1];
			cartaCorrente--;
			return x;
		}
		System.out.println("Mazzo vuoto");
		return null;
	}
	
	public int carteNelMazzo() {
		return cartaCorrente;
	}
	
	public void ricomincia() {
		cartaCorrente = numCarte;
	}
	
	public void mischia() {
		 Collections.shuffle(Arrays.asList(mazzo));
	}
	
	public void stampaMazzo() {
		for(int i=0; i<cartaCorrente; i++) {
			System.out.println(mazzo[i]);
		}
	}

	public static void main(String[] args) {
		MazzoDiCarte m = new MazzoDiCarte();
		Carta c = m.dammiUnaCarta();
		System.out.println(c);
		System.out.println("--- Mazzo intero ---");
		m.stampaMazzo();
	}
}
