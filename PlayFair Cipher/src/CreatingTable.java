
public class CreatingTable  {

	public CreatingTable() {
		super();
		// TODO Auto-generated constructor stub
	}


	static char[][] PlayFair_Table = new char[5][5];
	static char[] All_Letters = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	
	public static char[][] getPlayFair_Table() {
		return PlayFair_Table;
	}


	public static void setPlayFair_Table(char[][] playFair_Table) {
		PlayFair_Table = playFair_Table;
	}


	public static char[] getAll_Letters() {
		return All_Letters;
	}


	public static void setAll_Letters(char[] all_Letters) {
		All_Letters = all_Letters;
	}


////////////////////////////////////////////////////////////////////////////////////////////////
	
	public  char[][] Create_Table(String key) {
		 
		int index = 0;
		for (int i = 0; i < key.length(); i++) {
			char Character = key.charAt(i);
			int FirstPosition = key.indexOf(Character);
		
			if (FirstPosition == i) {
				
				PlayFair_Table[index / 5][index % 5] = Character;
				index++;
			}
		}
		
		
			fill_Rest_Of_Matrix(key,index);
		
		return PlayFair_Table;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
private void fill_Rest_Of_Matrix(String key,int index) {
	for (int i = 0; i < All_Letters.length; i++) {
		if (key.indexOf(All_Letters[i]) == -1) {
			PlayFair_Table[index / 5][index % 5] = All_Letters[i];
			index++;
		}
	}
}

	
}
