package musica;

public class StackCD {
	private CD[] scaffale;
	private int p=0;
	
	public StackCD(int n) {
		scaffale = new CD[n];
	}
	
	//metti
	public void push(CD x) {
		if(p<scaffale.length) {
			scaffale[p] = x;
			p++;
		}else {
			System.out.println("Stack Pieno!");
		}
	} //inserimento
	
	//togli
	public CD pop() {
		if(p>0) {
			CD x = scaffale[p-1];
			p--;
			return x;
		}
		System.out.println("Pila vuota");
		return null;
	}
	
	public CD top() {
		return scaffale[p];
	}
	
	public int size() {
		return p;
	}
	
	public int length() {
		return scaffale.length;
	}
	
	public void mostraStackCD() {
		for(int i=0; i<p; i++) {
			System.out.println(scaffale[i]);
		}
	}
	
}
