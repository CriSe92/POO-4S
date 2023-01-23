package giochi;

public class Monetina {
	private int faccia;
	
	public Monetina() {
		lancia();
	} 
	
	public void lancia() {
		if(Math.random()<0.5) {
			this.faccia = 0; 
		}else {
			this.faccia = 1;
		}
		/* Metodo alternativo:
		this.faccia = (int)(Math.random()*2);
		*/
	}
	
	public int getFaccia() {
		return faccia;
	}
	
	public String toString() {
		if(faccia == 0) {
			return "Testa";
		}else {
			return "Croce";
		}
	}
	
	public static void main(String[] args) {
		Monetina m1 = new Monetina();
		Monetina m2 = new Monetina();
		

		System.out.println("--- TEST ---");
		int contaTeste = 0;
		int contaCroci = 0;
		/*Test Monentina: verifico che su 1000 lanci il numero di teste e di croci sia equamente distribuito*/
		for(int i=0; i<1000; i++) {
			m1.lancia();
			if(m1.getFaccia() == 0) {
				contaTeste++;
			}else {
				contaCroci++;
			}
		}
		System.out.println("Teste: "+contaTeste);
		System.out.println("Croci: "+contaCroci);
		
		/**Modalità di gioco 1:
		 *Vince la monetina che per 
		 *prima ottiene 3 volte Testa*/
		
		System.out.println("--- Modalità di gioco 1 ---");
		int contaTestem1=0;
		int contaTestem2=0;
		
		while(contaTestem1<3 && contaTestem2<3) {
			m1.lancia();
			m2.lancia();
			if(m1.getFaccia() == 0) {
				contaTestem1++;
			}
			if(m2.getFaccia() == 0) {
				contaTestem2++;
			}
		}
		
		if(contaTestem1 == contaTestem2) {
			System.out.println("Parità");
		}else {
			if(contaTestem1 == 3) {
				System.out.println("Monetina 1 vince!");
			}else {
				System.out.println("Monetina 2 vince!");
			}
		}
		
		/**Modalità di gioco 2:
		 *Vince la monetina che per 
		 *prima ottiene 3 teste CONSECUTIVE*/
		
		System.out.println("--- Modalità di gioco 2 ---");
		
		/*COMPLETA TU!*/
	}
}
