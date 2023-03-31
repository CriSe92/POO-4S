package esempi;

public class StackInt {
	private int[] pila;
	private int p = 0;
	
	public StackInt(int n) {
		pila = new int[n];
	}
	
	public int pop() {
		if(p>0) {
			int x = pila[p-1];
			p--;
			return x;
		}
		System.out.println("Pila vuota");
		return -1;
	} //rimozione
	
	public void push(int x) {
		if(p<pila.length) {
			pila[p] = x;
			p++;
		}else {
			System.out.println("Stack Pieno!");
		}
	} //inserimento
	
	public boolean pieno() {
		return p == pila.length;
	}
	
	public boolean vuoto() {
		/*if(p == 0) {
			return true;
		}else {
			return false;
		}*/
		
		return p == 0;
	}
	
	public int size() { //quanti elementi ci sono nello stack
		return p;
	} 
	
	public void stampaStack() {
		for(int i=0; i<p; i++) {
			System.out.println(pila[i]);
		}
	}
	
	public static void main(String[] args) {
		//Prova lo Stack
		StackInt s = new StackInt(5);
		
		s.push(52);
		s.push(20);
		s.push(0);
		s.push(12);
		s.push(15);
		
		s.push(18);
		
		int x = s.pop();
		System.out.println("Valore restituito: "+x);
		x = s.pop();
		System.out.println("Valore restituito: "+x);
		s.push(30);
		s.stampaStack();
		
	}
}
