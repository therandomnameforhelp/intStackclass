/*
Name:Final Project
Developer:
Date:11/11/2016
*/
import java.util.Scanner;
public class demo {
   public static void main(String[] args) {
   
   int value = 0;
   int choice = 0;
   Scanner inTok = new Scanner(System.in);
   
   do { 
   
   System.out.println("Choose one of these options:");
   System.out.println("\t1. Add a number to the stack.");
   System.out.println("\t2. Remove a number from the stack.");
   System.out.println("\t3. Display the stack.");
   System.out.println("\t4. Add a number to the queue."); 
   System.out.println("\t5. Remove a number from the queue.");
   System.out.println("\t6. Display the queue.");
   System.out.println("\t7. Quit.");
   System.out.print("Enter 1, 2, 3, 4, 5, 6, or 7: ");
   
   choice = inTok.nextInt();
        

   switch(choice){
      case 1:
      intStack.push(int value);
      
      break;
      
      case 2:
      
      break;
      
      case 3:
      
      break;
      
      case 4:
      
      break;
      
      case 5:
      
      break;
      
      case 6:
      
      break;
      
      case 7:
      System.out.print("\nGoodbye ");
      break;
      
      default:
      System.out.println("\n" + choice + " is invalid");
      }
      
   }while (choice != 7);   
      
      }
}
