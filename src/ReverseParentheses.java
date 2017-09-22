import java.util.ArrayList;

public class ReverseParentheses {

	public static void main(String[] arg) {

		String s = "Code(Change)";
		char l;

		ArrayList<String> cadena = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			l = s.charAt(i);
			cadena.add(l + "");
		}
		System.out.println(cadena);
		vuelta(cadena);
		System.out.println("Cadena despues del metodo:   " + cadena);
	}

	/**
	 * @param cadena
	 * @return
	 */
	public static ArrayList<String> vuelta(ArrayList<String> cadena) {

		int pi = 0;
		int pf = 0;
		
		String palabra = "te quiero";
		System.out.println(new StringBuilder(palabra).reverse().toString());
		ArrayList<String> rv = new ArrayList<>();

		
		
//		for (int i = 0; i < cadena.size(); i++) {
//			if (cadena.get(i).equals("(")) {
//				cadena.remove(i);
//				pi = i;
//				System.out.println(pi);
//				break;
//			}
//		}
//		for (int j = cadena.size()-1; j > 0; j--) {
//				 if (cadena.get(j).equals(")")) {
//				 cadena.remove(j);
//				 pf = j-1;
//				 System.out.println(pf);
//				 break;
//			}
//
//		}


		
		System.out.println(rv);
		return cadena;
	}
}
