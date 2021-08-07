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
        String formation;
        
        formation = "Name          Company Name          Amount          Location          Description";
        
        for(int i = 0; i < inventory.items.size(); i++) {
            formation = formation + "Name of item: " + inventory.items.get(i).getName() + '\n'
                    + "Company Name: " + inventory.getCompanyName() + '\n'
                    + "Amount: " + inventory.items.get(i).getAmount() + '\n'
                    + "Location: " + inventory.getLocation() + '\n'
                    + "Description: " + inventory.items.get(i).getDescription() + '\n';
        }
        
        return formation;
    }
}
