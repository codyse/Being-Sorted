/*
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
    
    public String getLocation () {
        return location;
    }
    
    public String getCompanyName () {
        return companyName;
    }
    
    public void setLocation (String newLocation) {
        location = newLocation;
    }
    
    public void setCompanyName (String newCompanyName) {
        companyName = newCompanyName;
    }
}