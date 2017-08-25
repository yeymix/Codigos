import java.util.*;
import java.io.*;

public class Main {

	 public static void main(String[] a) throws Exception{
	      
		  Scanner captura = new Scanner(System.in);   
		  while(captura.hasNext()){
		    int x =  captura.nextInt();
		    int y = captura.nextInt();
		   
		    System.out.println(y-x);
		  }

		 }
}
