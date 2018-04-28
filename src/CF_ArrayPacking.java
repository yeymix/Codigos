
public class CF_ArrayPacking {
	
	   public static void main(String args[]){
	          int[] a = {23, 45, 39};
	          int res=0, sum=0;
	          
	          for(int i=0;i<a.length;i++) {
	        	  res |= a[i] << (sum);
	        	  sum += 8;
	        	  System.out.println(a[i]);
	        	  System.out.println(Integer.toBinaryString(res));
	        	  
	          }
	          
	          int z=23, b=45, c=39, ress=0;
	          ress = z | b<<8 | c <<16;
	          System.out.println(res);
	          System.out.println(ress);
	          
	          
	          System.out.println(Integer.toBinaryString(res));
	          System.out.println(Integer.toBinaryString(ress));
	          
	   }	
}
