import java.util.ArrayList;
import java.util.Arrays;

/*
 * 	de una cadena de letras desordenadas determina si se puede formar una palabra palíndrome.
 */

public class CF_palindromeRearranging {

	public  static void main(String[] arg) {
		String inputString =  "anitalavalatina";
		System.out.println(palindromeRearranging(inputString));
		
	
	}
	
	public  static boolean palindromeRearranging(String inputString) {
			
		int letras[] = new int[27];
		int cont=0;
		
		
		for(int i=0; i<inputString.length();i++){
			letras[inputString.charAt(i)-'a']++;
		}
		
		for(int i=0; i<letras.length;i++){
			if(letras[i]%2!=0){
				cont++;
			}
			if(cont>1){
				return false;
			}
		}
		if(cont<=1){
			return true;
		}else
			return false;
		
	}
}
