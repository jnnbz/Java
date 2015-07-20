package Calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import Automata.Automata;
import Automata.ControlFoco;
import Automata.ControlRaton;
import Automata.ControlTeclado;

public class Digitos extends Frame {

	// Atributos

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel panelnumeros;
	private Button[] botones;

	// Constructor

	public Digitos(Color c) {
		super();
		panelnumeros = new Panel();
		panelnumeros.setLayout(new GridLayout(4, 3));
		BotNum();
		panelnumeros.setVisible(true);
		validate();

	}

	// Creando los botones

	private void BotNum() {

		botones = new Button[12];
		for (int i = 0; i < 10; i++) {
			botones[i] = new Button(Integer.toString(i));

		}
		botones[10] = new Button(".");
		botones[11] = new Button("=");

		// Añadiendo los botones al panel

		for (int i = 0; i < 10; i++) {
			panelnumeros.add(botones[i]);

		}
		panelnumeros.add(botones[10]);
		panelnumeros.add(botones[11]);

		// Asignando colores a los botones

		for (int i = 0; i < 10; i++) {
			botones[i].setBackground(Color.cyan);

		}

		botones[10].setBackground(Color.cyan);
		botones[11].setBackground(Color.cyan);

		// Eventos para los botones

		for (int i = 0; i < 12; i++) {
			botones[i].addMouseListener(new ControlRaton(new Automata(
					GUICalculadora.Instanciaresult.getPantalla()), Color.cyan));

			botones[i].addFocusListener(new ControlFoco(new Automata(
					GUICalculadora.Instanciaresult.getPantalla()), Color.cyan));
			botones[i].addKeyListener(new ControlTeclado(new Automata(
					GUICalculadora.Instanciaresult.getPantalla()), Color.cyan) {
				
				
				// Añadimos la funcionalidad al uso del teclado numerico
				
				public void keyTyped(KeyEvent e) {
					
					// Si el caracter introducido es un digito...
					
					if (Character.isDigit(e.getKeyChar())) {
						System.out.println(e.getKeyChar());

						switch (e.getKeyChar()) {
						case '1': {
							botones[0].transferFocus();
							break;
						}
						
						case '2': {
							botones[1].transferFocus();
							break;
						}
						case '3': {
							botones[2].transferFocus();
							break;
						}
						case '4': {
							botones[3].transferFocus();
							break;
						}
						case '5': {
							botones[4].transferFocus();
							break;
						}
						case '6': {
							botones[5].transferFocus();
							break;
						}
						case '7': {
							botones[6].transferFocus();
							break;
						}
						case '8': {
							botones[7].transferFocus();
							break;
						}
						case '9': {
							botones[8].transferFocus();
							break;
						}
						case '0': {
							botones[9].transferFocus();
							break;
						}

						}
					}
				}
			});
		}

	}
	// Devolvemos un panel con los botones del 0 al 9, la "," y el "="

	public Panel getPanelNumeros() {
		return panelnumeros;
	}
}
