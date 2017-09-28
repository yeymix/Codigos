import java.util.Arrays;

public class CF_alphabeticShift {

	public static void main(String[] arg) {
		String inputString = "dsbaz";
		System.out.println(alphabeticShift(inputString));
	}
	
	static String alphabeticShift(String inputString) {
		char[] frase = new char[inputString.length()];
		String palabra = "";
	
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i) == 'z'){
				palabra += (char)('a');
			}else
			palabra += (char)(inputString.charAt(i)+1);
		}
		

		return palabra;
	}

}
