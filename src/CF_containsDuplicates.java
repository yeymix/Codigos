
public class CF_containsDuplicates {
	
	/*
	 * Este muere por tiempo...
	 */
	
	public static void main(String[] arg) {
		int[] num = {1, 2, 3, 4}; 
		System.out.println(containsDuplicates(num));
	}
	public static boolean containsDuplicates(int[] a) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j] && i!=j){
					return true;
				}
			}
		}
		return false;
	}

}
