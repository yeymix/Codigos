import java.util.Scanner;

/*
 * cuenta la cantidad de palabras de una cadena, no solo espacios... también caracteres especiales...
 */

public class CountingWord {

	public static void main(String[] arg) {
		Scanner obj = new Scanner(System.in);
		while(obj.hasNextLine()){
			String palabras = obj.nextLine();
			int cant = 0;
	
			String arraysepara[] = palabras.toLowerCase().split("[^a-z]");
			for (int i = 0; i < arraysepara.length; i++) {
				
				String x = arraysepara[i];
				for (int y = 0; y < x.length(); y++) {
					if(Character.isLetter(x.charAt(y)) == true){
						cant++;
						break;
					}
							
				}
			}
			System.out.println(cant);
		}

	}

}
