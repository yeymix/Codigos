import java.math.BigInteger;

public class CF_dabbit {

		public static void main(String[] arg){
			
			System.out.println(dabbit("100100100100101011110101101",'l'));
			
		}
	
	
	static int dabbit(String s, char o) {

	    int r = 0;
	    int count = 0;
	    
	    if (o == 'a'){
	        for(int i=0;i<s.length();i++){
	            r &= s.charAt(i)-'0';
	        }
	    }
	    
	    if (o == 'o'){
	        for(int i=0;i<s.length();i++){
	            r |= s.charAt(i)-'0';
	        }
	    }
	    
	    if (o == 'x'){
	        for(int i=0;i<s.length();i++){
	            r ^= s.charAt(i)-'0';
	        }
	    }
	    
	    if(o == 'l'){
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i) == '1'){
	            	count++;
	            }
	        }
	        
	        BigInteger b = new BigInteger("1");
	        b = b.shiftLeft(count-1);
	        
	        System.out.println(b.toString());
	        
	    }
	    
	    

	    System.out.println("1 --> " + count);
	    
	    return r;
	}

}
