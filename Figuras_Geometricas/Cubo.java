// Clase cubo

package Figuras_Geometricas;

//Declaracion de la clase 

public class Cubo extends Figura{
	// Declaración del atributo 

	private double arista; 

	// En la implementación del constructor,le indicamos
	// las fórmulas correspondientes para calculas Superficie y Volumen
	protected Cubo (double lado) {

		super ((6*(Math.pow(lado, 2))),(Math.pow(lado, 3))); 
		arista = lado;

	}
	/* Donde superficie de un cubo es = (6*(Math.pow(lado, 2)
	y su volumen sera calculado mediante : (Math.pow(lado, 3) V= A EXP 3
	 Para todo ello hacemos uso de las funciones del propio lenguaje ya implementadas disponibles 
	 El parámetro Lado va a ser el número ingresado por el usuario */

	// // Declaración de los set\get.Los métodos "get" y "set" proporcionan acceso a propiedades 
	//restringidas en los objetos Java.

	public double getArista() {
		return arista;
	}
	public void setArista(double arista) {
		this.arista = arista;
	}
}



