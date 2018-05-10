import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClaseControlador implements ActionListener {

	ClaseModelo objModelo = null;
	ClaseVista objVista = null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) { 
		this.objModelo = objModelo; 
		this.objVista = objVista; 
		actionListener(this); // Escuchador para el botón 
	}


	@Override 
	public void actionPerformed(ActionEvent objEvento) { 
		String nombre;
		int numero=1;
		boolean respuesta;
		JLabel etiquetaNumero3 = null; 
		try {
			if (objVista.botonIniciar==objEvento.getSource()){
				nombre=this.objVista.cajaDeTextoNumero1.getText();
				ClaseModelo.preguntasSiNo();
			}
		}
		//etiquetaNumero1 = new JLabel("Bienvenido al Juego");

		//cajaDeTextoNumero1 = new JTextField("", 10); 

		//etiquetaNumero2 = new JLabel("Introduce tu nombre"); 



		//Capturamos los números desde la vista 
		//String numero1 = this.objVista.cajaDeTextoNumero1.getText(); 
		//String numero2 = this.objVista.cajaDeTextoNumero2.getText();

		//int resultado = objModelo.sumarDosEnteros(numero1, numero2);
		// Mostramos el resultado en la vista (GUI) 
		//	objVista.cajaDeTextoResultado.setText( "" + resultado ); 
		catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
			System.out.println("FALLO");
		}
	}
	public void actionListener(ActionListener escuchador) {
		objVista.botonIniciar.addActionListener(escuchador);
	}
}