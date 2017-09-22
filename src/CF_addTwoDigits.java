
public class CF_addTwoDigits {

	
	
	public static void main (String[] arg){
		int n=29;
		System.out.println(addTwoDigits(n));
	}
	public static int addTwoDigits(int n) {
		
		String num = n+"";
		int sum=0;
		
		for(int i=0;i<num.length();i++){
			System.out.println(num.charAt(i));
			sum = sum+num.charAt(i)-'0';
		}
		

		return sum;
	}

}
