import java.util.Scanner;
public class proyecto {
	public static void main(String args []) {
		String nombre;
		String preguntas[];
		boolean respuestasCorrectas[];
		boolean respjug[];
		int i;
		nombre=recogerNombre();

		preguntas=crearPreguntas();
		respuestasCorrectas=crearRespuestas();
		respjug=respuestasjugadorCrear(preguntas);

		for(i=0; i<preguntas.length; i++) {
			imprimirPregunta( i, preguntas);
			respjug[i]=recogerPregunta();
		}

		resultado (respuestasCorrectas,  respjug, nombre);

	}

	public static boolean [] respuestasjugadorCrear(String [] preguntas) {
		boolean respjug[];

		respjug=new boolean[preguntas.length];
		return respjug;
	}


	public static String recogerNombre() {
		String nombre;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("Dime tu nombre");
			nombre=sc.nextLine();
		}while(nombre.length()<=0);

		return nombre;


	}

	public static String [] crearPreguntas(){
		String preguntas[]= {"Cerca de un 20 % de la poblaci�n mundial es musulmana","Gran Breta�a y Reino Unido son lo mismo","La longitud del R�o Nilo es de 6650 kil�metros.",
				"La phobofobia es la fobia a la filosof�a", "Los animales de la especie Homo sapiens son plant�grados.","La Universidad de Cambridge se fund� antes que el Machu Picchu",
				"La entomolog�a es la ciencia que estudia el desarrollo de los organismos unicelulares","M�s del 50 % de la mortalidad infantil se debe al problema del hambre mundial.",
				"El cerebro es el �rgano m�s pesado del cuerpo humano", "La superficie de Chile es mayor que la de Francia", "Hay ars�nico en el caf�.", "La misma pel�cula, sin cortes, dura menos en televisi�n que en el cine",
				"En el Palacio del El�seo, en Par�s, viven varios animales. Tradicionalmente, siempre hay un cerdo llamado Napole�n. ", "Cuando hace mucho fr�o un vasito de alcohol hace entrar en calor.", 
				"Los cabellos y las u�as siguen creciendo despu�s de la muerte.", "Una tostada con mantequilla lanzada al aire cae por el lado de la mantequilla tres de cada cuatro veces.",
				"Los esquimales utilizan 226 palabras distintas para designar la nieve seg�n su estado. " , "En los hogares espa�oles hay m�s p�jaros que gatos.","La Gran Muralla China es la �nica obra construida por el hombre visible a simple vista desde el espacio.",
				"El ser humano pierde aproximadamente el 75% de calor corporal por la cabeza. Es por ello que en �poca de bajas temperaturas las personas tienen la tendencia a cubrirse bien la cabeza con alg�n tipo de prenda.",
				"Nunca se ha visto a un elefante saltando en vertical.", "Los conejos son roedores.", "Tenemos un promedio de entre 400.000 y 500.000 pelos en la cabeza.",
				"Durante su vida, un hombre con una alimentaci�n normal puede ingerir una cantidad de alimentos equivalente al peso de cien elefantes adultos.",
				"Las huellas dactilares suelen estar determinadas por nuestros genes, as� que pueden tener ciertas semejanzas con las de nuestros progenitores.",
				"Cuando un avi�n aterriza de noche se apagan todas sus luces interiores.", "La principal limitaci�n de las neuronas de nuestro cerebro es que si son da�adas no tienen la posibilidad de regenerarse.",
				"La mayor�a de los seres humanos utilizamos solamente el 10% de nuestro cerebro. A menudo se sugiere que mediante algunos procesos una persona puede ser capaz de aprovechar ese potencial no utilizado.",
				"Dejar un hueso de aguacate en un plato de guacamole impide que este se vuelva de ese color oscuro tan desagradable a la vista.",
				"Si tiras un c�ntimo desde lo alto de un rascacielos, puedes atravesarle el cr�neo a alguien."


		};

		return preguntas;
	}

	public static boolean [] crearRespuestas() {
		boolean respuestas[]= {true, false, true,false, true,true, false, true, false, true, true, true, false, false, false, false, false, true, false, false, true, false, false,
				false, false, true, false, false, false, true
		};
		return respuestas;
	}

	public static void imprimirPregunta(int i, String [] preguntas) {
		String pregunta;

		pregunta=preguntas[i];
		System.out.println((i+1)+" "+pregunta+"  V/F");
	}

	public static boolean recogerPregunta() {
		Scanner sc=new Scanner(System.in);
		char resp;
		do {
			resp=sc.nextLine().toLowerCase().charAt(0);
			if(resp!='v' && resp!='f' ) {
				System.out.println("Error, responde V/F");
			}
		}while(resp!='v' && resp!='f' );

		if(resp=='v') {
			return true;
		}else {
			return false;
		}
	}

	public static void resultado (boolean respuestasCorrectas[], boolean respjug[], String nombre) {
		int tot=0;

		for(int i=0; i<respjug.length; i++ ) {
			if(respuestasCorrectas[i]==respjug[i]) {
				tot++;
			}
		}
		System.out.println(nombre+" has acertado"+tot+" de "+respjug.length);
	}
}