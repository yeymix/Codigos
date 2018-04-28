public class CF_RangeBitCount {

	   public static void main(String args[]){
	          int a=2,b=7;
	          System.out.println(rangeBitCount(a,b));
	   }	
	   
	   static int rangeBitCount(int a, int b) {
		
		          int d=0;
		          for(int i=a;i<=b;i++) {
		        	  d += Integer.bitCount(i);
		          }
	          
//	          System.out.println((c));
//	          for(int i=0;i<c.length();i++) {
//	        	  d += c.charAt(i)-'0';
//	          }
		   
		   return d;
	   }
	
}
