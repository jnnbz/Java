package Automata;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlTeclado extends KeyAdapter {

	private TextField Resultado;
	private Automata InstanciaAutomata;
	private Color ColorExit;

	public ControlTeclado(Automata automata, Color colorbot) {
		InstanciaAutomata = automata;
		ColorExit = colorbot;

	}

	@Override
	public void keyPressed(KeyEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();

		char Car = Boton.getLabel().charAt(0);
		// char Car = EventoQueLlega.getKeyChar();

		System.out.print(Car);
		try {
			InstanciaAutomata.CaracterIntroducido(Car);
		} catch (OpcionErronea e) {
			Resultado.setText(e.getMessage());
		}
	}

	@Override
	public void keyReleased(KeyEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();
		Boton.setBackground(Color.orange);

	}

	public void keyTyped(KeyEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();
		Boton.setBackground(ColorExit);

	}

}