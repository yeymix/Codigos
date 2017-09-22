import java.util.Arrays;

public class CF_InputArray {

	public static void main(String[] arg){
		int[] inputArray = {1,1,1};
		System.out.println(InputArray(inputArray));
	}
	
	public static int InputArray(int[] inputArray) {
		int sum = 0;
		int rest=0;
		for(int i = 0; i<inputArray.length-1;i++ ){
		        if(inputArray[i]>=inputArray[i+1]){
		        	rest= (inputArray[i]+1)-inputArray[i+1];
		            sum=sum+rest;
		            inputArray[i+1]+=rest;
		        }
	    }
		
		return sum;
	}

}
