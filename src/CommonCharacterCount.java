import java.util.ArrayList;

public class CommonCharacterCount {

	public static void main(String[] arg) {
		
		String cadena1= "aabcc";
		String cadena2= "adcaa";
		String pasaje="";
		int count=0;
		
		ArrayList<String> s1 = new ArrayList<>(); 
		ArrayList<String> s2 = new ArrayList<>();
		
		for(int i= 0; i<cadena1.length();i++){
			pasaje += cadena1.charAt(i);
			s1.add(pasaje);
			pasaje = "";
		}
		
		for(int i= 0; i<cadena2.length();i++){
			pasaje += cadena2.charAt(i);
			s2.add(pasaje);
			pasaje = "";
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Vienen los recortessssss");
		
		for(int i= 0; i<s1.size();i++){
			for(int j= 0; j<s2.size();j++){
				
				if (s1.get(i).equals(s2.get(j))){
					System.out.println("aquiiii -->" + s1.get(i));
					System.out.println("igualll -->" + s2.get(j));
					s2.remove(j);
					count++;
					 break;
				}
			}
		}
		
			System.out.println(s1);
			System.out.println();
			System.out.println(s2);
			System.out.println(count);
		
		
	}

}
