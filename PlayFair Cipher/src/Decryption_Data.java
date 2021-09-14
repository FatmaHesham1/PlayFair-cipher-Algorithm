
public class Decryption_Data {

	public static String decrypt(String Text, char[][] matrix) {
		Pairs_PlainText getPairs=new Pairs_PlainText();
		GetIndexOf_Char indexobj=new GetIndexOf_Char();
		
		
		String Plain_Text = "";
		String[] All_Pairs = getPairs.Divide_into_Pairs(Text);
		
		Plain_Text = shiftting(matrix, indexobj, Plain_Text, All_Pairs);
		
		return Plain_Text;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static String shiftting(char[][] matrix, GetIndexOf_Char indexobj, String Plain_Text, String[] All_Pairs) {
		int left_x;
		int left_y;
		int right_x;
		int right_y;
		for (String pair : All_Pairs) {
			char left_char = pair.charAt(0);
			int[] left_char_position = indexobj.Get_Index(left_char, matrix);
			char right_char = pair.charAt(1);
			int[] right_char_position = indexobj.Get_Index(right_char, matrix);
			
			
			//if they are same row , then shift left
			if (left_char_position[0] == right_char_position[0]) {
				
				left_x = left_char_position[0];
				left_y = (left_char_position[1] - 1 + 5) % 5;
				right_x = right_char_position[0];
				right_y = (right_char_position[1] - 1 + 5) % 5;
				
				//if they are the same column , then replace with the above (up) 
			} else if (left_char_position[1] == right_char_position[1]) {
				
				left_x = (left_char_position[0] - 1 + 5) % 5;
				left_y = left_char_position[1];
				right_x = (right_char_position[0] - 1 + 5) % 5;
				right_y = right_char_position[1];
			} else {
				
				left_x = left_char_position[0];
				left_y = right_char_position[1];
				right_x = right_char_position[0];
				right_y = left_char_position[1];
			}
			Plain_Text += matrix[left_x][left_y];
			Plain_Text += matrix[right_x][right_y];
		}
		return Plain_Text;
	}

	public Decryption_Data() {
		super();
	}

}