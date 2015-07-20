package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import Automata.Automata;
import Automata.ControlVentana;

public class GUICalculadora extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos
	private JFrame Mimarco;
	private Panel panelprincipal;
	private BorderLayout PuntosCardinales;
	private Digitos Instanciadigitos;
	static Resultado Instanciaresult = new Resultado(Color.WHITE);;
	private OpeExtras InstanciaOpeExtras;
	private Operadores InstanciaOperadores;
	JMenuBar contenedor;
	JMenu archivo, ver, ayuda, edicion;

	// Constructor de la ventana

	public GUICalculadora() {
		super();
		PuntosCardinales = new BorderLayout();
		Mimarco = new JFrame();
		panelprincipal = new Panel();
		Instanciadigitos = new Digitos(Color.CYAN);
		Instanciaresult = new Resultado(Color.WHITE);
		InstanciaOpeExtras = new OpeExtras(Color.CYAN);
		InstanciaOperadores = new Operadores(Color.CYAN);
		Mimarco.add(panelprincipal);
		contenedor = new JMenuBar();
		archivo = new JMenu("Archivo");
		ver = new JMenu("Ver");
		edicion = new JMenu("Edición");
		ayuda = new JMenu("Ayuda");

		// agregando Barra menu

		this.setJMenuBar(contenedor);
		contenedor.add(archivo);
		contenedor.add(ver);
		contenedor.add(edicion);
		contenedor.add(ayuda);

		// Dando Formato a los bordes

		contenedor.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		archivo.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		archivo.setBackground(Color.magenta);
		ver.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		ver.setBackground(Color.green);
		edicion.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		edicion.setBackground(Color.blue);
		ayuda.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		ayuda.setBackground(Color.orange);

		// Añadiendo Opciones a la barra de menu

		AccionMenues accionguardar = new AccionMenues("Guardar");
		AccionMenues accionsalir = new AccionMenues("Salir");
		AccionMenues accionhojacalculo = new AccionMenues("Hojas de Calculo");
		AccionMenues accioncopiar = new AccionMenues("copiar");
		AccionMenues accionpegar = new AccionMenues("pegar");
		AccionMenues accionverayuda = new AccionMenues("Manual de Usuario");

		archivo.add(accionguardar);
		archivo.add(accionsalir);
		ver.add(accionhojacalculo);
		edicion.add(accioncopiar);
		edicion.add(accionpegar);
		ayuda.add(accionverayuda);

		// Formato de todo el panel

		panelprincipal.add(getJMenuBar());
		panelprincipal.add(Instanciaresult.getpaneloperandos(),
				BorderLayout.NORTH);
		panelprincipal.add(InstanciaOpeExtras.getPanelExtra(),
				BorderLayout.EAST);
		panelprincipal.add(Instanciadigitos.getPanelNumeros(),
				BorderLayout.CENTER);
		panelprincipal.add(InstanciaOperadores.getPanelOperadores(),
				BorderLayout.WEST);

		Mimarco.addWindowListener(new ControlVentana());

		Mimarco.setSize(215, 250);
		Mimarco.setTitle("Terminator");
		Mimarco.setVisible(true);
		Mimarco.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class AccionMenues extends AbstractAction { // Clase interna para los
												// eventos de ratón en la barra
												// de menúes.

		String cadena;

		public AccionMenues(String cadena) {
			super(cadena);
			this.cadena = cadena;
		}

		public void actionPerformed(ActionEvent e) {
			String accion = new String(e.getActionCommand());

			if (accion.equals("Salir")) {
				System.exit(0);
			} else if (accion.equals("Guardar")) {

			} else if (accion.equals("Herramientas")) {

			}

		}
	}

	public static void main(String[] args) {

		new UIManager();
		UIManager.put("OptionPane.background", Color.CYAN);
		UIManager.put("Panel.background", Color.pink);
		JOptionPane.showMessageDialog(null, " Bienvenidos a Terminator ");

		new GUICalculadora();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
