/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.*;

public class Item {
    private int itemID;     // ID of item
    private String itemName;    // name of item;
    private String[] Images;    // list of links link to item's images;
    private String unitType;    // unit desciption
    private int unitPrice;  // price per unit

    public Item() {
        itemID = 0;
        itemName = "Unnamed";
        Images =  new String[0];
        unitType = "";
        unitPrice = 0;
    }

    public Item(int itemID, String itemName, String[] Images, String unitType, int unitPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.Images = Images;
        this.unitType = unitType;
        this.unitPrice = unitPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String[] getImages() {
        return Images;
    }

    public void setImages(String[] Images) {
        this.Images = Images;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", itemName=" + itemName + ", Images=" + Images + ", unitType=" + unitType + ", unitPrice=" + unitPrice + '}';
    }
    
}
