
public class Encryption {
	
	public static String encrypt(String Text, char[][] matrix) {
		  Pairs_PlainText getPairs=new Pairs_PlainText();
			  GetIndexOf_Char indexobj=new GetIndexOf_Char();
			
			 String Final_CipherText = "";
			
	
		String[] All_Pairs = getPairs.Divide_into_Pairs(Text);
		
		Final_CipherText = Shiftting(matrix, indexobj, Final_CipherText, All_Pairs);
		
		return Final_CipherText;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static String Shiftting(char[][] matrix, GetIndexOf_Char indexobj, String Final_CipherText,
			String[] All_Pairs) {
		int left_char_i;
		int left_char_j;
		int right_char_i;
		int right_char_j;
		
		for (String pair : All_Pairs) {
			
			char left_char = pair.charAt(0);
			int[] left_char_position = indexobj.Get_Index(left_char, matrix);
			char right_char = pair.charAt(1);
			int[] right_char_position =  indexobj.Get_Index(right_char, matrix);
			
			// they are same row 
			if (left_char_position[0] == right_char_position[0]) {
				
				left_char_i = left_char_position[0];
				left_char_j = (left_char_position[1] + 1) % 5;
				right_char_i = right_char_position[0];
				right_char_j = (right_char_position[1] + 1) % 5;
				
				// they are the same column 
			} else if (left_char_position[1] == right_char_position[1]) {
			
				left_char_i = (left_char_position[0] + 1) % 5;
				left_char_j = left_char_position[1];
				right_char_i = (right_char_position[0] + 1) % 5;
				right_char_j = right_char_position[1];
				
				// they are different column and row 
			} else {
			
				
				left_char_i = left_char_position[0];
				left_char_j = right_char_position[1];
				right_char_i = right_char_position[0];
				right_char_j = left_char_position[1];
			}
			
			Final_CipherText += matrix[left_char_i][left_char_j];
			Final_CipherText += matrix[right_char_i][right_char_j];
		}
		return Final_CipherText;
	}

	
	
	
}
