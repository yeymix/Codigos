public class CF_mullet {

public static void main(String arg[]) {
	int business=3;
	int party=9;
	System.out.println(mullet(business, party));
}

static String[] mullet(int business, int party) {

	String[] res = new String[business + party];
	
	for(int i=0; i<=business;i++) {
		res[i] = "  ######## ";
	}
	int pos = business-1;
	res[pos+1] = "   @@  ### ";
	res[pos+2] = "  /    ### ";
	res[pos+3] = "   -   ### ";
	res[pos+4] = "  (__  ### ";
	res[pos+5] = "     ||### ";
	
	System.out.println("res --> " + res.length + "party --> " + party);
	
		for(int i=res.length-(party-5); i<res.length;i++) {
			System.out.println("i-->" + (i));
			res[i] = "       ### ";
		}

	for(int i=0; i<res.length;i++) {
		System.out.println(res[i] + "\n");
	}
	
//	System.out.println(Arrays.toString(res));
	
	return res;
}

}
