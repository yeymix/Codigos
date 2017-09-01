import java.util.Scanner;

public class SummingDigits {

	public int calcularsum(int sum) {
		
		// Scanner capt = new Scanner(System.in);
		
		// int num = capt.nextInt();
		int num = 1234567892;
		
		// while (num != 0){
		
		while (num > 10){
				
				sum = sum+(num%10);
				num=num/10;
			
				if(num<=10){
					sum+=num;
				}
				System.out.println(num);
			}
			return sum;
		// }
	}
	
	
	public static void main (String[] arg) {
		System.out.println();
	}

}
