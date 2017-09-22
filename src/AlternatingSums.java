import java.util.Arrays;

/*
 * devuelve un array con las sumatorias alternadas del array que recibe.
 */
public class AlternatingSums {

	public static void main(String[] arg){
		int[] a = {50, 60, 60, 45, 70};
		
			System.out.println(Arrays.toString(AlternatingSums(a)));
	}
	
	static int[] AlternatingSums(int[] a) {
		
		int equipo1 = 0;
		int equipo2 = 0;
		
		int[] equipos = new int[2];
		
		for(int i=1;i<a.length;i++){
			
			if(i%2==0){
				System.out.println("equipo uno" + i);
				equipo1 += a[i];
			}
			else{
				System.out.println("equipo dos" + i);
				equipo2 += a[i];
			}
		}
		
		equipos[0] = equipo1+a[0];
		equipos[1] = equipo2;
		
		
		for(int i=0;i<equipos.length;i++){
			System.out.println(equipos[i]);
		}
		
	return equipos;
	}
}
