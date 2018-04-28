import java.util.Arrays;

// retorna la cantidad de letras de una palabra

public class CF_DifferentSymbolsNaive {

	public static void main(String arg[]) {
		String s = "aba";
		System.out.println(differentSymbolsNaive(s));
		
	}
	
	static int differentSymbolsNaive(String s) {
	    int[] abc = new int[27];
	    int cont = 0;
	    
	    for(int i=0;i<s.length();i++){
	        abc[s.charAt(i)-'a']++;
	    }
	    
	    for(int i=0;i<abc.length;i++) {
	    	if( abc[i] != 0 ) {
	    		cont++;
	    	}
	    }
	    return cont;
	}
	
}
