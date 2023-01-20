package geometria;

public class Cerchio {
	
	private Punto centro;
	private double raggio;
	
	public Cerchio() {
		centro = new Punto(0,0);
		raggio = 5;
	}
	
	public Cerchio(Punto c, double r) {
		this.centro = new Punto(c);
		this.raggio = r;
	}
	
	public Cerchio(Cerchio c) {
		this.raggio = c.raggio;
		this.centro = new Punto(c.centro);
		//this.centro = new Punto(c.centro.getX(),c.centro.getX());
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public double perimetro() {
		return 2*this.raggio*Math.PI;
	}
	
	public double area() {
		return this.raggio*Math.PI;
	}

}
