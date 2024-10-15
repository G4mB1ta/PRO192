/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author Kim Minh Đức - HE181371

package DTO;

public class ItemList {
    Item[] list;
    int numOfItem;
    final int MAX=100;
    
    public ItemList() {
        list = new Item[MAX];
        numOfItem = 0;
    }
    
    public boolean addItem(Item item) {
        if (item == null || numOfItem >= MAX) return false;
        list[numOfItem++] = item;
        return true;
    }
    
    public void displayAll() {
        if (numOfItem == 0) System.out.println("the list is empty");
        for (int i = 0; i < numOfItem; i++) System.out.println(list[i]);
    }
    
    public Item findItem(String creator) {
        for (int i = 0; i < numOfItem; i++) 
            if (list[i].getCreator().equals(creator))
                return list[i];
        return null;
    }
    
    public boolean updateItem(int i) {
        if (i >= 0 && i < numOfItem) {
           list[i].input();
           return true;
        }
        return false;
    }
    
    public boolean removeItem(int i) {
        if (i >= 0 && i < numOfItem) {
           for (int j = i; j < (numOfItem-1); j++) {
               list[j] = list[j+1];
           }
           numOfItem--;
           return true;
        }
        return false;
    }
    
    public void displayItemByType(String type) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getClass().getName().equals(type) || list[i].getClass().getName().equals("DTO." + type))
                System.out.println(list[i].toString());
        }
    }
    
    public void sortItems() {
        for (int i = 0; i < numOfItem-1; i++) {
            for (int j = i + 1; j < numOfItem; j++) {
                if (list[i].getValue() > list[j].getValue()) {
                    Item tmp = list[j];
                    list[j] = list[i];
                    list[i] = tmp;
                }
            }
        }
    }
}
