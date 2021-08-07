package csu.csci325;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * This class allows the user to print the inventory to the screen, or print the
 * inventory to a separate file
 * @author Cody
 * @author Kyle Gimple
 */
public class InventoryPrinter {
    public void printInventory(Inventory inventory) {
        System.out.println("Name          Company Name          Amount          Location          Description");
        for(int i = 0; i < inventory.items.size(); i++) { // Changed inventory.items.length to inventory.items.size
            System.out.print ("Name: " + inventory.getName()
                    + " Company Name: " + inventory.getCompanyName()
                    + " Amount: " + inventory.getAmount() 
                    + " Location: " + inventory.getLocation()
                    + " Description: " + inventory.getDescription());
        }
    }
    
    public void printToDocument(String fileName, Inventory inventory) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(fileName); 
        PrintWriter outFS = new PrintWriter(fileStream);
        
        // outFS.println(printInventory(inventory));
        // replaced call to printInventory with the actual text value, as the printInventory doesn't have a return value.
        outFS.println("Name          Company Name          Amount          Location          Description");
        for(int i = 0; i < inventory.items.size(); i++) {
            outFS.print ("Name: " + inventory.getName()
                    + " Company Name: " + inventory.getCompanyName()
                    + " Amount: " + inventory.getAmount() 
                    + " Location: " + inventory.getLocation()
                    + " Description: " + inventory.getDescription());
        }
        
        outFS.close();
    }
}

