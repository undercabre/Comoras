import java.util.Scanner;
public class ClaseModelo {
public static int  cuantosJugadores(){
		Scanner sc= new Scanner(System.in);
		int totaljugadores;
		
		totaljugadores=sc.nextInt();
		
		return totaljugadores;
	}
	
	public static String [] recogerNombres(int totaljugadores){
		Scanner sc=new Scanner(System.in);
		String nombres[];
		nombres=new String[totaljugadores];
		
		for(int i=0; i< nombres.length; i++){
			nombres[i]=sc.nextLine();
		}
		
		return nombres;
	}
}
