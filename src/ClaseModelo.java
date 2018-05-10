import javax.swing.*;


public class ClaseModelo {
	// Implementa la lógica del objetivo principal del programa 


	public static int preguntasSiNo(){
		int puntuacion=0;
		boolean stop=false;
		for (int i=0; i<30 && stop==false;i++){
			Object[] options = {"Si", "No"};
			int x = JOptionPane.showOptionDialog(null,  crearPreguntas(i),
					"Pregunta numero "+(i+1),
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			System.out.println(x);
			if (x==crearRespuestas(i)){
				puntuacion++;
			}else if(x==-1){
				stop=true;
			}
		}
		return puntuacion;
	}


	public static String crearPreguntas(int i){
		String preguntas[]= {"Cerca de un 20 % de la población\n mundial es musulmana","Gran Bretaña y Reino Unido son lo mismo","La longitud del Río Nilo es de 6650 kilómetros.",
				"La phobofobia es la fobia a la filosofía", "Los animales de la especie Homo sapiens son plantígrados.","La Universidad de Cambridge se fundó antes que el Machu Picchu",
				"La entomología es la ciencia que estudia el desarrollo de los organismos unicelulares","Más del 50 % de la mortalidad infantil se debe al problema del hambre mundial.",
				"El cerebro es el órgano más pesado del cuerpo humano", "La superficie de Chile es mayor que la de Francia", "Hay arsénico en el café.", "La misma película, sin cortes, dura menos en televisión que en el cine",
				"En el Palacio del Elíseo, en París, viven varios animales. Tradicionalmente, siempre hay un cerdo llamado Napoleón. ", "Cuando hace mucho frío un vasito de alcohol hace entrar en calor.", 
				"Los cabellos y las uñas siguen creciendo después de la muerte.", "Una tostada con mantequilla lanzada al aire cae por el lado de la mantequilla tres de cada cuatro veces.",
				"Los esquimales utilizan 226 palabras distintas para designar la nieve según su estado. " , "En los hogares españoles hay más pájaros que gatos.","La Gran Muralla China es la única obra construida por el hombre visible a simple vista desde el espacio.",
				"El ser humano pierde aproximadamente el 75% de calor corporal por la cabeza. Es por ello que en época de bajas temperaturas las personas tienen la tendencia a cubrirse bien la cabeza con algún tipo de prenda.",
				"Nunca se ha visto a un elefante saltando en vertical.", "Los conejos son roedores.", "Tenemos un promedio de entre 400.000 y 500.000 pelos en la cabeza.",
				"Durante su vida, un hombre con una alimentación normal puede ingerir una cantidad de alimentos equivalente al peso de cien elefantes adultos.",
				"Las huellas dactilares suelen estar determinadas por nuestros genes, así que pueden tener ciertas semejanzas con las de nuestros progenitores.",
				"Cuando un avión aterriza de noche se apagan todas sus luces interiores.", "La principal limitación de las neuronas de nuestro cerebro es que si son dañadas no tienen la posibilidad de regenerarse.",
				"La mayoría de los seres humanos utilizamos solamente el 10% de nuestro cerebro. A menudo se sugiere que mediante algunos procesos una persona puede ser capaz de aprovechar ese potencial no utilizado.",
				"Dejar un hueso de aguacate en un plato de guacamole impide que este se vuelva de ese color oscuro tan desagradable a la vista.",
		"Si tiras un céntimo desde lo alto de un rascacielos, puedes atravesarle el cráneo a alguien."};
		return preguntas[i];
	}



	public static int  crearRespuestas(int i) {
		int respuestas[]= {0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1,
				1, 1, 0, 1, 1, 1, 0
		};
		return respuestas[i];
	}
}
