
public class CF_SwapAdjacentBits {

	public static void main(String str[]) {

		int n = 74;
		System.out.println(swapAdjacentBits(n));
	}

	static int swapAdjacentBits(int n) {

		String s = Integer.toBinaryString(n);
		System.out.println(s);
		String c = "";
		for (int i = 0; i <= s.length() - 2; i = i + 2) {
			c += s.charAt(i + 1) + "" + s.charAt(i) + "";
			System.out.println("res --> " + c);
		}
		System.out.println("res fin --> " + c);
		System.out.println(Integer.toBinaryString(n));

		return 0;
	}
//	10000101
//  1001010
}
