import java.util.Scanner;

public class Uva272 {


	public static void main(String[] arg){
		
		Scanner captura = new Scanner(System.in);
		int count=0;
		while(captura.hasNextLine()){
			
			String frase = captura.nextLine();
		
			//	String frase ="\"To be or not to be,\" quoth the Bard, \"that is the question\".";
				
				String convert="";
				char buscar = '"';
				
				
				for (int i=0; i<frase.length(); i++) {
					if((int)buscar==(int)frase.charAt(i)){
						count++;
						if(count%2!=0){
							convert += '`';
							convert += '`';
						}
						else if(count%2==0){
							convert += '\'';
							convert += '\'';
						}
					}else
						convert += frase.charAt(i);
				    }
				System.out.println(convert);
			}
	}
}


