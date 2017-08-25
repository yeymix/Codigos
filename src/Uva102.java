import java.util.Arrays;

public class Uva102 {

	public static void main(String[] arg){
		
		int canasta[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int menor[] = new int[6];
		String colores[] = {"BCG","BGC","CBG","CGB","GBC","GCB"};
		String color="";
		int b[] = new int[3];
		int g[] = new int[3];
		int c[] = new int[3];
		
		b[0]= canasta[3] + canasta[6];
		b[1]= canasta[0] + canasta[6];
		b[2]= canasta[0] + canasta[3];
		
		g[0]= canasta[4] + canasta[7];
		g[1]= canasta[1] + canasta[7];
		g[2]= canasta[1] + canasta[4];
		
		c[0]= canasta[5] + canasta[8];
		c[1]= canasta[2] + canasta[8];
		c[2]= canasta[2] + canasta[5];
		
		menor[0] = b[0]+c[1]+g[2];
		menor[1] = b[0]+g[1]+c[2];
		menor[2] = c[0]+b[1]+g[2];
		menor[3] = c[0]+g[1]+b[2];
		menor[4] = g[0]+b[1]+c[2];
		menor[5] = g[0]+c[1]+b[2];
	
		
		int guarda=999999999;

		for(int i=0;i<menor.length;i++){
			if(menor[i]<guarda){
				guarda=menor[i];
				color=colores[i];
				}

		}
		
		 System.out.println(color +" " + guarda);
		
	}
	
	
}
