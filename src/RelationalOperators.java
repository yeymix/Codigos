import java.util.Scanner;

public class RelationalOperators {


		public static void main(String[] arg){
	        
	        int cont = 0;
	        
	        Scanner captura = new Scanner(System.in);
	        
	        
	        
	        int cant = captura.nextInt();
	        
	        while(cont<cant){
	            int a = captura.nextInt();
	            int b = captura.nextInt();
	            
	            if(a>b)
	                System.out.println(">");
	            else if(a<b)
	                System.out.println("<");
	            else
	                System.out.println("=");
	            cont++;
	                
	        }
	        
	        
	        //while 
	        
	    }

}
