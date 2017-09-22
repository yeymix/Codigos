import java.util.Arrays;

/*
 * Secuencia de saltos para que pase un array de números sin truncarse con los números que contiene el array 
 */

public class CF_avoidObstacles {


		public static void main(String[] arg){
			

			int[] inputArray = {19, 32, 11, 23};
			System.out.println(avoidObstacles(inputArray));
			
		}
		
		static int avoidObstacles(int[] inputArray){
			
			Arrays.sort(inputArray);
			int x=0;
			int inc=1;
			int max=0;
			
			System.out.println(Arrays.toString(inputArray));
			
			for(int i=0;i<inputArray.length;i++){
				if(inputArray[i] > max)
					max = inputArray[i]; 
			}
			
			System.out.println(max);
			
			System.out.println("inc --> " + inc);
			while(x<=max){
				x = x+inc;
				System.out.println("x --> " + x);
				for(int i=0;i<inputArray.length;i++){
					if(inputArray[i] == x){
						System.out.println("inc --> " + inc);
						System.out.println("aqui son iguales --> " + x + " // " + inputArray[i]);
						inc++;
						x = 0;
						break;
					}
					System.out.println("No toca ninguno --> " + inc + " // " + inputArray[i]);
				}
			}
			System.out.println("Retorna --> " + inc);
			return inc;
		}
	

}
