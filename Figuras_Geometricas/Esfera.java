package Figuras_Geometricas;

// Declaraci�n de la clase Esfera

public class Esfera extends Figura {

	//Para el caso de la esfera el atributo ser� el Radio 
	
	protected  double Radio;
	
	// Constructor de la clase, al cual se le pasan las f�rmulas para calcular la superficie y el volumen
	// en este caso se hace uso de la constante PI incluida en Java
	
	protected Esfera (double Radio_esf) {
		super(4*Math.PI*(Math.pow(Radio_esf, 2)),(4*Math.PI*(Math.pow(Radio_esf, 2)))/3);
		Radio = Radio_esf;
		
	}	
	
	// Declaraci�n de los set\get.Los m�todos "get" y "set" proporcionan acceso a propiedades 
		//restringidas en los objetos Java.
	public double getRadio() {
		return Radio;
	}

	public  void setRadio(double radio) {
		Radio = radio;
	}
}
		
