package Figuras_Geometricas;

// Declaraci�n de la clase 

public  class Tetraedro extends Figura {
	private double arista;				   
	
	/* En la implementaci�n del constructor,le indicamos
	 las f�rmulas correspondientes para calculas Superficie y Volumen*/
	
	protected Tetraedro(double lado) {
		super(lado*lado* (double) 1.732,Math.sqrt(2)/12*(Math.pow(lado, 3)));
		arista = lado;
	
		/* Donde superficie de un tetraedro es =  lado*lado* (double) 1.732
	y su volumen sera calculado mediante : Math.sqrt(2)/12*(Math.pow(lado, 3)))
	 Para todo ello hacemos uso de las funciones del propio lenguaje ya implementadas disponibles */
		
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
		
		

