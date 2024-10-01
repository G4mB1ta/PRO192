/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.*;

public class Customer extends Person {
    int customerID;     //
    String tier; // Tier of Customer

    public Customer() {
        super();
        customerID = 0;
    }

    public Customer(int customerID, String location, String tier) {
        this.customerID = customerID;
        this.tier = tier;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", tier=" + tier + '}';
    }

    

    
    
}
