
public class CF_AddBorder {
	
	/*
	 * recibe una matriz y le imprime un marco de ****
	 */

	public static void main(String[] arg) {
		
	
		String matrix[] = {"abc","ded"};
		addBorder(matrix);
	
	}
	
	
	static String[] addBorder(String[] picture) {
		
		int longt = picture.length+2;
		String[] nuevo = new String[longt];
		String concatena="";
		
		for(int i=0;i<picture[0].length()+2;i++){
			concatena += "*";
		}
		
		nuevo[0] = concatena;
		nuevo[longt-1] = concatena;
		
		for(int i=0; i<picture.length;i++){
			nuevo[i+1] = "*" + picture[i] + "*";
		}
		
		for(int i=0; i<nuevo.length;i++){
			System.out.println(nuevo[i]);
		}
		
		return nuevo;
	}

}
