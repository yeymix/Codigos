import java.util.Arrays;

/*
 * remplaza  posiciones de un array según sus valores...
 */

public class CF_arrayReplace {

	public static void main(String[] arg) {
		int[] array = {1, 2, 1};
		int elemToReplace = 1;
		int substitutionElem=3;
		
		arrayReplace(array, elemToReplace, substitutionElem);
		
		
	}
	
	
	public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
		
		int[] repl = inputArray;

		
		for(int i =0;i<inputArray.length;i++){
			if(inputArray[i] == elemToReplace){
				inputArray[i] = substitutionElem;
			}
		}
		System.out.println(Arrays.toString(inputArray));
		return inputArray;
	}
	
	
}
