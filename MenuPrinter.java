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
    
    public void printStartMenu(){
        System.out.println("Hello User, let's get you started!");
        System.out.println("First, you'll be prompted to choose an option.");
        System.out.println("Then, We'll gather all the information you give us to keep in our system!");  
        System.out.println("You can tell me anything you want..I won't judge!");
        System.out.println();
        System.out.println();
    }

    public boolean printOptions (Scanner input, Inventory inventory, InventoryPrinter printer){
        
        System.out.println("\t Here are your options: \t " );
        System.out.println("p.) Print the inventory");
        System.out.println("a.) Add items");
        System.out.println("u.) Subtract items");
        System.out.println("s.) Search for items by name");
        System.out.println("d.) Search for items by description");
        System.out.println("o.) Sort items");
        System.out.println("c.) Change company name and location");
        System.out.println("x.) Exit" );
        System.out.println();
        System.out.println();
        System.out.println("What's your choice? ");
        
        optionInput = input.nextLine().charAt(0);
        optionInput = Character.toLowerCase(optionInput);
        
        if (optionInput == 'u') {
        	int selection;
        	//print inventory
            printer.printInventory(inventory);
            
            //make selection
            System.out.println("Select an Item to remove: ");
            selection = input.nextInt();
            input.nextLine();
            
            //remove selection
            inventory.items.remove(selection - 1);
        }
        else if (optionInput == 'p') {
            printer.printInventory(inventory);
        }
        else if (optionInput == 'a') {
            Item item = new Item();
            String newName, newDiscription;
            int newAmount;
            
            System.out.print("Enter the product name: ");
            newName = input.nextLine();
            
            System.out.print("Enter a discription for the product: ");
            newDiscription = input.nextLine();
             
            System.out.print("Enter how much of the product is available (in intager form): ");
            newAmount = input.nextInt();
            input.nextLine();
            
            inventory.items.add(item);
            inventory.items.get(inventory.items.size() - 1).setName(newName);
            inventory.items.get(inventory.items.size() - 1).setDescription(newDiscription);
            inventory.items.get(inventory.items.size() - 1).setAmount(newAmount);
        }
        else if (optionInput == 's') {
        	System.out.println("Enter the search term:");
        	String searchTerm = input.nextLine();
        	int[] matches;
        	matches = SearchInventory.searchByName(searchTerm, inventory);
        	for(int i = 0; i < matches.length; i++) {
        		if (matches[i] > 0) {
        			System.out.println("Name: " + inventory.items.get(matches[i]-1).getName());
        			System.out.println("Description: " + inventory.items.get(matches[i]-1).getDescription());
        			System.out.println("Name: " + inventory.items.get(matches[i]-1).getAmount());
        			System.out.println();
        		}
        	}
        }
        else if (optionInput == 'd') {
        	System.out.println("Enter the search term:");
        	String searchTerm = input.nextLine();
        	int[] matches;
        	matches = SearchInventory.completeSearch(searchTerm, inventory);
        	for(int i = 0; i < matches.length; i++) {
        		if (matches[i] > 0) {
        			System.out.println("Name: " + inventory.items.get(matches[i]-1).getName());
        			System.out.println("Description: " + inventory.items.get(matches[i]-1).getDescription());
        			System.out.println("Name: " + inventory.items.get(matches[i]-1).getAmount());
        			System.out.println();
        		}
        	}
        }
        else if (optionInput == 'o') {
        
        }
        else if (optionInput == 'c') {
        	String location, companyName;
        	
        	System.out.print("Enter the location of the product: ");
            location = input.nextLine();
            
            System.out.print("Enter the company that sells the product: ");
            companyName = input.nextLine();
            
            inventory.setCompanyName(companyName);
            inventory.setLocation(location);
        }
        else if (optionInput == 'x') {
        	return false;
        }
        else {
        		System.out.println("I'm sorry, I didn't get that. Can you try again");
        }
        
        return true;
    } 
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        MenuPrinter intro = new MenuPrinter();
        Inventory inventory = new Inventory();
        InventoryPrinter printer = new InventoryPrinter();
        boolean run = true;
        intro.printStartMenu();
        while(run) {
        	run = intro.printOptions(input, inventory, printer);
        	System.out.println();
        }
      
    }
}