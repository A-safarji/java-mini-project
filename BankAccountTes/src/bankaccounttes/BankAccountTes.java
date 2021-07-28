/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounttes;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author safarji
 */
public class BankAccountTes {
    
    

   

           static Scanner input= new Scanner(System.in);
                                public static void main(String[] args) {
                                   
                                    
                                    
        
                                 ArrayList<BankAccount> list= new ArrayList<>();
                        int choice = menu();

                        while(choice!=5){
                                    switch(choice){
         case 1:
           input.nextLine();/// << kill the big>>
             System.out.println("Enter your name");
        String name= input.nextLine();

                 System.out.println("Enter your Acount number"); 
             int accNo= input.nextInt();
              System.out.println("Enter your balance");
                double balance= input.nextDouble();

             BankAccount b = new BankAccount (name, accNo,balance);
                     list.add(b);
                     
                  System.out.println("Account has been added"); 
                choice = menu();

                            break;

                         case 2:
                   System.out.println(" Enter account number that want to search for)");
                    accNo= input.nextInt();

                        BankAccount bac= search(list,accNo);

                            if(bac!=null) {
                                System.out.println(bac);
                                    } else {
                                System.out.println("Your number does not exist");
                                        }           

                            choice= menu();
                                    break;







                                case 3:

                                    System.out.println("Enter account number that want to remove");
                            accNo= input.nextInt();

                                bac= search(list,accNo);

                    if(bac!=null){
                           
                        list.remove(bac);
                                System.out.println(" the account number has removed");

                                }else {
                        System.out.println("The account does not exist");

                        choice= menu();
                        break;
                        }
                        case 4:
                        for (BankAccount ba : list) {
                                  System.out.println(ba.toString());
                                //  System.out.println(ba.toString());
                        } 
                         
                       choice= menu();
                        break;




                        case 5:
                           
                            System.out.println("Thank You");
                        choice=5;
           
                        break;

                        }

                        }


                                     }

                        public static int menu(){
                        
                   
                               System.out.println("1.Add\n 2. Search\n 3. Remove\n 4. Dispaly\n 5.Exit");
                        int choice = input.nextInt();

                        return choice ;

                        }
                       // ArrayList<BankAccount> list= new ArrayList<>();
                       public static BankAccount search(ArrayList<BankAccount> list, int accNo){
                       BankAccount ba= null;
                       for(BankAccount bb: list){
                       if (bb.getAccountNumber() == accNo) {
                           ba=bb;
                       }
                      }
                          return ba;
                       }
                       

                       
}
                       
                        

                    