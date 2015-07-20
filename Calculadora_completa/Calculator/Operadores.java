package Calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import Automata.Automata;
import Automata.ControlFoco;
import Automata.ControlRaton;
import Automata.ControlTeclado;

public class Operadores extends Frame {

	/* Atributos */

	private Panel paneloperadores;
	private Button[] operadores;
	private Color colorOper;

	/* Constructor */

	public Operadores(Color c) {
		super();
		paneloperadores = new Panel();
		paneloperadores.setLayout(new GridLayout(4, 1));
		BotOpe();
		paneloperadores.setVisible(true);
		validate();
	}

	/* Botones */

	private void BotOpe() {
		operadores = new Button[4];
		for (int i = 0; i < 4; i++) {
			operadores[i] = new Button(Integer.toString(i));
		}

		operadores[0] = new Button("+");
		operadores[1] = new Button("-");
		operadores[2] = new Button("*");
		operadores[3] = new Button("/");

		/* Adición de botones */

		for (int i = 0; i < 4; i++) {
			paneloperadores.add(operadores[i]);
		}
		paneloperadores.add(operadores[0]);
		paneloperadores.add(operadores[1]);
		paneloperadores.add(operadores[2]);
		paneloperadores.add(operadores[3]);

		/* Color de los botones */

		for (int i = 0; i < 4; i++) {
			operadores[i].setBackground(Color.GREEN);
		}

		/* Eventos de los botones */

		for (int i = 0; i < 4; i++) {
			operadores[i]
					.addMouseListener(new ControlRaton(new Automata(
							GUICalculadora.Instanciaresult.getPantalla()),
							Color.green));
			operadores[i]
					.addFocusListener(new ControlFoco(new Automata(
							GUICalculadora.Instanciaresult.getPantalla()),
							Color.green));

			// controlTeclado

			operadores[i]
					.addKeyListener(new ControlTeclado(new Automata(
							GUICalculadora.Instanciaresult.getPantalla()),
							Color.green));

		}
	}

	/* Devolución del panel de operadores */

	public Panel getPanelOperadores() {
		return paneloperadores;
	}

}