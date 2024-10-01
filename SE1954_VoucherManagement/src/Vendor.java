/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.*;

public class Vendor extends Person {
    int vendorID;

    public Vendor() {
        super();
        vendorID = 0;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    @Override
    public String toString() {
        return "Vendor{" + "vendorID=" + vendorID + '}';
    }
    
}
