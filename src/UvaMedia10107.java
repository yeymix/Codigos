import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UvaMedia10107 {

	public static void main(String[] arg){

		
		Scanner captura = new Scanner(System.in);
		ArrayList<Long> num = new ArrayList<>();
		
		while(captura.hasNext()){
			
			long x = captura.nextLong();
			
			Long position = (long) (num.size()/2);
			num.add(x);
			
			Collections.sort(num);
			
			if(num.size()%2!=0){
				System.out.println(num.get(position.intValue()));
			}
			else{
				position = (num.get(position.intValue())+num.get(position.intValue()+1))/2;
				System.out.println(position);
				
			}
		}
		
	}

}

