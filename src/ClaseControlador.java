import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
		try {
			if (objVista.botonIniciar==objEvento.getSource()){
				nombre=this.objVista.cajaDeTextoNumero1.getText();
				for (int i=0; i<15;i++){
					int dialogButton = JOptionPane.YES_NO_OPTION;
					JOptionPane.showConfirmDialog (null, ClaseModelo.escogerPreguntas(), nombre, dialogButton);
					if(dialogButton == JOptionPane.YES_OPTION) {
						System.out.println(numero++);
					if(dialogButton == JOptionPane.NO_OPTION) {
							System.out.println(numero++);
						}
					}
				}
			}

			//Capturamos los números desde la vista 
			//String numero1 = this.objVista.cajaDeTextoNumero1.getText(); 
			//String numero2 = this.objVista.cajaDeTextoNumero2.getText();

			//int resultado = objModelo.sumarDosEnteros(numero1, numero2);
			// Mostramos el resultado en la vista (GUI) 
			//	objVista.cajaDeTextoResultado.setText( "" + resultado ); 

		}
		catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
			System.out.println("FALLO");
		}
	}
	public void actionListener(ActionListener escuchador) {
		objVista.botonIniciar.addActionListener(escuchador);
	}
}