package sa.edu.yuc;

import java.util.Scanner;

public class HeapTest {

	public static void main(String[] args) {
		MinHeap<Integer> h = new MinHeap<Integer>(Integer.class, 100);
		Scanner input = new Scanner(System.in);
            //  Integer  b = h.m;
       
		int choice;
		do{
			menu();
			System.out.print("Enter choice of operation = ");
			choice = input.nextInt();
			switch(choice){
				case 1:
                                   
						System.out.print("Enter a value = ");
						int no = input.nextInt();
                                                // no=h.m;
						System.out.println("Value is inserted " +
						         h.insert(no));
                                                         
                                                
						break;
				case 2:
						System.out.println("Printing the Max heap");
						h.print();
						System.out.println();
						break;
				case 3:
						System.out.println("Sorted order");
						h.heapSort();
						h.print();
						System.out.println();
						h.buildMinHeap();
						break;
				case 4:
						System.out.print("Get parent of = ");
						no = input.nextInt();
						Integer temp = h.getParent(no);
						if(temp == null){
							System.out.println("No Parent");
						}else{
							System.out.println("Parent of " + no + " = "
									+ temp);
						}
						break;
				case 5:
						System.out.print("Get left child = ");
						no = input.nextInt();
						temp = h.getLeftChild(no);
						if(temp == null){
							System.out.println("No Left Child");
						}else{
							System.out.println("Left Child of " + no + " = "
									+ temp);
						}
						break;
				case 6:
						System.out.print("Get right child = ");
						no = input.nextInt();
						temp = h.getRightChild(no);
						if(temp == null){
							System.out.println("No right Child");
						}else{
							System.out.println("Right Child of " + no + " = "
								+ temp);
						}
					break;
					case 7:
					
						System.out.println(h.Findmax());
					break;
                                        case 8:
					
						System.out.println(h.Findmin());
					break;
				case 9:
						System.out.println("Thank you for using "
							+ "this program");
						break;
				
				default : System.out.println("Invalid Option (1 to 6)");
				
			}
		}while(choice != 9);
	}
	public static void menu(){
		System.out.println("Heap Operations"
				+ "\n 1. Insert"
				+ "\n 2. Print"
				+ "\n 3. Sort"
				+ "\n 4. getParent"
				+ "\n 5. getLeftChild"
				+ "\n 6. getRightChild"
				+ "\n 7. Findmax"
                        + "\n 8. Findmin"
				+ "\n 9. Exit");
	}
}
