package sa.edu.yuc;
import java.util.Scanner;  
public class BinarySearchTreeTest {
	public static void main(String[] args) throws TreeEmptyException {
		BinarySearchTree bst = new BinarySearchTreeImpl();
           
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
							System.out.print("Enter the item = ");
							int item = input.nextInt();
							System.out.println(bst.insert(item));
						}catch(DuplicateItemException de){
							System.out.println(de.getMessage());
						}
						
						break;
				case 3:
						try{
							System.out.print("Enter the item to find = ");
							int item = input.nextInt();
							int temp = bst.find(item);
							if(temp != -1)
								System.out.println("Item is found = " + temp);
							else
								System.out.println("Item not found");
						}catch(TreeEmptyException tee){
							System.out.println(tee.getMessage());
						}
						break;
				case 4:
                                   
						System.out.println("InOrder Traversal");
						bst.inOrder();
                                               
						System.out.println("Null");
						break;
				case 5:
                                 
						System.out.println("PreOrder Traversal");
					bst.preOrder();
                                
                                
						System.out.println("Null");
						break;
				case 6:
						System.out.println("postOrder Traversal");
						bst.postOrder();
						System.out.println("Null");
                                                
						break;
				case 7:
						System.out.println(bst.minimum());
						break;
				case 8:
                                    System.out.println(bst.maximum());
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
		System.out.println("Binary Search Tree Operations\n1. IsEmpty()\n2. Insert"
			+ "\n3. Find"
			+ "\n4. InOrder"
			+ "\n5. PreOrder"
			+ "\n6. PostOrder"
			+ "\n7. Minimum"
			+ "\n8. Maximum"
			+ "\n9. Exit");
	}
}