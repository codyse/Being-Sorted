package csu.csci325;

import java.util.ArrayList;

public class Inventory extends Item {

    ArrayList<Item> items = new ArrayList<Item>();
    String location;
    String companyName;

    public Inventory() {
        location = "none";
        companyName = "none";
    }

    public Inventory(String where, String nameOfCompany) {
        location = where;
        companyName = nameOfCompany;
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }
}
