package csu.csci325;
import java.util.ArrayList;

/**
*
* @author Kyle Gimple 
*/

public class SearchInventory {
	
	private String inventoryList;
	
	public void searchByName(String search, ArrayList<Item> items) {
		// Initialize variables
		int numItems = items.size();
		int i = 0;
		int j = 0;
		int[] matches = new int[i];
		String name;
		
		// Loops through each item in the ArrayList items. If the name matches the search parameter it
		//		stores the indices of the item in the matches array.
		while (i < numItems) {
			name = items.get(i).getName();
			if (name.contains(search)) {
				matches[j] = i;
				j++;
			}
			i++;
		}
	}
	
	public void searchByDescription() {
		
	}

}
