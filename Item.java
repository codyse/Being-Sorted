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

    public Item(String newName, int newAmount) {
        name = newName;
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
        System.out.print("Your item is: " + name + " and the amount you have is: " + amount);
    }
}
