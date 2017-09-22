public class CF_minesweeper {

	/*
	 * de cada pocisión de una matriz booleana cuenta cuantos true en todas las posiciones vecinas menos en la propia.
	 */
	
	public static void main (String[] arg){
		
	 boolean matrix[][] = {{true,false,false,true},{false,false,true,false},{true,true,false,true}};	
//	 boolean matrix[][] = {{true,false},{false,false}};
		
	minesweeper(matrix);
	}
	
	public static int[][] minesweeper(boolean[][] matrix){
		
		int longx = matrix.length;
		int longy = matrix[0].length;
		
		System.out.println("longx-->"+longx);
		System.out.println("longy-->"+longy);
		
		int[][] sumArray = new int[longx][longy];
		
		for(int x=0;x<matrix.length;x++){
			for(int y=0;y<matrix[x].length;y++){
				
				int count=0;
				if(x>0 && y>0){
					if(matrix[x-1][y-1]==true){
						count++;
					}
				}
				if(x>0){
					if(matrix[x-1][y]==true){
						count++;
					}
				}
				if(y>0){
					if(matrix[x][y-1]==true){
						count++;
					}
				}
				if(x+1<longx && y+1<longy){
					if(matrix[x+1][y+1]==true){
						count++;
					}
				}
				if(x+1<longx){
					if(matrix[x+1][y]==true){
						count++;
					}
				}
				if(y+1<longy){
					if(matrix[x][y+1]==true){
						count++;
					}
				}
				if(x>0 && y+1<longy){
					if(matrix[x-1][y+1]==true){
						count++;
					}
				}
				if(y>0 && x+1<longx){
					if(matrix[x+1][y-1]==true){
						count++;
					}
				}
				sumArray[x][y]=count;
			}
		}
		for(int x=0;x<sumArray.length;x++){
			for(int y=0;y<sumArray[x].length;y++){
				System.out.println("x-->" + x+"// y--> " + y + " = " + sumArray[x][y]);
			}
		}
		return sumArray;
	}
}
