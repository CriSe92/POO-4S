package esempi;

import java.util.Scanner;

public class UsaIlCellulare {
	
	public static void main(String[] args) {
		//Compro il cellulare
		Cellulare c = new Cellulare(0,0,15);
		
		//Manda 10 sms
		for(int i=0; i<10; i++) {
			if(c.sms()) {
				System.out.println("Sms inviato!");
			}else{
				System.out.println("Sms non inviato!");
			}
		}
		
		System.out.println("Quanto è carica la batteria?");
		System.out.println(c.getLivelloCarica());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto dura la chiamata?");
		int d = sc.nextInt();
		
		int secondiNonEffettuati = c.telefona(d);
		
		if(secondiNonEffettuati == 0) {
			System.out.println("Chiamata terminata con successo!");
		}else {
			System.out.println("Non ho potuto terminare la chiamata!");
			System.out.println("Durata effettiva: " + (d - secondiNonEffettuati));
		}
		
	}
	
}
