/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author Alan Macklin
 * @author Cody Scheer
 * @author James Dixon
 */

public class Item {
    private String name;
    private String description;
    private int amount;

    public Item() {
        name = "none";
        description = "none";
        amount = 0;
    }
    
    public Item(String newName, String newDescription, int newAmount) {
        name = newName;
        description = newDescription;
        amount = newAmount;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void printItem() {
        System.out.println("Item: " + name + " x " + amount);
        System.out.println("Description: " + description);
    }
}
