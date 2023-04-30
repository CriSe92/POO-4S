package geometria;

import java.util.Scanner;

import javax.swing.border.MatteBorder;

public class Punto3D extends Punto{
	private double z;
	
	static Scanner sc = new Scanner(System.in);
		
	 //costruttore di default
	   public Punto3D(){
		   super();
		   this.z = 0;
	   }
	   
	   //costruttore normale
	   public Punto3D( double x, double y, double z ){
		   super(x,y);
		   this.z = z;
	   }
	   
	 //costruttore di copia
	   public Punto3D( Punto3D p ){
		   super(p.getX(),p.getY());
		   z = p.z;
	   }
	   
	   public double getZ() {
		   return z;
	   }
	   
	   public void sposta(double px, double py, double pz) {
		   super.sposta(px, py);
		   this.z = pz;
	   }
	   
	   public void sposta(double px, double py) {
		   super.sposta(px, py);
		   System.out.println("Inserisci z: ");
		   this.z = sc.nextDouble();
	   }
	   
	   public double distanza(Punto3D p) {
		  //double dist2D = Math.pow(super.distanza(new Punto(p.getX(),p.getY())),2);
		  //return Math.sqrt(dist2D+Math.pow((this.z+p.getZ()),2));
		  
		  return Math.sqrt(Math.pow((this.getX() - p.getX()),2)+
		  Math.pow((this.getY() - p.getY()),2)+
		  Math.pow((this.getZ() - p.getZ()),2)); 
	   }
	   
	   public String toString() {	   
		   return "("+getX()+","+this.getY()+","+z+")";
	   }
	   


}
