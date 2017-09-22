
public class AllLongestSrtings {
	
	/*
	 * de un array de palabras detecta el más largo e imprime todos los más largos.
	 */

	public static void main(String[] arg) {

		String longarray[] = { "aba", "aa", "ad", "vcd", "aba","jdu"};
		
		int maxlong=0;
		int count=0;
		int count2=0;
		
		for(int i= 0; i<longarray.length;i++){
			if(longarray[i].length()>maxlong){
				maxlong = longarray[i].length();
				count2=1;
			}
			else if(longarray[i].length()==maxlong){
				count2++;
			}
		}
		
		

		String array[] = new String[count2];
		
		for(int i= 0; i<longarray.length;i++){
			if(longarray[i].length() == maxlong){
				array[count] =  longarray[i];
				count++;
			}
		}

		for(int i= 0; i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
