import java.util.ArrayList;
import java.util.List;

public final class Cart {
    private int cartID;                   // ID for Cart
    private List<Item> itemList;           // List of items in Cart
    private List<Integer> quantityList;    // Quantity per item in cart
    private List<Integer> subtotalList;    // Subtotal per item in cart
    private int total;                     // Total before VAT
    private final double VAT_RATE = 0.10;  // VAT rate (10%)

    // Default constructor
    public Cart() {
        this.cartID = 0;
        this.itemList = new ArrayList<>();
        this.quantityList = new ArrayList<>();
        this.subtotalList = new ArrayList<>();
        this.total = 0;
    }

    // Constructor with cartID
    public Cart(int cartID) {
        this.cartID = cartID;
        this.itemList = new ArrayList<>();
        this.quantityList = new ArrayList<>();
        this.subtotalList = new ArrayList<>();
        this.total = 0;
    }

    // Constructor with cartID, itemList, and quantityList
    public Cart(int cartID, List<Item> itemList, List<Integer> quantityList) {
        this.cartID = cartID;
        this.itemList = itemList;
        this.quantityList = quantityList;
        this.subtotalList = new ArrayList<>();
        calculateValues();  // Tính tổng giá trị và subtotal
    }

    // Add an item to the cart
    public void addItem(Item item, int qty) {
        itemList.add(item);
        quantityList.add(qty);
        calculateValues();  // Cập nhật subtotal và tổng khi thêm mục
    }

    // Remove an item from the cart
    public void removeItem(Item item) {
        int index = itemList.indexOf(item);
        if (index != -1) {
            itemList.remove(index);
            quantityList.remove(index);
            subtotalList.remove(index);
            calculateValues();  // Cập nhật subtotal và tổng khi xóa mục
        }
    }

    // Calculate subtotal and total price
    public void calculateValues() {
        total = 0;
        subtotalList.clear();  // Xóa danh sách subtotal cũ để tính toán lại
        for (int i = 0; i < itemList.size(); i++) {
            int subtotal = itemList.get(i).getUnitPrice() * quantityList.get(i);
            subtotalList.add(subtotal);
            total += subtotal;
        }
    }

    // Get subtotal for each item
    public List<Integer> getSubtotal() {
        return new ArrayList<>(subtotalList);  // Trả về bản sao của subtotalList
    }

    // Calculate total including VAT
    public double calculateTotalWithVAT() {
        return total + total * VAT_RATE;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Integer> getQuantityList() {
        return quantityList;
    }

    public void setQuantityList(List<Integer> quantityList) {
        this.quantityList = quantityList;
    }

    public List<Integer> getSubtotalList() {
        return subtotalList;
    }

    public void setSubtotalList(List<Integer> subtotalList) {
        this.subtotalList = subtotalList;
    }

    // toString method to display cart information
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart ID: ").append(cartID).append("\n");
        for (int i = 0; i < itemList.size(); i++) {
            sb.append(itemList.get(i).toString())
              .append("\n");
        }
        sb.append("Total (before VAT): $").append(total).append("\n");
        sb.append("Total (including VAT): $").append(calculateTotalWithVAT()).append("\n");
        return sb.toString();
    }
}
