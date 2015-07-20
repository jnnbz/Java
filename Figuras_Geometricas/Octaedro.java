package Figuras_Geometricas;

//  Declaraci�n de la case Octaedro 

public  class Octaedro extends Figura{
	
	// Atributo
	
	private double arista;
	
	/* Constructor de la clase, al cual se le pasa el el valos del resultado de la superficie a 
	 y el volumen trav�s de la formula indicada en cada caso*/
	
	protected Octaedro (double lado ) {
		super((2 * (Math.sqrt(3)))*(Math.pow(lado, 2)),((double) 1/3)*(Math.sqrt(3))*(Math.pow(lado, 3)));

	}
	// Declaraci�n de los set\get.Los m�todos "get" y "set" proporcionan acceso a propiedades 
	//restringidas en los objetos Java.
	
	public double getArista() {
		return arista;
	}
	public void setArista(double arista) {
		this.arista = arista;
	}

}
		
		


	