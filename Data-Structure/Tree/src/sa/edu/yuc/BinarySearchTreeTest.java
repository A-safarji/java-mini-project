
package sa.edu.yuc;
import java.util.Scanner;
public class BinarySearchTreeTest {
	public static void main(String[] args) throws TreeEmptyException {
		BinarySearchTree<Account> bst = new BinarySearchTreeImpl<Account>();
		Scanner input = new Scanner(System.in);
		int choice;
		do{
			menu();
			System.out.print("Enter choice of operation = ");
			choice = input.nextInt();
			switch(choice){
				case 1:
						System.out.println("Tree is Empty ? " + bst.isEmpty());
						break;
				case 2:
						try{
							
							/*System.out.print("Enter the item = ");
							int item = input.nextInt();*/
							System.out.println(bst.insert(Account.getAccount()));
						}catch(DuplicateItemException de){
							System.out.println(de.getMessage());
						}
						
						break;
				case 3:
							System.out.print("Enter the ID to find = ");
							int id = input.nextInt();
							System.out.println(bst.find(id));
						break;
				case 4:
						System.out.println("InOrder Traversal");
						bst.inOrder();
						System.out.println("Null");
						break;
				case 5:
						// TODO Auto-generated method stub
						System.out.println("PreOrder Traversal");
						bst.preOrder();
						System.out.println("Null");
						break;
				case 6:
						// TODO Auto-generated method stub
						System.out.println("PostOrder Traversal");
						bst.postOrder();
						//System.out.print(bst);
						System.out.println("Null");
						break;
				case 7:
						// TODO Auto-generated method stub
					try {
						System.out.println("Minimum item -> " + bst.minimum());
					}catch(TreeEmptyException tre) {
						System.out.println(tre);
					}
						break;
				case 8:
						// TODO Auto-generated method stub
					try {
						System.out.println("Maximum item -> " + bst.maximum());
					}catch(TreeEmptyException tre) {
						System.out.println(tre);
					}
						break;
				case 9:
						System.out.println("Thank you for using this program !!!");
						break;
				default:
						System.out.println("Invalid option");
						
			}
		}while(choice != 9);
	}
	public static void menu(){
		System.out.println("Binary Search Tree Operations"
				+ "\n1. IsEmpty()"
				+ "\n2. Insert"
				+ "\n3. Find"
				+ "\n4. InOrder"
				+ "\n5. PreOrder"
				+ "\n6. PostOrder"
				+ "\n7. Minimum"
				+ "\n8. Maximum"
				+ "\n9. Exit");
	}
}