import java.awt.Container; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;

public class ClaseVista extends JFrame{
	private static final long serialVersionUID = 1L;

	Container bloqueContenedor = null; 
	Container bloqueContenedor2 = null;
	
	JTextField cajaDeTextoNumero1 = null;
	JTextField cajaDeTextoNumero2 = null;
	
	JLabel etiquetaNumero1 = null; 
	JLabel etiquetaNumero2 = null;
	
	JButton botonInicio = null;
	JButton botonAceptar = null;
	
	public ClaseVista() {
		bloqueContenedor = getContentPane();
		bloqueContenedor2 = getContentPane();
		setTitle("Juego del revienta higados"); 
		setLayout(new FlowLayout()); 
		setSize(450,200);


		etiquetaNumero1 = new JLabel("Introduce el número de jugadores"); 
		cajaDeTextoNumero1 = new JTextField("", 10);
		botonInicio = new JButton("Iniciar");
		bloqueContenedor.add(etiquetaNumero1); 
		bloqueContenedor.add(cajaDeTextoNumero1); 
		bloqueContenedor.add(botonInicio);
		
		
		
		etiquetaNumero2 = new JLabel("Introduce el nombre de jugadores");
		cajaDeTextoNumero2 = new JTextField("",10);
		botonAceptar = new JButton("Aceptar");
		bloqueContenedor2.add(etiquetaNumero2);
		bloqueContenedor2.add(cajaDeTextoNumero2);
		bloqueContenedor2.add(botonAceptar);
		setVisible(true);
		/*etiquetaNumero2.setVisible(false);
		cajaDeTextoNumero2.setVisible(false);
		bloqueContenedor2.setVisible(false);*/
	}
}

