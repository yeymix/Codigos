import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CF_variableName {

	
	public static void main(String[] arg) {
		String name = "var_1__Int";
		System.out.println(variableName(name));
	}
	
	
	static boolean variableName(String name) {
		
		Pattern p = Pattern.compile("[^S]");
		Matcher m = p.matcher(name);
		
		StringBuilder var = new StringBuilder();
		var.append(name);
		
		
		
		
		
		if(var.charAt(0)+'0' >= 0 || var.charAt(0)+'0' <= 9){
			return false;
		}
		
		for(int i=0; i<var.length();i++){
			
							
		}
		return true;
	}




}
