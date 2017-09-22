
public class AmendTheSentence {
	
	/*
	 * Separa  una cadena donde encuentra mayúsculas con un espacio, y reemplaza la mayúscula por la misma letra minúscula
	 */

	public static void main(String[] arg) {
		
		String cadena = "vSKwWDjwIerQKMgVaAniorRJlerbKpDgvyKBLPNwSRWtylqKewNFtERNuUBBHAsGkTSSfdhQHJYvAighAdeG";
		//				 012345678
		System.out.println(amendTheSentence(cadena));
	
	}
	
	static String amendTheSentence(String s) {
		
		StringBuilder frase = new StringBuilder();
		frase.append(s);
		char minuscula;
		int pos=0;
		
		
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				pos = i;
				minuscula = s.charAt(i);
				minuscula = (char) + (minuscula + 'a' - 'A');
				if(i==0)
					frase.replace(pos, pos+1, minuscula+"");
				else
					frase.replace(pos, pos+1, " " + minuscula);
				s=frase.toString();
//				System.out.println("bieeeen--> " + s);
			}
			pos=0;
			
		}
		

//		System.out.println("esta está rara --> " + s);
		return s.toString();
	}



}
