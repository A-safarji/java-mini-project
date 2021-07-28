package sa.edu.yuc;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		HashTable<Word> dict = new HashTable<Word>(100000);
		Scanner input = new Scanner(System.in);
		int option = -1;
		String word = null;
		while (option != 0) {
			menu();
			System.out.print("Option > ");
			option = input.nextInt();
			switch (option) {
				case 1:
					Word c =Word.getWordMeaning();
                                        dict.put(c.getWord(), c.getMeaning());
                                        
					break;
				
				case 2:
                                    System.out.println(" enter");
                                    word = input.next().toLowerCase();
                                    System.out.println(dict.get(word));
					break;
				
				case 3:
                                     System.out.println(" enter");
                                    word = input.next().toLowerCase();
                                    boolean temp =dict.delete(word);
                                    if (temp != true) {
                                        
                                    }
					                          
					break;

				case 4:
					
					break;
				
				case 0:
					break;
				default:
					System.out.println("Ivalid option!");
			}
			
			System.out.println("Thank you!");
		}
	}

	private static void menu() {
		System.out.println("Welcome to MyDictionary");
		System.out.println("Press 1 to add a new word");
		System.out.println("Press 2 to find a word");
		System.out.println("Press 3 to delete a word");
		System.out.println("Press 4 to list all words");
		System.out.println("Press 0 to exit");
	}

}
