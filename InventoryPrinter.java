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
        System.out.println(inventoryFormat(inventory));
    }
    
    public void printToDocument(String fileName, Inventory inventory) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(fileName); 
        PrintWriter outFS = new PrintWriter(fileStream);
        
        
        outFS.println();
        
        outFS.close();
    }
    
    public String inventoryFormat (Inventory inventory) {
        String formation = "";
        
        for(int i = 0; i < inventory.items.size(); i++) {
            formation = formation + (i + 1) + "."
            		+ "  Name of item: " + inventory.items.get(i).getName() 
                    + "  Company Name: " + inventory.getCompanyName() 
                    + "  Amount: " + inventory.items.get(i).getAmount() 
                    + "  Location: " + inventory.getLocation() 
                    + "  Description: " + inventory.items.get(i).getDescription() + '\n' + '\n';
        }
        
        return formation;
    }
}
