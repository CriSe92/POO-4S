package geometria;
import java.util.*;

public class Rettangolo {
	
	private Punto p1, p2, p3, p4;
	private double baseMin, baseMax;
	
	public Rettangolo () {
		p1= new Punto (2,3);
		p2= new Punto (5,7);
		p3= new Punto (2,4);
		p4= new Punto (5,9);
		
	    baseMin=p1.distanza(p3);
		baseMax=p1.distanza(p2);
	}
	
	public Rettangolo(Punto p1, Punto p2, Punto p3, Punto p4){
		this.p1=new Punto(p1);
		this.p2=new Punto(p2);
		this.p3=new Punto(p3);
		this.p4=new Punto(p4);

		baseMin=p1.distanza(p3);
		baseMax=p1.distanza(p2);
	}
	
	public Rettangolo (Rettangolo r) {
		this.p1= new Punto (r.p1);
		this.p2= new Punto (r.p2);
		this.p3= new Punto (r.p3);
		this.p4= new Punto (r.p4);
		
		this.baseMin= r.baseMin;
		this.baseMax= r.baseMax;
	}
	
	public double getbaseMin(){
		return baseMin;
	}
	public double getbaseMax() {
		return baseMax;
	}
	public double perimetro() {
		return (baseMin+baseMax)*2;
	}
	public double area() {
		return baseMin*baseMax;
	}
	public String toString() {
		return "Rettangolo con vertici: "+p1+", "+p2+", "+p3+", "+p4+"; Base con valore uguale a "+baseMax+" e altezza con valore uguale a "+baseMin;
	}
	
	public static void main( String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Punti creati = "+Punto.getPuntiCreati());
		System.out.println("Inserire coordinate x e y per il punto p1");
		double x1= sc.nextDouble();
		double y1= sc.nextDouble();
		Punto p1= new Punto (x1, y1);	
		System.out.println("Punti creati = "+Punto.getPuntiCreati());

		System.out.println("Inserire coordinate x e y per il punto p2");
		double x2= sc.nextDouble();
		double y2= sc.nextDouble();
		Punto p2= new Punto (x2, y2);
		System.out.println("Punti creati = "+Punto.getPuntiCreati());

		System.out.println("Inserire coordinate x e y per il punto p3");
		double x3= sc.nextDouble();
		double y3= sc.nextDouble();
		Punto p3= new Punto (x3, y3);
		System.out.println("Punti creati = "+Punto.getPuntiCreati());

		System.out.println("Inserire coordinate x e y per il punto p4");
		double x4= sc.nextDouble();
		double y4= sc.nextDouble();
		Punto p4= new Punto (x4, y4);
		//Sono stati creati 4 punti, quindi puntiCreati dovrebbe valere 4
		System.out.println("Punti creati = "+Punto.getPuntiCreati());

		Rettangolo r1= new Rettangolo();
		Rettangolo r2= new Rettangolo(p1, p2, p3, p4);
		Rettangolo r3= new Rettangolo (r2);
		
		/*
		 * All'interno di ogni costruttore vengono creati 4 Punti, per un totale 
		 * di 12 visto che sono stati creati tre rettangolo. Inoltre, altri 4 punti erano
		 * stati creati in precedena, quindi la variabile puntiCreati ora vale 16
		 */
		System.out.println("Punti creati = "+Punto.getPuntiCreati());

		System.out.println("Rettangolo creato con costruttore di default: ");
		System.out.println(r1);
		
		System.out.println("Rettangolo creato con costruttore normale: ");
		System.out.println(r2);

		System.out.println("Rettangolo creato con costruttore di copia: ");
		System.out.println(r3);

		//System.out.println("Il perimetro è pari a: "r2.perimetro);
	}
}
