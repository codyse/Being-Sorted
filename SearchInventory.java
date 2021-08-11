package csu.csci325;
import java.util.stream.IntStream;

/**
*
* @author Kyle Gimple 
*/

public class SearchInventory {
	
	public static int[] searchByName(String search, Inventory inventory) {
		// Initialize variables
		int numItems = inventory.items.size();
		int i = 0;
		int j = 0;
		int[] matches = new int[numItems];
		String name;
		
		// Loops through each item in the ArrayList items. If the name matches the search parameter it
		//		stores the indices of the item in the matches array.
		while (i < numItems) {
			name = inventory.items.get(i).getName();
			if (name.contains(search)) {
				matches[j] = i + 1;
				j++;
			}
			i++;
		}
		return matches;
	}
	
	// only use this if you want to search description without searching by name; otherwise use completeSearch.
	public static int[] searchByDescription(String search, Inventory inventory) {
		// Initialize variables
		int numItems = inventory.items.size();
		int i = 0;
		int j = 0;
		int[] matches = new int[numItems];
		String name;
		
		// Loops through each item in the ArrayList items. If the name matches the search parameter it
		//		stores the indices of the item in the matches array.
		while (i < numItems) {
			name = inventory.items.get(i).getDescription();
			if (name.contains(search)) {
				matches[j] = i + 1;
				j++;
			}
			i++;
		}
		return matches;
	}
	public static int[] completeSearch(String search, Inventory inventory) {
		int[] nameMatch = searchByName(search, inventory);
		int[] descriptionMatch = searchByDescription(search, inventory);
		int[] mergedArray = IntStream.concat(IntStream.of(nameMatch), IntStream.of(descriptionMatch)).distinct().sorted().toArray();
		
		return mergedArray;
	}
	
}