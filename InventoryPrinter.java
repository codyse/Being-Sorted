package csu.csci325;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * This class allows the user to print the inventory to the screen, or print the
 * inventory to a separate file
 * @author Cody
 */
public class InventoryPrinter {
    public void printInventory(Inventory inventory) {
        System.out.println("Name          Company Name          Amount          Location          Description");
        for(int i = 0; i < inventory.items.length(); i++) {
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
        
        outFS.println(printInventory(inventory));
        
        outFS.close();
    }
}

