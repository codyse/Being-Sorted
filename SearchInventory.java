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
		int[] matches = new int[i];
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
	
	// searchByDescription shouldn't be used outside of this class. Use completeSearch instead.
	private static int[] searchByDescription(String search, Inventory inventory) {
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
		int counter = 0;
		for (int i = 0; i < nameMatch.length; i++) {
		    if (nameMatch[i] != 0) {
		        counter ++;
		    }
		}
		int completeArray[] = new int[counter];
		for (int i = 0; i < counter; i++) {
			completeArray[i] = mergedArray[i] - 1;
		}
		
		return completeArray;
	}
	
}
