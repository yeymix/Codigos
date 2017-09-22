
public class CF_matrixxx {
	
	/*
	 * Sumatoria de las submatrices de 3x3 de una matriz más grande, y las almacena en una sola.
	 */
	 

	public static void main(String[] arg) {
		
		int[][] matrizMay = { {36,0,18,9},{27,54,9,0},{81,63,72,45} };

		
		int xlength = matrizMay.length-2;
		int ylength = matrizMay[0].length-2;
		int[][] submatriz = new int[xlength][ylength];

		
		System.out.println("submatriz --> " +submatriz.length);

		
		for (int x = 0; x < matrizMay.length-2; x++) {
			for (int y = 0; y < matrizMay[x].length-2; y++) {
				int sum = 0;
					for (int xsub = 0; xsub < 3; xsub++) {
						for (int ysub = 0; ysub < 3; ysub++) {
							sum = sum + matrizMay[x+xsub][y+ysub];
							
						}
					}
					submatriz[x][y] = sum/9;
							System.out.println("submatriz --> "+ submatriz[x][y]);
					
				}
			}
		
					for (int x = 0; x < submatriz.length; x++) {
						for (int y = 0; y < submatriz[x].length; y++) {
							 System.out.print(submatriz[x][y]+",");
						}
					}

	}

}
