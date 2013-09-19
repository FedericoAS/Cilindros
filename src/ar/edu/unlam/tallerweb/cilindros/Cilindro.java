package ar.edu.unlam.tallerweb.cilindros;

public class Cilindro {

	private Circulo circulo;
	private double altura;
	
	public Cilindro(Circulo circulo, double altura) {
		this.circulo = circulo;
		this.altura = altura;
	}

	public double getVolumen() {
		return this.circulo.getArea() * this.altura;
	}
	
	/**
	 * 
	 * @param otro: el otro cilindro
	 * @return = 0, si son iguales
	 * @return > 0, si es mayor que "otro"
	 * @return < 0, si es menor que "otro"
	 */
	public int compareTo(Cilindro otro) {
		// se reutiliza el comportamiento de compareTo de la clase Double
		return new Double(this.getVolumen()).compareTo(otro.getVolumen());
	}
	
}
