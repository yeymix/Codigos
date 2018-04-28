import java.util.Arrays;

public class CF_arrayMaxConsecutiveSum {
	
	public static void main(String arg[]) {
		int[] inputArray = {1, 2, 3, 4};
		int k = 1;
		System.out.println("resultado --> " + arrayMaxConsecutiveSum(inputArray, k));
	}
	
	static int arrayMaxConsecutiveSum(int[] inputArray, int k) {

	    int may=0;
	    for(int i=0;i<=inputArray.length-k;i++){
	    	int sum=0;
	        for(int j=i;j<(i+k);j++){
	            sum = sum + inputArray[j];
	            System.out.println("sum --> " + sum);
	        }
	        if(sum > may) {
	        	may = sum;
	        }
	    }
	    return may;
	}

}
