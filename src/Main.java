
import java.util.Scanner;

public class Main {
	
	static int ampli = 0;
	static StringBuilder res = new StringBuilder();
	
	public void calAmplitude(int amplitude){
		
		int num=1;
		while(num<amplitude){
			for(int x=0,y=num;x<num;x++){
				res.append(y);
				//System.out.print(y);
			}
			num++;
			res.append("\n");
			//System.out.println();
		}
	
		num = amplitude;
		while(num>0){
			for(int x=num;x>0;x--){
//				System.out.print(nm);
				res.append(num);
			}
			num--;
//			System.out.println();
			res.append("\n");
		}
//		System.out.println();
		res.append("\n");
	}

	public void calFrequency(int frequncy){
		for(int x=1; x<frequncy;x++){
			calAmplitude(ampli);
		}
	}
	
	
	public static void main(String[] arg){

		Main calcmplitude = new Main();
		
		Scanner captura = new Scanner(System.in);
		int cant = captura.nextInt();
		//PrintStream Out = System.out;
	//	ByteArrayOutputStream b = new ByteArrayOutputStream(); 
		//System.setOut(new PrintStream(b));
			int num=0;
			while(num<cant){
				ampli = captura.nextInt();
				int fre = captura.nextInt();
				calcmplitude.calAmplitude(ampli);
				calcmplitude.calFrequency(fre);
				num++;
			}
			//String d = new String(b.toByteArray()); 
			//System.setOut(Out);
			System.out.print(res.substring(0, res.length()-1));
			
	}

}
