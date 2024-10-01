/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kmduc
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create some items
        Item item1 = new Item(101, "Laptop", new String[]{"laptop1.jpg", "laptop2.jpg"}, "pcs", 1000);
        Item item2 = new Item(102, "Mouse", new String[]{"mouse1.jpg"}, "pcs", 50);
        Item item3 = new Item(103, "Keyboard", new String[]{"keyboard1.jpg"}, "pcs", 150);

        // Create a cart and add items
        Cart cart = new Cart(1);
        cart.addItem(item1, 1);  // 1 Laptop
        cart.addItem(item2, 2);  // 2 Mice
        cart.addItem(item3, 1);  // 1 Keyboard

        // Calculate the total
        cart.calculateValues();

        // Use the toString() method to display the cart details
        System.out.println(cart.toString());

        // Remove an item and display the cart again
        cart.removeItem(item2);  // Remove Mouse
        cart.calculateValues();
        System.out.println(cart);
    }
    
}
