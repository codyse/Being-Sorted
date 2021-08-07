/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprinter;
import java.util.Scanner;

/**
 *
 * @author anjolee 
 */
public class MenuPrinter {
    char optionInput;
    public void printStartMenu(){
        System.out.println("Hello User, let's get you started!");
        System.out.println("First, you'll be prompted to choose an option.");
        System.out.println("Then, We'll gather all the information you give us to keep in our system!");  
        System.out.println("You can tell me anything you want..I won't judge!");
        System.out.println();
        System.out.println();
    }

    public void printOptions(){
        Scanner input = new Scanner (System.in);
        String userInput = input.nextLine();

        this.optionInput = optionInput;
        System.out.println("/t Here are your options: /t " );
        System.out.println("p.) Print the inventory");
        System.out.println("a.) Add items");
        System.out.println("u.) Subtract items");
        System.out.println("s.) Search for items(using description)");
        System.out.println("o.) Sort items");
        System.out.println("q.) Change quality of items" );
        System.out.println();
        System.out.println();
        System.out.println("What's your choice? ");
        /*if (userInput != 'p'){
      Cody's Class
        }
        */
        
        /*if (userInput != 'a'){
      Alan's Class
        }
        */
        
        /*if (userInput != 'u'){
      Alan's Class
        }
        */
        
        /*if (userInput != 's'){
      Kyle' Class
        }
        */
        
        /*if (userInput != 'o'){
      Matt's Class
        }
        */
        
        /*if (userInput != 'q'){
      James's Class
        }
        */
        
        //else(
        //System.out.println("I'm sorry, I didn't get that. Can you try again");
        //}
        
    } 
    public static void main(String[] args) {
        
        MenuPrinter intro = new MenuPrinter();

        intro.printStartMenu();

        intro.printOptions();        
        

    }
}    
    

