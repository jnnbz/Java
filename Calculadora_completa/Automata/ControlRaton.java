package Automata;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControlRaton extends MouseAdapter {

	private TextField Resultado;
	private Automata InstanciaAutomata;
	private Color ColorExit;

	public ControlRaton(Automata automata, Color ColorBoton) {
		InstanciaAutomata = automata;
		ColorExit = ColorBoton;

	}

	public void mouseClicked(MouseEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();

		char Car = Boton.getLabel().charAt(0);
		Boton.setBackground(Color.orange);
		if (Car == 'D')
			System.out.print(' ');
		else
			System.out.print(Car);
		try {
			InstanciaAutomata.CaracterIntroducido(Car);
		} catch (OpcionErronea e) {
			Boton.setBackground(Color.RED);
			

			Resultado.setText(e.getMessage());

		}
	}

	public void mouseEntered(MouseEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();
		Boton.setBackground(Color.orange);
	}

	public void mouseExited(MouseEvent EventoQueLlega) {
		Button Boton = (Button) EventoQueLlega.getSource();
		Boton.setBackground(ColorExit);

	}

}