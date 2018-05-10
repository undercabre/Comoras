public class ale {
	public static void main(String [] args){
		int numMinimo = 0; // declaramos el numero minimo
		int numMaximo = 29; // declaramos el numero maximo

		int n = 10; // declaramos la cantidad de resultados

		int[] resultado = new int[n]; // creamos el arreglo de resultado


		resultado = new int[n]; // creamos el arreglo de resultado
		for(int i = 0; i < n; i++){ // llenamos resultado de los numeros al azar de arreglo
			int rnd = (int)Math.floor(Math.random()*(numMinimo-(numMaximo+1))+(numMaximo));
			resultado[i]=rnd;
		}/* llenamos la lista de numeros al azar pero en esta solucion
		   pueden haber muchas coincidencias. */

		for(int i1 = 0; i1 < n; i1++){ // creamos la primera variable para la comprobacion
			for(int i2 = 0; i2 < n; i2++){//creamos la segunda que hara la comprobacion
				if(resultado[i1]==resultado[i2]&&i1!=i2){
					int rnd = (int)Math.floor(Math.random()*(numMinimo-(numMaximo+1))+(numMaximo));
					resultado[i1]=rnd;
					i1=0;
				}/* este if comprobara si hay coincidencias en el arreglo
			    y de conseguirlas, la cambia y vuelve a hacer la comprobacion */
			}// fin del for de la segunda comprobacion
		}// fin del for de la segunda comprobacion


		for(int i = 0; i < n; i++){ // imprimimos el resultado del arreglo
			System.out.println(resultado[i]);
		}//fin del for de imprimir.


	}
}