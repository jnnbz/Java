// Super Clase Principal

package Figuras_Geometricas;

public abstract class Figura {

	// Atributos comunes a todas las clases hijas

	protected double superficie;
	protected double volumen;
	
	//Un ejemplo de sobrecarga dentro de nuestro programa 
	
	protected Figura (){
		this.superficie = 0; 
		this.volumen = 0; 		
	}
	
	protected Figura(double superficie, double volumen) {
		
		this.superficie = superficie;
		this.volumen = volumen;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
		
	}

	public double getSuperficie() {
		return superficie;
	}
	
	public void setVolumen (double volumen) {
		this.volumen = volumen;
	}

	public double getVolumen() {
		return volumen;
		
	}
	
	}

