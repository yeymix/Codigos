
public class Matrices {
	
	/*
	 * Donde encuentre un cero, reemplaza el resto de la columnas por ceros e imprime el resultado de las sumatoria de los elementos que quedaron 
	 * */
	 

	public static void main(String[] arg) {

		int matriz[][] = {{0, 1, 1, 2},{0, 5, 0, 0},{2, 0, 3, 3}};

		int count=0;
		int sum=0;
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++){ 
				  if (matriz[x][y] == 0){
					  if(x+1 < matriz.length && count < matriz.length){
							  matriz[x+1][y]=0;
							  count++;
						  }
						  count = 0;
				  }
			  }
			}
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++){ 
				  sum = sum+matriz[x][y];
				  }
			  }
			
		System.out.println(sum);
		
	
//		for (int x=0; x < matrix.length; x++) {
//			  for (int y=0; y < matrix[x].length; y++){ 
//				  if (matrix[x][y] == 0){
//					  if(x+1 < matrix.length && count < matriz.length){
//						  matrix[x+1][y]=0;
//							  count++;
//						  }
//						  count = 0;
//				  }
//			  }
//			}
//		
//		for (int x=0; x < matriz.length; x++) {
//			  for (int y=0; y < matriz[x].length; y++){ 
//				  sum = sum+matriz[x][y];
//				  }
//			  }
//			
//		System.out.println(sum);	
//		
		
	}

}
