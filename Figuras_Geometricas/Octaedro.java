package Figuras_Geometricas;

//  Declaración de la case Octaedro 

public  class Octaedro extends Figura{
	
	// Atributo
	
	private double arista;
	
	/* Constructor de la clase, al cual se le pasa el el valos del resultado de la superficie a 
	 y el volumen través de la formula indicada en cada caso*/
	
	protected Octaedro (double lado ) {
		super((2 * (Math.sqrt(3)))*(Math.pow(lado, 2)),((double) 1/3)*(Math.sqrt(3))*(Math.pow(lado, 3)));

	}
	// Declaración de los set\get.Los métodos "get" y "set" proporcionan acceso a propiedades 
	//restringidas en los objetos Java.
	
	public double getArista() {
		return arista;
	}
	public void setArista(double arista) {
		this.arista = arista;
	}

}
		
		


	