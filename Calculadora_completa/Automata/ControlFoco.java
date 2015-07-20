package Automata;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ControlFoco implements FocusListener {
	private Color ColorBoton;
	private Color Colorsalida;

	public ControlFoco(Automata automata, Color ColorExit) {
		this.ColorBoton = ColorBoton;
		Colorsalida = ColorExit;
	}

	public void focusGained(FocusEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();
		Boton.setBackground(Color.orange);
	}

	public void focusLost(FocusEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();
		Boton.setBackground(Colorsalida);
	}
}
