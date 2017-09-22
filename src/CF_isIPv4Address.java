import java.util.Arrays;

public class CF_isIPv4Address {
	
	/*
	 * valida direcciones ip
	 */


		public static void main(String[] arg){
			
			String addres = "";
			System.out.println(isIPv4Address(addres));
//			System.out.println(valida(addres));
		
		}
		
		static boolean isIPv4Address(String inputString) {
			String x="";
			int num=0;
			int p=0;
			
			int size = inputString.length()-1;
			
			for(int i=0;i<inputString.length();i++){
				
				if(inputString.charAt(i)!='.' || i== size){
					x+= (inputString.charAt(i));
					//System.out.println(x);
					
				}

				if(i == size || inputString.charAt(i)=='.'){
					p++;
					System.out.println(p);
					if(x=="" || x.matches("\\d*") == false || p > 4){
						return false;
					}
					num = Integer.parseInt(x);
					System.out.println(num);
					if(num < 0 || num > 255){
						return false;
					}
					x="";
				}
			}
			if( p<3)
				return false;
				else
					return true;
			
	}
		
		static boolean valida(String abc){
			
//			String address[] = abc.split("\\.");
//			System.out.println(Arrays.toString(address));
//			if(address.length == 3){
//				for(int i=0;i<address.length;i++){
//					if(){
//						return false;
//					}
//				}
//			}
//			
			return true;
		}

}
