package esempi;

import util.Mat;

public class Frazione {
	
	private int num, den;
	
	//costruttore di default
	public Frazione() {
		this.num = 0;
		this.den = 1;
	}
	
	//costruttore normale
	public Frazione(int num, int den) {
		this.num = num;
		this.den = den;
		if(den == 0) {
			System.out.println("Denominatore non valido");
			System.exit(0);
		}
	}
	
	//costruttore di copia
	public Frazione(Frazione f) {
		this.num = f.num;
		this.den = f.den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
		
	public Frazione reciproca() {
		return new Frazione(this.den,this.num);
	}
	
	public void miaReciproca() {
		int t;
		t = this.num;
		this.num = this.den;
		this.den = t;
	}
	
	public Frazione opposta() {
		return new Frazione(-this.num,this.den);
	}
	
	public Frazione semplifica() {
		int m = Mat.MCD(this.num,this.den);
		return new Frazione(this.num/m,this.den/m);
	}
	
	public String toString() {
		return this.num+"/"+this.den;
	}
	
	public Frazione somma(Frazione f) {
		int m = Mat.mcm(this.den,f.den);
		int nuovoNum = m*this.num/this.den +m*f.num/f.den;
		return new Frazione(nuovoNum,m);
	}
	
	public Frazione moltiplica(Frazione f) {
		int nuovoNum = this.num*f.num;
		int nuovoDen = this.den*f.den;
		return new Frazione(nuovoNum,nuovoDen);
	}
	
	public Frazione dividi(Frazione f) {
		int nuovoNum = this.num*f.den;
		int nuovoDen = this.den*f.num;
		return new Frazione(nuovoNum,nuovoDen);
	}
	
	public Frazione sottrai(Frazione f) {
		int m = Mat.mcm(this.den,f.den);
		int nuovoNum = m*this.num/this.den - m*f.num/f.den;
		return new Frazione(nuovoNum,m);
	}
	
	public static void main(String[] args) {
		Frazione f1 = new Frazione(3,4);
		System.out.println("Prima frazione: "+f1);
		Frazione f2 = f1.reciproca();
		System.out.println("Seconda frazione: "+f2);
		f1.miaReciproca();
		System.out.println("Prima frazione dopo miaReciproca(): "+f1);
		Frazione f3 = new Frazione(1,5);
		Frazione f4 = f1.somma(f3);//3/4 + 1/5
	}
	
}
