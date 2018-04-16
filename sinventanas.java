import java.util.Scanner;
public class sinventanas {
	public static void main(String args[]){
		String preguntas[]={"Corre y subete a una farola", "Salta a la pata coja"};
		int totaljugadores;
		int echo;
		String pregun, nom;
		int posicionjugador;
		
		String nombres[];
		int resultados[];
		boolean seguir=false;
		int numeroPregunta;

		totaljugadores=pedirJugadores();
		nombres=pedirNombres( totaljugadores);
		
		resultados=crearArrayResultados(totaljugadores);

		do{
			posicionjugador=elegirjugador(totaljugadores);
			numeroPregunta=saltoPregunta(preguntas);
			int aleatorio=(int)((2-1+0)*Math.random()+1);
			pregun=preguntas[aleatorio];
			int ale=(int)((totaljugadores-1+0)*Math.random()+totaljugadores);
			nom=nombres[ale];
			System.out.println(nom+" "+pregun);
			echo=respuestaPregunta();

			if(echo==3){
				seguir=true;
			}
			if(echo==2){
				resultados=pruebaHecha(resultados,  posicionjugador);
			}
			if(echo==1){
				resultados=pruebaIntentada (resultados, posicionjugador);
			}
			if(echo==0){
				resultados=pruebanoHecha ( resultados,  posicionjugador);
			}
		}while(seguir==true);

		imprimirResultados( resultados,  nombres);
	}

	public static int pedirJugadores(){
		Scanner sc=new Scanner(System.in);
		int jugadores;
		do{
			System.out.println("Dime cuantos jugadores hay");
			jugadores=sc.nextInt();
		}while(jugadores<=0);
		return jugadores;
	}

	public static String [] pedirNombres(int totaljugadores){
		Scanner sc= new Scanner(System.in);
		String [] nombres;
		nombres=new String[totaljugadores];
		for(int i=0; i<totaljugadores; i++){
			do{
				System.out.println("Dime el nombre del jugador "+i+1);
				nombres[i]=sc.nextLine();
				if(nombres[i].length()<=0){
					System.out.println("Error, introduzca el nombre otra vez");
				}
			}while(nombres[i].length()<=0);
		}

		return nombres;
	}

	public static int elegirjugador(int totaljugadores){
		int aleatorio=(int) ((totaljugadores-1+1)*Math.random()+totaljugadores);
		return aleatorio;
	}

	public static int [] crearArrayResultados(int totaljugadores){
		int resultado[];
		resultado=new int[totaljugadores];
		return resultado;
	}

	public static int respuestaPregunta(){
		Scanner sc= new Scanner(System.in);
		int n;
		do{
			System.out.println("HECHO=2// INTENTADO=1// NO ECHO=0");
			n=sc.nextInt();
		}while(n!=3 && n!=2 && n!=1 && n!=0);
		return n;
	}

	public static int [] pruebaHecha (int [] resultados, int posicionjugador){
		resultados[posicionjugador]=resultados[posicionjugador]+2;
		return resultados;
	}
	public static int [] pruebaIntentada (int [] resultados, int posicionjugador){


		resultados[posicionjugador]=resultados[posicionjugador]+1;

		return resultados;
	}
	public static int [] pruebanoHecha (int [] resultados, int posicionjugador){
		resultados[posicionjugador]=resultados[posicionjugador]+0;
		return resultados;
	}

	public static void imprimirResultados(int [] resultado, String nombres[]){
		for(int i=0; i<resultado.length; i++){
			System.out.println(nombres[i]+" ha conseguido "+resultado[i]);
		}
	}

	public static int saltoPregunta(String[] preguntas){
		int aleatorio=(int) ((preguntas.length-1+0)*Math.random()+preguntas.length);
		return aleatorio;
	}

}











