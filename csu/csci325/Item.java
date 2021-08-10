package csu.csci325;

/**
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
