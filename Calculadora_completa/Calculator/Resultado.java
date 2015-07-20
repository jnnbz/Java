package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Resultado extends Frame {

	// Atributos
	private TextField pantalla;
	private Panel paneloperandos;

	// Constructor

	public Resultado(Color c) {
		pantalla = new TextField(" ", 10);
		pantalla.setFont(new Font("Arial", Font.CENTER_BASELINE, 25));
		pantalla.setEditable(false);
		pantalla.setBackground(Color.WHITE);

		paneloperandos = new Panel();

		paneloperandos.add(pantalla);

		paneloperandos.setVisible(true);
		validate();
	}

	// Accedente
	public Panel getpaneloperandos() {
		return paneloperandos;
	}

	public TextField getPantalla() {
		return pantalla;
	}

	// Mutadores
	public void setPantalla(String p) {
		pantalla.setText(p);
	}

}
