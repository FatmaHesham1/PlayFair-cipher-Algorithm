import java.util.ArrayList;

public class Decryption extends Decryption_Data {


		
	public String FinalResult(String Plain_Text) {
		for(int i=0;i<Plain_Text.length();i++) {
			if(Plain_Text.charAt(i)==Plain_Text.charAt(i+2) ) {
				return Plain_Text.replaceAll("x", "");  
			
			}
			
	
		}
		
	return Plain_Text;
		
		
	}
}

