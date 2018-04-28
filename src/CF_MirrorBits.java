
public class CF_MirrorBits {
	
	public static void main(String[] arg) {
		
		int a = 97;
		System.out.println(mirrorBits(a));
	}
	
	static int mirrorBits(int a) {
		int b =0;
		String c="";
		c = Integer.toBinaryString(a);
		c = new StringBuffer(c).reverse().toString();
		System.out.println(c);
		b = Integer.parseInt(c,2);
	return b;
	}

	
}

