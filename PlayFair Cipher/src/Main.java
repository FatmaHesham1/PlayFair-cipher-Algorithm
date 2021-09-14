

  
import java.io.*;
import java.util.*;
  

   
   
 class Main {
	 
	 public static CreatingTable obj1=new CreatingTable();
 static char[][] matrix;
 public static CreatingTable obj2=new CreatingTable();

	
	
	 
	 public static Encryption encrypt=new Encryption();
	 static Scanner scanner = new Scanner(System.in);
	 static String plainText;
	 static String CipherText;
	 static Decryption_Data decrypt=new Decryption();
	 
	 
	 
    public static void main(String[] args)
    { 
    	int choice;
    	
	

		
		boolean bExist = true;
		
		
		
		
		
		while (bExist) {
			
			
		
			System.out.println("\n ************ Main Menu ***************");
			System.out.println("1. Encrypt data using playFair Algorithm :");
			System.out.println("2. Decrypt data using playFair Algorithm :");
			System.out.println("3. Exit: ");
			System.out.println("**************************************");
			System.out.println("Select your choice");
			choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {

			case 1:

				System.out.println("Enter the key :");
				String key = scanner.nextLine().toLowerCase();
				
				
				
				matrix =  obj1.Create_Table(key);
				
				System.out.println("Enter the plainText:");
				plainText = scanner.nextLine().toLowerCase();
				
				for(int i=0; i<plainText.length();i++) {
					if (plainText.charAt(i) == 'j')
			            plainText += 'i';
					}
				
				
				String PlainText_new = plainText.replaceAll(" ", "");
				
				String output = encrypt.encrypt(PlainText_new, matrix).toUpperCase();
				
				System.out.println("The Final CipherText : " + output);
				
				
				System.out.println("The Matrix for the algorithm :");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print(matrix[i][j] + "  ");
					}
				
					System.out.println();
				}
				
				
				
				
				break;

			case 2:
				
				System.out.println("Enter the key :");
				String key1 = scanner.nextLine().toLowerCase();
			
				
				matrix =  obj1.Create_Table(key1); 
				
				System.out.println("Enter the ciphertext you want to decrypt:");
					CipherText = scanner.nextLine().toLowerCase();
				
				String Result=decrypt.decrypt(CipherText, matrix);
				

	if(Result.contains("x")) {
		System.out.println( "The decrypted Data : "+ Result.replaceAll("x", ""));  

	}
	else {
		System.out.println("The decrypted Data : "+Result);
	}

	
	System.out.println("The Matrix for the algorithm :");
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			System.out.print(matrix[i][j] + "  ");
		}
		
	System.out.println();
	}
				
			
				
				
				
				
				
				break;

			case 3:
				bExist = false;

				break;

			

		
				

			}
		}
		
		
	}


   
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
    	
       
    }