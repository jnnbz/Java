package Automata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlAccion implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("keyPressed=" + arg0.getActionCommand());
	}

}
