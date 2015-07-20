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

public class OpeExtras extends Frame {

	// Atributos

	private Panel panelExtra;
	private Button[] opExtra;

	// Constructor

	public OpeExtras(Color c) {
		super();
		panelExtra = new Panel();
		panelExtra.setLayout(new GridLayout(4, 3));
		BotOpExtras();
		panelExtra.setVisible(true);
		validate();

	}

	// Metodos para crear el panel del botones

	private void BotOpExtras() {

		opExtra = new Button[4];
		opExtra[0] = new Button("C");
		opExtra[1] = new Button("D");
		opExtra[2] = new Button("^");
		opExtra[3] = new Button("h");

		// Añadiendo los botones al panel

		panelExtra.add(opExtra[0]);
		panelExtra.add(opExtra[1]);
		panelExtra.add(opExtra[2]);
		panelExtra.add(opExtra[3]);

		// Asignando colores a los botones

		opExtra[0].setBackground(Color.MAGENTA);
		opExtra[1].setBackground(Color.MAGENTA);
		opExtra[2].setBackground(Color.MAGENTA);
		opExtra[3].setBackground(Color.MAGENTA);

		// Eventos para los botones

		opExtra[0].addMouseListener(new ControlRaton(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[1].addMouseListener(new ControlRaton(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[2].addMouseListener(new ControlRaton(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[3].addMouseListener(new ControlRaton(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));

		// Control de foco para color

		opExtra[0].addFocusListener(new ControlFoco(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[1].addFocusListener(new ControlFoco(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[2].addFocusListener(new ControlFoco(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[3].addFocusListener(new ControlFoco(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));

		// Control de teclado

		opExtra[0].addKeyListener(new ControlTeclado(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[1].addKeyListener(new ControlTeclado(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[2].addKeyListener(new ControlTeclado(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
		opExtra[3].addKeyListener(new ControlTeclado(new Automata(
				GUICalculadora.Instanciaresult.getPantalla()), Color.magenta));
	}

	public Panel getPanelExtra() {
		return panelExtra;
	}

}
