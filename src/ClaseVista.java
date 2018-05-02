import java.awt.Color;
import java.awt.Container; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;

public class ClaseVista extends JFrame {

	private static final long serialVersionUID = 1L;
	Container bloqueContenedor = null; 
	JLabel etiquetaNumero1 = null; 
	JLabel etiquetaNumero2 = null;
	JLabel etiquetaResultado = null; 
	JButton botonIniciar = null;
	JTextField cajaDeTextoNumero1 = null; 


	@SuppressWarnings("deprecation")
	public ClaseVista() {
		//Aqui introducimos el nombre del jugador a través de un método.
		bloqueContenedor = getContentPane();
		bloqueContenedor.setBackground(Color.WHITE);


		setTitle("JUEGO DE BOOLEANOS"); 
		setLayout(new FlowLayout());
		setSize(600,600);
		bloqueContenedor.setLayout(null);
		

		etiquetaNumero1 = new JLabel("Bienvenido al Juego");

		cajaDeTextoNumero1 = new JTextField("", 10); 
		
		etiquetaNumero2 = new JLabel("Introduce tu nombre"); 
		

		etiquetaResultado = new JLabel("Resultado: ");

		botonIniciar = new JButton("Iniciar");

		bloqueContenedor.add(etiquetaNumero1); 
		etiquetaNumero1.setBounds(100, 100, 300, 100);
		//etiquetaNumero1.setBounds(x, y, width, height);
		bloqueContenedor.add(etiquetaNumero2); 
		etiquetaNumero2.setBounds(225, 150, 300, 100);

		bloqueContenedor.add(cajaDeTextoNumero1); 
		cajaDeTextoNumero1.setBounds(225, 300, 300, 40);

		bloqueContenedor.add(botonIniciar);
		botonIniciar.setBounds(225, 500, 100, 50);
				

		setVisible(true);

	}	
}
