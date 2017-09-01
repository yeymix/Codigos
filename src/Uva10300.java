import java.util.Scanner;

public class Uva10300 {

	public static void main(String[] arg) {

		long casos = 0;
		long lineas = 0;
		long contcasos = 0;
		long columnas = 3;
		long sum = 0;
		long resul=0;
		
		Scanner captura = new Scanner(System.in);
		
		casos=captura.nextInt();
		
		while (contcasos < casos){
			lineas=captura.nextInt();
			int contlineas = 0;
			
			while (contlineas < lineas){
				long ecological[][] = new long[(int) lineas][(int) columnas];
				
			
				for(int x=0;x<ecological.length;x++){
					for(int y=0; y < ecological[x].length; y++){
						ecological[x][y] =  captura.nextInt();
						contlineas++;
					}
				}
				
				for(int x=0;x<ecological.length;x++){
					for(int y=0; y < ecological[x].length; y++){
						sum = ecological[x][0] * ecological[x][2];
					}
					resul = resul+sum;
				}
				System.out.println(resul);
			}
			resul = 0;
			contcasos++;
		}
	}
}
