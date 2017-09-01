
public class OrderArray {

	public static void main(String[] arg){
		
		int menor[] = {5,10,5,20,10,5,10,20,1};

		String colores[] = {"BCG","BGC","CBG","CGB","GBC","GCB"};
		
		int guarda=menor[0];

		for(int i=0;i<menor.length;i++){
			System.out.println(menor[i]);
			if(menor[i]>guarda){
				guarda=menor[i];
				}
		}
		
		 System.out.println("-->>" + guarda);
		
	}

}
