
public class CF_SecondRightmostZeroBit {
	
	/*
	 * Encuentra el segundo cero y devuelve el valor de su posición binaria.
	 * 
	 */
	
		   public static void main(String args[]){
		          int n=1073741824;
		          System.out.println(secondRightmostZeroBit(n));
	}
		   
		   static int secondRightmostZeroBit(int n) {
	//		   System.out.println(Integer.toBinaryString(n));
    //		   System.out.println(Integer.toBinaryString(~n | n ^ n));
			   
			   String a="";
			   a = Integer.toBinaryString(n);
			   int x = a.length();
			   
			   int c=0;
			   for(int i = a.length()-1; i>= 0;  i--) {
				   if (a.charAt(i)== '0') {
					  c++; 
				   }
				   if (c == 2) {
					   int res = (x-i-1);
					   int r = 1<<res;
					   return r;
				   }
			   }
			   
			   return 0;
			 }
}
