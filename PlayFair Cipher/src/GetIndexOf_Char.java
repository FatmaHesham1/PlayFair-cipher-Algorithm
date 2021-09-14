
public class GetIndexOf_Char {
	public GetIndexOf_Char() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  int[] Get_Index(char charac, char[][] matrix) {
		
		
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (charac == matrix[i][j]) {
					return new int[] {i, j};
				}
			}
		}
	
		return null;
	}

	
	
}
