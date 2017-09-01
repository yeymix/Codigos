
public class Matrices {

	public static void main(String[] arg) {

		int matriz[][] = {{1,2,3},{5,7,9},{6,3,7}};
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++){ 
				  System.out.print(matriz[x][y]);

			  }
			  System.out.println("x --> " + x);
			  // System.out.println("y --> " + y);
			  	System.out.println();
			}
		
	
	}

}
