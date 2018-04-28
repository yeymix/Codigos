
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CF_ExtractEachKth {
	
	public static void main(String args[]){
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k = 3;
		System.out.println(Arrays.toString(extractEachKth(inputArray, k)));
		
	}
	
	static Integer[] extractEachKth(int[] inputArray, int k) {
		
		int n = k;
		List<Integer> lista = new ArrayList<>(); 
		for(int i=0;i<inputArray.length;i++) {
			if(i+1 == k) {
				k = k+n;
			}else {
				lista.add(inputArray[i]);
			}
			
		}
		return lista.toArray(new Integer[0]);
	}
}
