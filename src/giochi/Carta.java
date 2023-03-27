package giochi;

public class Carta {
	private int seme;
	private int valore;
	
	public Carta(int v, int s) {
		this.valore = v;
		this.seme = s;
	}
	
	public int getSeme() {
		return seme;
	}
	
	public int getValore() {
		return valore;
	}
	
	private String semeToString() {
		switch(seme) {
			case 0: return "Denari"; 
			case 1: return "Spade"; 
			case 2: return "Bastoni"; 
			case 3: return "Coppe"; 
			default: return "Seme non valido";
		}
	}
	
	public String toString() {
		return valore+" "+semeToString();
	}
	
	public static void main(String[] args) {
		Carta c1 = new Carta(3,2);
		System.out.println(c1);
		Carta c2 = new Carta(3,20);
		System.out.println(c2);
	}

}
