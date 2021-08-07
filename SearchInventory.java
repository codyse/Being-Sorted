package csu.csci325;
import java.util.*;

/**
*
* @author Kyle Gimple 
*/

public class SearchInventory {
	
	private String inventoryList;
	
	public int[] searchByName(String search, Inventory inventory) {
		// Initialize variables
		int numItems = inventory.items.size();
		int i = 0;
		int j = 0;
		int[] matches = new int[i];
		String name;
		
		// Loops through each item in the ArrayList items. If the name matches the search parameter it
		//		stores the indices of the item in the matches array.
		while (i < numItems) {
			name = inventory.items.get(i).getName();
			if (name.contains(search)) {
				matches[j] = i;
				j++;
			}
			i++;
		}
		return matches;
	}
	
	public int[] searchByDescription(String search, Inventory inventory) {
		// Initialize variables
		int numItems = inventory.items.size();
		int i = 0;
		int j = 0;
		int[] matches = new int[i];
		String name;
		
		// Loops through each item in the ArrayList items. If the name matches the search parameter it
		//		stores the indices of the item in the matches array.
		while (i < numItems) {
			name = inventory.items.get(i).getDescription();
			if (name.contains(search)) {
				matches[j] = i;
				j++;
			}
			i++;
		}
		return matches;
	}
	
}
