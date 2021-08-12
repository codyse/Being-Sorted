/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package csu.csci325;

import java.util.ArrayList;

/**
 * Sort Inventory Class
 * Used to modify the inventory in different ways including:
 *      Sort By Name
 *      Sort By Amount Ascending
 *      Sort By Amount Descending
 *      Switch The Position Of Two Items
 * @Edward Phillips
 */
public class SortInventory {
    
    public static void sortByName(Inventory currInventory) {
        String tempStringFirst = ""; 
        String tempStringSec = "";
        int tempIntFirst = 0;
        int tempIntSec = 0;
        String desOne = "";
        String desTwo = "";
        
        for(int i = 0; i < currInventory.items.size() - 1; i++) {
            for(int j = i + 1; j < currInventory.items.size(); j++) {
                tempStringFirst = currInventory.items.get(i).getName();
                tempStringSec = currInventory.items.get(j).getName();
                tempIntFirst = currInventory.items.get(i).getAmount();
                tempIntSec = currInventory.items.get(j).getAmount();
                tempIntFirst = currInventory.items.get(i).getDescription();
                tempIntSec = currInventory.items.get(j).getDescription();
                
                if(tempStringFirst.compareTo(tempStringSec) > 0) {
                    String temp =  tempStringFirst;
                    int amount = tempIntFirst;
                    currInventory.items.get(i).setName(tempStringSec);
                    currInventory.items.get(i).setAmount(tempIntSec);
                    currInventory.items.get(j).setName(temp);
                    currInventory.items.get(j).setAmount(amount);
                    currInventory.items.get(i).setDescription(desOne);
                    currInventory.items.get(j).setDescription(desTwo);
                }
            }
        }
    }
    
    public static void sortByAmountAcend(Inventory currInventory) {
        int tempAmountOne = 0;
        int tempAmountTwo = 0;
        String tempStringOne = ""; 
        String tempStringTwo = "";
        String desOne = "";
        String desTwo = "";
  
        for(int i = 0; i < currInventory.items.size(); i++) {
            for(int j = i + 1; j < currInventory.items.size(); j++) {
                if(currInventory.items.get(i).getAmount() > 
                    currInventory.items.get(j).getAmount()) {
                        tempAmountOne = currInventory.items.get(i).getAmount();
                        tempAmountTwo = currInventory.items.get(j).getAmount();
                        tempStringOne = currInventory.items.get(i).getName();
                        tempStringTwo = currInventory.items.get(j).getName();
                        desOne = currInventory.items.get(i).getDescription();
                        desTwo = currInventory.items.get(j).getDescription();
                        currInventory.items.get(i).setAmount(tempAmountTwo); 
                        currInventory.items.get(j).setAmount(tempAmountOne);
                        currInventory.items.get(i).setName(tempStringTwo); 
                        currInventory.items.get(j).setName(tempStringOne);
                }
            }
        }
    }
                    
    public static void  sortByAmountDecend(Inventory currInv) {
        int tempAmountOne = 0;
        int tempAmountTwo = 0;
        String tempStringOne = ""; 
        String tempStringTwo = "";
        String desOne = "";
        String desTwo = "";

        for(int i = 0; i < currInv.items.size(); i++) {
                for(int j = i + 1; j < currInv.items.size(); j++) {
                    if(currInv.items.get(i).getAmount() < 
                        currInv.items.get(j).getAmount()) {
                            tempAmountOne = currInv.items.get(i).getAmount();
                            tempAmountTwo = currInv.items.get(j).getAmount();
                            tempStringOne = currInv.items.get(i).getName();
                            tempStringTwo = currInv.items.get(j).getName();
                            desOne = currInv.items.get(i).getDescription();
                            desTwo = currInv.items.get(j).getDescription();
                            currInv.items.get(i).setAmount(tempAmountTwo); 
                            currInv.items.get(j).setAmount(tempAmountOne);
                            currInv.items.get(i).setName(tempStringTwo); 
                            currInv.items.get(j).setName(tempStringOne);
                            currInv.items.get(i).setDescription(desOne);
                            currInv.items.get(j).setDescription(desTwo);
                    }
                }
        }
    }    

    public static void switchPosition(Inventory currInv, String firstItem,
                                      String secItem) {
        String tempOne = "";
        String tempTwo = "";
        int tempAmountOne = 0;
        int tempAmountTwo = 0;
        String desOne = "";
        String desTwo = "";
        int indexOne = 0;
        int indexTwo = 0;
        boolean checkOne = false;
        boolean checkTwo = false;
        
        for(int i = 0; i < currInv.items.size(); i++) {
            if(currInv.items.get(i).getName().equals(firstItem)) {
                tempOne += firstItem;
                tempAmountOne = currInv.items.get(i).getAmount();
                desOne = currInv.items.get(i).getDescription();
                indexOne = i;
                checkOne = true;
                break;
            }
            if(i == currInv.items.size() - 1 && !currInv.items.get(i).getName()
               .equals(firstItem)) {
                System.out.println("Error! Can't find " + firstItem + " in our "
                        + "inventory.");
            }
        }
        
        for(int i = 0; i < currInv.items.size(); i++) {
            if(currInv.items.get(i).getName().equals(secItem)) {
                tempTwo += secItem;
                tempAmountTwo = currInv.items.get(i).getAmount();
                desTwo = currInv.items.get(i).getDescription();
                indexTwo = i;
                checkTwo = true;
                break;
            }
            if(i == currInv.items.size() - 1 && !currInv.items.get(i).getName()
               .equals(secItem)) {
                System.out.println("Error! Can't find " + secItem + " in our "
                        + "inventory.");
            }
        }
        
        if(checkOne && checkTwo) {
            currInv.items.get(indexOne).setName(tempTwo);
            currInv.items.get(indexTwo).setName(tempOne);
            currInv.items.get(indexOne).setAmount(tempAmountTwo);
            currInv.items.get(indexTwo).setAmount(tempAmountOne);
            currInv.items.get(indexOne).setDescription(desOne);
            currInv.items.get(indexTwo).setDescription(desTwo);
        }
    }

    public static void main(String args[])  //static method  
{  
System.out.println("Static method");  
}  
}
