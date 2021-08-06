package csu.csci325;

/**
 * This class allows the user to print the inventory to the screen, or print the
 * inventory to a separate file
 * @author Cody
 */
public class InventoryPrinter {
    public void printInventory(Inventory inventory) {
        System.out.println("Name \t Company Name \t Amount \t Location\t Description");
        System.out.print ("Name: " + inventory.getName()
                + " Company Name: " + inventory.getCompanyName()
                + " Amount: " + inventory.getAmount() 
                + " Location: " + inventory.getLocation()
                + " Description: " + inventory.getDescription());
    }
    
    public void printToDocument(String fileName) {
        
    }
}

