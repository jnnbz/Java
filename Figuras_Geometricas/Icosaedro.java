package Figuras_Geometricas;

// Declaración de la clase 

public  class Icosaedro extends Figura {
	
	// Atributo
	
	private double arista;
	
	// Método constructor
	
	protected Icosaedro (double lado) {
			super ((5*Math.sqrt(3))*(Math.pow(lado, 2)), ((double)5/12 )*(3+(Math.sqrt(5)))*(Math.pow(lado, 3)));
			arista = lado;

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
		