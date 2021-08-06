/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Item> items = new ArrayList<Item>();
    String location;
    String companyName;
    
    public Inventory () {
        location = "none";
        companyName = "none";
    }
    
    public Inventory (String where, String nameOfCompany) {
        location = where;
        companyName = nameOfCompany;
    }

    public void addItem() {

    }

    public void removeItem() {

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

    public static void main(String[] args) {
        
    }
}