package csu.csci325;

/**
 * This class allows the user to print the inventory to the screen, or print the
 * inventory to a separate file
 * @author Cody
 */
public class InventoryPrinter {
    public void printInventory(Inventory inventory) {
        System.out.println("Name \t Amount \t Description");
        System.out.print ("Name: " + inventory.getName() 
                + " Amount: " + inventory.getAmount() 
                + " Description: " + inventory.getDescription());
    }
    
    public void printToDocument(String fileName) {
        
    }
}

