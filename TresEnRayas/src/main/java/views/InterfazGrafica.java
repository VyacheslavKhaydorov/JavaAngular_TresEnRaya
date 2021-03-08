/**
 * 
 */
package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import models.TresEnRaya;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.ActionEvent;


/**
 * @author  Ingrid Dominguez
 * 			Miguel A. Sastre
 * 			Vyacheslav Khaydorov
 *
 */
public class InterfazGrafica extends JFrame {

	//Objetos de la interfaz
	private TresEnRaya juego;
	private JPanel contentPane;
	private JTextField textFieldJ2;
	private JTextField textFieldJ1;
	private JLabel lblTurno = new JLabel("Turno");
	private final ButtonGroup bgHumCPUJ1 = new ButtonGroup();
	private final ButtonGroup bgHumCPUJ2 = new ButtonGroup();
	private final ButtonGroup tablero = new ButtonGroup();

	//String jugadores
	private String j1 = "";
	private String j2 = "";

	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 345);
		
		//Panel principal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Panel del tablero
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(9, 11, 280, 280);
		contentPane.add(panel);
		panel.setLayout(null);

		/**
		 * Tablero
		 */

		// Fila 0
		// Boton 00
		JButton btn00 = new JButton("");
		btn00.setActionCommand("btn00");
		btn00.setEnabled(false);
		//Al clicar, llamamos al metodo marcar para cambiar el texto segun
		//signo del jugador en turno
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn00, 0, 0, juego.signoTurno());
			}
		});
		tablero.add(btn00);
		btn00.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn00.setBounds(10, 10, 87, 87);
		panel.add(btn00);

		// Boton 01
		JButton btn01 = new JButton("");
		btn01.setEnabled(false);
		btn01.setActionCommand("btn01");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn01, 0, 1, juego.signoTurno());
			}
		});
		tablero.add(btn01);
		btn01.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn01.setBounds(96, 10, 87, 87);
		panel.add(btn01);

		// Boton 02
		JButton btn02 = new JButton("");
		btn02.setEnabled(false);
		btn02.setActionCommand("btn02");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn02, 0, 2, juego.signoTurno());
			}
		});
		tablero.add(btn02);
		btn02.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn02.setBounds(182, 10, 87, 87);
		panel.add(btn02);

		// Fila 1
		// Boton 10
		JButton btn10 = new JButton("");
		btn10.setEnabled(false);
		btn10.setActionCommand("btn10");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn10, 1, 0, juego.signoTurno());
			}
		});
		tablero.add(btn10);
		btn10.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn10.setBounds(10, 96, 87, 87);
		panel.add(btn10);

		// Boton 11
		JButton btn11 = new JButton("");
		btn11.setEnabled(false);
		btn11.setActionCommand("btn11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn11, 1, 1, juego.signoTurno());
			}
		});
		tablero.add(btn11);
		btn11.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn11.setBounds(96, 96, 87, 87);
		panel.add(btn11);

		// Boton 12
		JButton btn12 = new JButton("");
		btn12.setEnabled(false);
		btn12.setActionCommand("btn12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn12, 1, 2, juego.signoTurno());
			}
		});
		tablero.add(btn12);
		btn12.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn12.setBounds(182, 96, 87, 87);
		panel.add(btn12);

		// Fila 2
		// Boton 20
		JButton btn20 = new JButton("");
		btn20.setEnabled(false);
		btn20.setActionCommand("btn20");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn20, 2, 0, juego.signoTurno());
			}
		});
		tablero.add(btn20);
		btn20.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn20.setBounds(10, 182, 87, 87);
		panel.add(btn20);

		// Boton 21
		JButton btn21 = new JButton("");
		btn21.setEnabled(false);
		btn21.setActionCommand("btn21");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn21, 2, 1, juego.signoTurno());
			}
		});
		tablero.add(btn21);
		btn21.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn21.setBounds(96, 182, 87, 87);
		panel.add(btn21);

		// Boton 22
		JButton btn22 = new JButton("");
		btn22.setEnabled(false);
		btn22.setActionCommand("btn22");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn22, 2, 2, juego.signoTurno());
			}
		});
		tablero.add(btn22);
		btn22.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn22.setBounds(182, 182, 87, 87);
		panel.add(btn22);

		///////////////////////////////////////////////////////

		/**
		 * Menu del juego
		 */

		//Panel del menu del juego
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(299, 11, 280, 280);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		//Boton para comenzar nueva partida
		JButton btnNuevaPartida = new JButton("Nueva partida");
		btnNuevaPartida.addActionListener(new ActionListener() {
			//Iniciamos nueva partida
			public void actionPerformed(ActionEvent arg0) {
				juego = new TresEnRaya(textFieldJ1.getText(), textFieldJ2.getText());
				lblTurno.setText(juego.obtenerTurno());
				//Limpiamos el tablero (importante si no es la primera partida)
				Iterator<AbstractButton> it = tablero.getElements().asIterator();
				while (it.hasNext()) {
					AbstractButton boton = it.next();
					boton.setText("");
				}

				//Miramos si los jugadores de esta partida son humanos o CPU
				j1 = (bgHumCPUJ1.getSelection().getActionCommand().compareToIgnoreCase("Humano") == 0) ? "Humano"
						: "CPU";
				j2 = (bgHumCPUJ2.getSelection().getActionCommand().compareToIgnoreCase("Humano") == 0) ? "Humano"
						: "CPU";
				//Desbloqueamos botones para comenzar la partida
				desbloquearBotones(true);

				//Primera llamada a CPU si es el jugador inicial
				if (j1.compareToIgnoreCase("CPU") == 0)
					cpu();
			}
		});
		btnNuevaPartida.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNuevaPartida.setBounds(55, 10, 170, 25);
		panel_1.add(btnNuevaPartida);

		/**
		 * Panel y contenido del jugador 1
		 */
		
		//Panel jugador 1
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 68, 260, 95);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		//Etiqueta jugador 1
		JLabel lblJ1 = new JLabel("Jugador 1");
		lblJ1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJ1.setBounds(10, 11, 70, 20);
		panel_2.add(lblJ1);

		//Etiqueta nombre j1
		JLabel lblNombreJ1 = new JLabel("Nombre: ");
		lblNombreJ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreJ1.setBounds(10, 42, 70, 20);
		panel_2.add(lblNombreJ1);

		//Etiqueta tipo j1
		JLabel lblTipoJ1 = new JLabel("Tipo:");
		lblTipoJ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoJ1.setBounds(10, 69, 70, 20);
		panel_2.add(lblTipoJ1);

		//Campo de texto para el nombre del jugador 1
		textFieldJ1 = new JTextField();
		textFieldJ1.setColumns(10);
		textFieldJ1.setBounds(90, 44, 86, 20);
		panel_2.add(textFieldJ1);

		//Radio boton j1 para seleccionar humano
		JRadioButton rdbtnHumanoJ1 = new JRadioButton("Humano");
		rdbtnHumanoJ1.setSelected(true);	//Seleccionado por defecto
		rdbtnHumanoJ1.setActionCommand(rdbtnHumanoJ1.getText());
		bgHumCPUJ1.add(rdbtnHumanoJ1);
		rdbtnHumanoJ1.setBounds(75, 70, 70, 23);
		panel_2.add(rdbtnHumanoJ1);

		//Radio boton j1 para seleccionar CPU
		JRadioButton rdbtnCPUJ1 = new JRadioButton("CPU");
		bgHumCPUJ1.add(rdbtnCPUJ1);
		rdbtnCPUJ1.setActionCommand("CPU");
		rdbtnCPUJ1.setBounds(145, 70, 70, 23);
		panel_2.add(rdbtnCPUJ1);

		/**
		 * Panel y contenido del jugador 2
		 */
		
		//Panel jugador 2
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_1.setBounds(10, 174, 260, 95);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);

		//Etiqueta jugador 2
		JLabel lblJ2 = new JLabel("Jugador 2");
		lblJ2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJ2.setBounds(10, 11, 70, 20);
		panel_2_1.add(lblJ2);

		//Etiqueta nombre j2
		JLabel lblNombreJ2 = new JLabel("Nombre:");
		lblNombreJ2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreJ2.setBounds(10, 42, 70, 20);
		panel_2_1.add(lblNombreJ2);

		//Etiqueta tipo j2
		JLabel lblTipoJ2 = new JLabel("Tipo:");
		lblTipoJ2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoJ2.setBounds(10, 68, 70, 20);
		panel_2_1.add(lblTipoJ2);

		//Campo de texto para el nombre del jugador 2
		textFieldJ2 = new JTextField();
		textFieldJ2.setBounds(90, 44, 86, 20);
		panel_2_1.add(textFieldJ2);
		textFieldJ2.setColumns(10);

		//Radio boton j1 para seleccionar humano
		JRadioButton rdbtnHumanoJ2 = new JRadioButton("Humano");
		bgHumCPUJ2.add(rdbtnHumanoJ2);
		rdbtnHumanoJ2.setActionCommand("Humano");
		rdbtnHumanoJ2.setBounds(73, 69, 70, 23);
		panel_2_1.add(rdbtnHumanoJ2);

		//Radio boton j1 para seleccionar CPU
		JRadioButton rdbtnCPUJ2 = new JRadioButton("CPU");
		rdbtnCPUJ2.setSelected(true);	//Seleccionado por defecto
		rdbtnCPUJ2.setActionCommand("CPU");
		bgHumCPUJ2.add(rdbtnCPUJ2);
		rdbtnCPUJ2.setBounds(146, 69, 70, 23);
		panel_2_1.add(rdbtnCPUJ2);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTurno.setVerticalAlignment(SwingConstants.TOP);

		//Etiqueta para recordar el turno del jugador
		lblTurno.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurno.setBounds(10, 38, 260, 19);
		panel_1.add(lblTurno);
	}

	/**
	 * CPU
	 */
	
	public void cpu() {
		int posicionElegida[] = new int[2];
		boolean encontrada = false;
		/*
		 * ORDEN DE PRIORIDAD:
		 * 1. Jugar en el centro siempre que se pueda 
		 * 2. ¿Está CPU puede ganar? Intenta ganar 
		 * 3. CPU tiene que analizar si el jugador contrario puede ganar. 
		 * 4. Posicion Aleatoria
		 */
		
		//Jugar en el centro
		if (!juego.posicionOcupada(1, 1)) {
			marcar((JButton) obtenerBoton(1, 1), 1, 1, juego.signoTurno());
			encontrada = true;
		}
			
		//Llamamos al metodo algoritmoCpu para recorrer la matriz y
		//ver si tenemos jugadas ganadoras...
		posicionElegida = juego.algoritmoCpu(juego.signoTurno());
		if (!encontrada && juego.esPosicionValida(posicionElegida)) {
			marcar((JButton) obtenerBoton(posicionElegida[0], posicionElegida[1]), posicionElegida[0],
					posicionElegida[1], juego.signoTurno());
			encontrada = true;
		}
		
		//o si nuestro oponente podria ganar en el proximo turno
		if(!encontrada){
			posicionElegida = juego.algoritmoCpu(juego.signoContrario());
			if (juego.esPosicionValida(posicionElegida)) {
				marcar((JButton) obtenerBoton(posicionElegida[0], posicionElegida[1]), posicionElegida[0],
						posicionElegida[1], juego.signoTurno());
				encontrada = true;
			}
		}
		
		//Movimiento al azar
		if(!encontrada && juego.quedanMovimientos()) {
			int i = 0, j = 0;
			do {
				i = new Random().nextInt(3);
				j = new Random().nextInt(3);

				if (!juego.posicionOcupada(i, j)) {
					marcar((JButton) obtenerBoton(i, j), i,j, juego.signoTurno());
					encontrada = true;
				}
			} while (!encontrada);
		}
	}
	
	/**
	 * Metodos varios
	 */

	//Variante alternativa para llamar al metodo obtenerBoton
  
	public AbstractButton obtenerBoton(int x, int y) {
		return obtenerBoton("btn" + x + y);
	}

	//Metodo para obtener los botones declarados en el constructor de InterfazGrafica
	private AbstractButton obtenerBoton(String botonBuscado) {
		Iterator<AbstractButton> it = tablero.getElements().asIterator();
		boolean exit = false;
		AbstractButton boton = null;
		while (it.hasNext() && !exit) {
			boton = it.next();
			if (botonBuscado.compareToIgnoreCase(boton.getActionCommand()) == 0)
				exit = true;
		}

		return boton;
	}

	//Metodo que indica la secuencia que se produce al marcar un boton:
	//añadir signo al boton en funcion del turno, marcarlo en la matriz tablero (metodo marcarPosicion), incrementar el contador
	//de movimientos para saber cuan cerca estamos del final, desactivar el boton marcado y comprobar condicion de victoria
	public void marcar(JButton boton, int x, int y, String turno) {
		boton.setText(turno);
		juego.marcarPosicion(x, y, turno);
		juego.incrementarMovimientos();
		boton.setEnabled(false);
		
		if (juego.condicionVictoria(turno)) {
			desbloquearBotones(false);
			JOptionPane.showMessageDialog(null, "Ha ganado: " +juego.jugadorTurno());
		} else {
			if (juego.quedanMovimientos())
				cambiarTurno();
			else {
				desbloquearBotones(false);
				JOptionPane.showMessageDialog(null, "No quedan movimientos. Es un Empate");
			}
		}
	}

	//Metodo para cambiar de turno y llamar a la CPU para que juegue
	//si alguno de los jugadores lo tiene asignado
	public void cambiarTurno() {
		juego.siguienteTurno();
		lblTurno.setText(juego.obtenerTurno());
		if (juego.isTurnoJ1() && j1.compareToIgnoreCase("CPU") == 0)
			cpu();
		else if (!juego.isTurnoJ1() && j2.compareToIgnoreCase("CPU") == 0)
			cpu();
	}

	//Metodo para poner activados (enabled = true) todos los botones del tablero
	public void desbloquearBotones(boolean opcion) {
		Iterator<AbstractButton> it = tablero.getElements().asIterator();
		while (it.hasNext()) {
			it.next().setEnabled(opcion);
		}
	}

}
