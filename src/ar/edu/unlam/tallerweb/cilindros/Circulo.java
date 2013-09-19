package ar.edu.unlam.tallerweb.cilindros;

public class Circulo {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI * this.radio * this.radio;
	}
	
}
