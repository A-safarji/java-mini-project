package SafarjiProj;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class RoadMapTest {
	public static void main(String[] args)  {
		RoadMap c = new RoadMap();
		Scanner input = new Scanner(System.in);
		int option = -1;
                try{
		while (option != 0) {
			menu();
			System.err.print("How Can I Help You :) :");
			option = input.nextInt();
			switch (option) {
				case 1:
                                    try {
                                        Map b = Map.getLocation();
					c.addLocation(b);
					System.err.println("Location Added, Thnaks (:");
                                    }catch (Exception e){
                                       JOptionPane.showMessageDialog(null,"The location might exist or try to use diffrent zipcode or buliding number");
                                    }
						break;
				case 2:
                                    JOptionPane.showMessageDialog(null,"*Very Important!!*  Do not enter letters, you will need to restart the program agin!");
                                    try{
                                        
				 System.err.println(" Enter your buliding/unit number: ");
					
                                 int m = input.nextInt();
                                        System.out.println("Enter your zipcode ");
                                        int a = input.nextInt();
                                        System.out.println(c.findLocation(m, a));
                                        }catch(Exception w){
                                           JOptionPane.showMessageDialog(null,"*I told you!!*  Do not enter letters. Right now, you will need to restart the program agin! (Be smart)");
                                        }  
                                       
					//System.out.println(c.findLocation(m));
                         //  System.out.println("Enter your zip code ");
                                    // int y = input.nextInt();
                       
                                 
                                        
					break;
				
				case 3:
                                   System.err.println("Please enter your buliding number: ");
					int z= input.nextInt();
                           
                                        System.err.println("Enter your zipcode");
                                        
                                         int k= input.nextInt();
                                         
                                        if(c.deleteLocation(z, k)){
                                       
                                       System.err.println("Location Got Deleted, ): ");
                                        }
                        else {
                                            JOptionPane.showMessageDialog(null, " Sorry your location does not exist make sure you add a new location!");
                                          
                        }
					break;
					
				case 4:
                                    System.err.println("Your List:");
                                         c.showAll();
                                        
                                            
					break;
				
                                case 5:
                                    try{
                                 JOptionPane.showMessageDialog(null,"*Warning*:\n Please make sure you put your old buliding number"
                                         + " and old zipcode\n to modify your location directly!!. \n");
                                 JOptionPane.showMessageDialog(null,"*Very important!!*  Do not add a new location, you will need to restart the program!");
                                     
                                         System.out.println(c.Modfiy(Map.getLocation()));
                                          System.err.println(" Location Got Modified"); 
                                     
                                    }catch(Exception e){
                                        JOptionPane.showMessageDialog(null,"Location does not exist, I told you, you have to put your old bulding number with its zipcod");
                                    }
                                        
                                       //  System.err.println(" Location Got Modified"); 
					break;
				case 0:
                                 String v=  JOptionPane.showInputDialog(null,"Thanks for using Safarji road map info. How can we improve? ( your opinion matter!)  (:");
					break;
				default:
                             JOptionPane.showMessageDialog(null,"Sorry try agin and be carful next time, your options are from 1 to 5 or 0 to exit (:");
                                   // str1 =JOptionPane.showMessageDialog(null,"Sorry try agin and be carful next time (:");
					//System.err.println("Error try agin!");
                                     
			}
		                  System.out.println("Thank you for using Safarji Road Map Information. (:");
			//JOptionPane.showMessageDialog(null,"Thank you for using Safarji Road Map Information! (:");
                        
		}
	}catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Sorry,  you have to enter numbers as required (:");
                      JOptionPane.showMessageDialog(null,"Sorry, you have to restart the program ):");
                       
                       
        }
        }
	private static void menu() {
           
		System.out.println("Welcome to My Road Map Information");
		System.out.println("Press 1 to Add a location");
		System.out.println("Press 2 to Find a location");
		System.out.println("Press 3 to Delete a location");
		System.out.println("Press 4 to List all locations");
                System.out.println("Press 5 to Modfiy your location information");
		System.out.println("Press 0 to Exit");
	}
}