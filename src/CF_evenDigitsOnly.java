
public class CF_evenDigitsOnly {

	public static void main(String[] arg) {
		
//		int n = 248622;
		int n = 248622;
		System.out.println(evenDigitsOnly(n));
	}
	public static boolean evenDigitsOnly(int n) {
		String num = n+"";
		int val = 0;
		for(int i=0;i<num.length();i++){
			if(num.charAt(i)%2!=0)
				val++;
		}

		if(val > 0)
			return true;
		else
			return false;
	}

}
