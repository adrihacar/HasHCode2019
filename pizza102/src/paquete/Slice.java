package paquete;

public class Slice {
<<<<<<< Updated upstream

=======
	
	public static void slice(int coordX, int coordY, int[][]matriz, int T, int C, int min, int max) { //CAMBIAR RETURN TYPE
		//if(!Condiciones) => Cortar matriz
			if(matriz.length >= matriz[0].length) { //Corte horizontal
				
				int[] tomates = new int[matriz.length];
				for(int i=0; i<matriz.length; i++) { //Comprueba
					for(int j=0; j<matriz[0].length; j++) {
						if(matriz[i][j]==1)
							tomates[i]++;
					}
				}
				
			}
			else if(matriz.length < matriz[0].length) { //Corte vertical
				
			}
		
	}
	
>>>>>>> Stashed changes
}
