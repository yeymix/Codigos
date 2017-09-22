import java.util.ArrayList;

public class IsLucky {

	public static void main(String[] arg) {
		
		int n = 134008;
		String cadena = String.valueOf(n);
		int sum1=0;
		int sum2=0;
		int x;
		
		int suma = 0;
		for(int i=0;i<cadena.length();++i){
			if(i < cadena.length()/2 )
				suma+=cadena.charAt(i)-'0';
			else
				suma-=cadena.charAt(i)-'0';
		}
		
		System.out.println(suma == 0? "true":"false");
		
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i= 0; i<cadena.length();i++){
			
		
			numeros.add(cadena.charAt(i)-'0');
		}
		
		x=(numeros.size()/2);
		System.out.println("X --> " + x);
		
		for(int i=0;i<x;i++){
			sum1=sum1+numeros.get(i);
		}
		
		System.out.println("sum1 --> " + sum1);
		
				
		for(int i=x;i<numeros.size();i++){
			sum2=sum2+numeros.get(i);
			System.out.println("posición después de la mitad-->" +  i);
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		

	}

}
