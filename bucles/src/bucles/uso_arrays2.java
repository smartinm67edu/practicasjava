package bucles;

public class uso_arrays2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int [][] matrix=new int [4][2];
		 	
			matrix[0][0]=15;
			matrix[0][1]=15;
			
			matrix[1][0]=15;
			matrix[1][1]=15;
			
			matrix[2][0]=15;
			matrix[2][1]=15;
			
			matrix[3][0]=15;
			matrix[3][1]=15;
			
		for(int i=0;i<4;i++){
			
			for(int j=0;j<2;j++) {
				
				System.out.println(matrix[i][j]);
			}
		}
		
	}

}
