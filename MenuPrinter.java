/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;
import java.util.Scanner;

/**
 *
 * @author anjolee 
 */
public class MenuPrinter {
    char optionInput;
    String userInput;
    
    public void printStartMenu(){
        System.out.println("Hello User, let's get you started!");
        System.out.println("First, you'll be prompted to choose an option.");
        System.out.println("Then, We'll gather all the information you give us to keep in our system!");  
        System.out.println("You can tell me anything you want..I won't judge!");
        System.out.println();
        System.out.println();
    }

    public void printOptions(Scanner input, Inventory inventory){
        
        System.out.println("\t Here are your options: \t " );
        System.out.println("p.) Print the inventory");
        System.out.println("a.) Add items");
        System.out.println("u.) Subtract items");
        System.out.println("s.) Search for items(using description)");
        System.out.println("o.) Sort items");
        System.out.println("q.) Change quality of items" );
        System.out.println();
        System.out.println();
        System.out.println("What's your choice? ");
        
        userInput = input.nextLine();
        optionInput = userInput.charAt(0);
        
        
        /*
        if (optionInput == 'u'){
            System.out.println("Success");
        }
        */
        
        
        /*if (optionInput == 'p'){
      Cody's Class
        }
        */
        
        if (optionInput == 'a'){
            Item item = new Item();
            String newName, newDiscription;
            int newAmount;
            
            System.out.print("Enter the product name: ");
            newName = input.nextLine();
            
            System.out.print("Enter a discription for the product: ");
            newDiscription = input.nextLine();
             
            System.out.print("Enter how much of the product is available (in intager form): ");
            newAmount = input.nextInt();
            
            inventory.items.add(item);
            inventory.items.get(inventory.items.size() - 1).setName(newName);
            inventory.items.get(inventory.items.size() - 1).setDescription(newDiscription);
            inventory.items.get(inventory.items.size() - 1).setAmount(newAmount);
            System.out.println(inventory.items.get(inventory.items.size() - 1).getName());
            System.out.println(inventory.items.get(inventory.items.size() - 1).getDescription());
            System.out.println(inventory.items.get(inventory.items.size() - 1).getAmount());
        }
        
        
        
        /*if (optionInput != 's'){
      Kyle' Class
        }
        */
        
        /*if (optionInput != 'o'){
      Matt's Class
        }
        */
        
        /*if (optionInput != 'q'){
      James's Class
        }
        */
        
        //else(
        //System.out.println("I'm sorry, I didn't get that. Can you try again");
        //}
        
    } 
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        MenuPrinter intro = new MenuPrinter();
        Inventory inventory = new Inventory();

        intro.printStartMenu();

        intro.printOptions(input, inventory); 
        
        intro.printOptions(input, inventory);
        

    }
}    
    

