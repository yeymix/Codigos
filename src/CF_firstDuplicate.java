import java.util.HashMap;
import java.util.Map;

public class CF_firstDuplicate {
	public static void main(String[] arg) {
		int[] a = { 2, 3, 3, 1, 5, 2 };
		System.out.println(firstDuplicate(a));
	}

	static int firstDuplicate(int[] a) {
		int count = 0;
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();

	//	for (int i = 0; i < a.length; i++) {

			for (Integer i : a) {
	            Integer freq = data.get(a);
//	            data.put(a, (freq == 0) ? 1 : freq + 1);
	        }
			
			
			
			// System.out.println(a[i] + " --> " +count+1);
			System.out.println(data);
		

		return -1;

	}

}
