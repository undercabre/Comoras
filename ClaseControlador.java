import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class ClaseControlador implements ActionListener {

	ClaseModelo objModelo = null;
	ClaseVista objVista = null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) { 
		this.objModelo = objModelo; 
		this.objVista = objVista; 
		actionListener(this); // Escuchador para el botón 
	}

	public void actionPerformed(ActionEvent objEvento) { 
		int resultado=0;
		try {
			// Capturamos los números desde la vista 
			String numero1 = this.objVista.cajaDeTextoNumero1.getText();
			if (objVista.botonInicio==objEvento.getSource()){
				objVista.bloqueContenedor.setVisible(false);
				objVista.bloqueContenedor2.setVisible(true);
			}
		}catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
		}
	}
	public void actionListener(ActionListener escuchador) {
		objVista.botonInicio.addActionListener(escuchador);
	}
}