import java.util.Arrays;

public class SortByHeight {

	public static void main(String[] arg) {

	int[] array = {200, -1, 150, 190, 170, -1, -1, 160, 45};
	
	int[] copia = Arrays.copyOf(array, array.length);

	Arrays.sort(copia);

	
	for(int i=0;i<array.length;i++){
		
		if(array[i] != -1){
			
			for(int j=i;j<copia.length;j++){
				if(copia[j] != -1){
					array[i] = copia[j];
					copia[j] = -1;
					break;
				}
			}
			
				
			}
		}
	
	for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
	}
		
		

		
		
			
	}

}
