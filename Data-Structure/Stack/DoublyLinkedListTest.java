package sa.edu.yuc;
import java.util.Scanner;
public class DoublyLinkedListTest {
	public static void main(String[] args) {
		DoublyLinkedList<Account> dll = new DoublyLinkedListImpl<Account>();
		Scanner input = new Scanner(System.in);
		int choice;
		do{
			menu();
			choice = input.nextInt();
			switch(choice){
				case 1:
					// TODO Auto-generated method stub
					break;
				case 2:
					// TODO Auto-generated method stub
					break;
				case 3:
					// TODO Auto-generated method stub
					break;
				case 4:
					// TODO Auto-generated method stub
					break;
				case 5:
					// TODO Auto-generated method stub
					break;
				case 6:
					// TODO Auto-generated method stub
					break;
				case 7:
					// TODO Auto-generated method stub
					break;
				case 8:
					// TODO Auto-generated method stub
					break;
				case 9:
					// TODO Auto-generated method stub
					break;
				case 10:
					// TODO Auto-generated method stub
					break;
				default :
						System.out.println("Invalid Option");
						
			}
		}while(choice != 9);
	}
	public static void menu(){
		System.out.println("Doubly Linked List Operations");
		System.out.println("1. Iesmpty()"
				+ "\n2. Insert First"
				+ "\n3. Insert Last"
				+ "\n4. Insert At Any Position"
				+ "\n5. Remove First"
				+ "\n6. Remove Last"
				+ "\n7. Delete At Any Position"
				+ "\n8. Search"
				+ "\n9. Display List"
				+ "\n10. Exit");
		System.out.print("Enter the choice of operation = ");
	}
}