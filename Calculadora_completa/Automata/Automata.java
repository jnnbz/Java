package Automata;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Automata {

	private static byte Estado = 0;
	private static TextField Visor;
	private static double Operando1 = 0d;
	private static double Operando2 = 0d;
	private static char Operador = ' ';

	// hay un espacio entre las dos comillas sencillas
	// para evitar un error de compilacion

	public Automata(TextField V) {
		Visor = V;
	}

	public static void CaracterIntroducido(char Car) throws OpcionErronea {
		if (Visor.getText().equals("No valido"))
			Visor.setText("");

		switch (Estado) {

		case 0: {
			switch (Car) {

			case '-':
				Estado = 1;
				Visor.setText(Visor.getText() + Car);
				break;
			case '+':
			case '*':
			case '/':
			case '^':
			case 'h':
			case '.':
			case '=':
			case 'D':
				Estado = 1;
				UIManager.put("Panel.background", Color.cyan);
				JOptionPane.showMessageDialog(null, "Introduzca un número",
						"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				
				
				break;

			// Numeros

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 2;
				Visor.setText(Visor.getText() + Car);
				break;

			case 'C': {
				Iniciar();
				break;

			}

			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 1: {
			switch (Car) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 2;
				Visor.setText(Visor.getText() + Car);
				break;

			case 'C': {
				Iniciar();
				break;
			}

			case '-':
			case '+':
			case '*':
			case '/':
			case '^':
			case 'h':
			case '.':
			case '=':
			case 'D':
				Estado = 1;
				
				UIManager.put("Panel.background", Color.cyan);
				JOptionPane.showMessageDialog(null, "Introduzca un número",
						"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				break;
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 2: {
			switch (Car) {
			case '.':
				Estado = 1;
				Visor.setText(Visor.getText() + Car);
				break;

			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case 'h':
				Estado = 5;
				Operador = Car;
				Operando1 = Double.parseDouble(Visor.getText());
				Visor.setText("");
				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 2;
				Visor.setText(Visor.getText() + Car);
				break;
			case '=':
				Estado = 5;
				UIManager.put("Panel.background", Color.cyan);
				JOptionPane.showMessageDialog(null, "Introduzca un número",
						"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			case 'C': {
				Iniciar();
				break;

			}
			case 'D': {
				Iniciar();
				break;
			}

			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 3: {
			switch (Car) {

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 4;
				Visor.setText(Visor.getText() + Car);
				break;
			case 'C': {
				Iniciar();
				break;
			}
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 4: {
			switch (Car) {

			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case 'h':
				Estado = 5;
				Operador = Car;
				Operando1 = Double.parseDouble(Visor.getText());
				Visor.setText("");
				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 4;
				Visor.setText(Visor.getText() + Car);
				break;
			case 'C': {
				Iniciar();
				break;
			}
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 5: {
			switch (Car) {
			case '-':
				Estado = 6;
				Visor.setText(Visor.getText() + Car);
				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 7;
				Visor.setText(Visor.getText() + Car);
				break;
			case '=':
				Estado = 7;
				UIManager.put("Panel.background", Color.cyan);
				JOptionPane.showMessageDialog(null, "Introduzca un número",
						"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			case 'C': {
				Iniciar();
				break;
			}
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 6: {
			switch (Car) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 7;
				Visor.setText(Visor.getText() + Car);
				break;
			case 'C': {
				Iniciar();
				break;
			}

			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 7: {
			switch (Car) {
			case '.':
				Estado = 8;
				Visor.setText(Visor.getText() + Car);
				break;
			case '=':
				Estado = 10;
				Operando2 = Double.parseDouble(Visor.getText());
				double Resultado = ObtenerResultado();
				/*
				 * Redondeamos el resultado y lo pasamos a String para mostrar
				 * valor en pantalla
				 */
				Visor.setText(String.valueOf(Math.round(Resultado)));
				Operando1 = Resultado;

				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 7;
				Visor.setText(Visor.getText() + Car);
				break;

			case 'C': {
				Iniciar();
				break;
			}
			case 'D': {
				Estado = 7;
				String pant = Visor.getText();
				pant = "0";
				Visor.setText(pant);
			}
				break;
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 8: {
			switch (Car) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 9;
				Visor.setText(Visor.getText() + Car);
				break;
			case 'C': {
				Iniciar();
				break;
			}
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 9: {
			switch (Car) {
			case '=':
				Estado = 10;
				Operando2 = Double.parseDouble(Visor.getText());
				double Resultado = ObtenerResultado();

				Visor.setText(String.valueOf(Math.round(Resultado)));
				Operando1 = Resultado;

				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				Estado = 9;
				Visor.setText(Visor.getText() + Car);
				break;
			case 'C': {
				Iniciar();
				break;
			}
			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		// ............................................//

		case 10: {
			switch (Car) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case 'h':
				Estado = 5;
				Operador = Car;
				Visor.setText("");
				break;
			case '=':
				Estado = 1;
				UIManager.put("Panel.background", Color.cyan);
				JOptionPane.showMessageDialog(null, "Introduzca un número",
						"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			case 'C': {
				Iniciar();
				break;
			}

			default:
				Iniciar();
				throw new OpcionErronea();
			}
		}
			break;

		}
	}

	// Metodo para volver a iniciar operaciones

	private static void Iniciar() {

		Estado = 0;
		Visor.setText(" ");
		Operando1 = 0f;
		Operando2 = 0d;
		Operador = ' ';
	}

	// Metodo para obtener el resultado de cada función

	private static double ObtenerResultado() {

		// Evaluar la division por cero

		if (Operando2 == 0) {
			Visor.setText("Error");
			UIManager.put("Panel.background", Color.cyan);
			JOptionPane.showMessageDialog(null, "No se puede dividir por cero",
					"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			Iniciar();

		}

		switch (Operador) {
		case '+':
			return Operando1 + Operando2;
		case '-':
			return Operando1 - Operando2;
		case '*':
			return Operando1 * Operando2;
		case '/':
			return Operando1 / Operando2;
		case '^':
			return Math.pow(Operando1, Operando2);
		case 'h':
			return Math.hypot(Operando1, Operando2);
		default:
			return 0d;

		}// end _switch(Operador)
	}

}// end class 

