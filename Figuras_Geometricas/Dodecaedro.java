package Figuras_Geometricas;

// Declaraci�n de la clase Dodecaedro

public   class Dodecaedro extends Figura {
	
	// Atributo
	
	protected double arista;
	
	/* Constructor de la clase, al cual se le pasa el el valos del resultado de la superficie a 
	 y el volumen trav�s de la formula indicada en cada caso*/
	
	protected Dodecaedro (double lado) {
		super((3*(Math.sqrt(25+(10*Math.sqrt(5))))*(Math.pow(lado, 2))),(((double)1/4)*(15+(7*Math.sqrt(5)))*(Math.pow(lado, 3))));
		arista = lado;

	}
	// Declaraci�n de los set\get.Los m�todos "get" y "set" proporcionan acceso a propiedades 
		//restringidas en los objetos Java.

	public double getArista(double arista) {
		return arista;
	}
	public void setArista(double arista) {
		this.arista = arista;
	}
}
		
		
