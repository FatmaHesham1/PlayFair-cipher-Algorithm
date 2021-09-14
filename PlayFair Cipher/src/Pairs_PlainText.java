import java.util.ArrayList;

public class Pairs_PlainText {

	public Pairs_PlainText() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] Divide_into_Pairs(String message) {
		ArrayList<String> result = new ArrayList<String>();
		
		int i = 0;
		
		
		while (i < message.length()) {
			char First_Char = message.charAt(i);
			char Second_Char;
			
			if (i + 1 < message.length()) {
				Second_Char = message.charAt(i + 1);
			} else {
				
				Second_Char = 'x';
			}

			i = Adding_Pairs(result, i, First_Char, Second_Char);
		}
		
		return (String[]) result.toArray(new String[0]);
	}

	private int Adding_Pairs(ArrayList<String> result, int i, char First_Char, char Second_Char) {
		if (First_Char == Second_Char) {
			
			result.add(new String("" + First_Char + 'x'));
			i++;
		} else {
			result.add(new String("" + First_Char + Second_Char));
			i += 2;
		}
		return i;
	}
	
	
}
