
import Voucher.PlatformVoucher;
import Voucher.ShopVoucher;
import Voucher.Voucher;
import Voucher.ShipVoucher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


enum PaymentTerm {
    CreditCard,
    ATM,
    VisaCard,
}

enum PurchaseOrderState {
    Confirming,
    Delivering,
    Finished,
}

public class PurchaseOrder {
    int PurchaseOrderID;    // ID of PurchaseOrder
    
    Customer Customer;      // contains Customer 
    Vendor Vendor;          // contains Vendor
    
    ShopVoucher shopVoucher;    // Voucher of shop or seller
    ShipVoucher shipVoucher;    // Voucher of delivery
    PlatformVoucher platformVoucher;// Voucher of platform
    
    Cart cart;        // cart contains list of Items
    
    String createdOn;
    String createdBy;
    String deliveryDate;
    
    String status;
    
    String paymentTerm; // Payment way
    
    
    public PurchaseOrder() {
        PurchaseOrderID = 0;
        Customer = new Customer();
        Vendor = new Vendor();
        shopVoucher = new ShopVoucher();
        shipVoucher = new ShipVoucher();
        platformVoucher = new PlatformVoucher();
        cart = new Cart();
        createdOn = "";
        createdBy = "";
        deliveryDate = "";
        status = "";
        paymentTerm = "";
    }

    public int getPurchaseOrderID() {
        return PurchaseOrderID;
    }

    public void setPurchaseOrderID(int PurchaseOrderID) {
        this.PurchaseOrderID = PurchaseOrderID;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public Vendor getVendor() {
        return Vendor;
    }

    public void setVendor(Vendor Vendor) {
        this.Vendor = Vendor;
    }

    public Voucher getPlatformVoucher() {
        return platformVoucher;
    }

    public void setPlatformVoucher(PlatformVoucher platformVoucher) {
        this.platformVoucher = platformVoucher;
    }

    public Voucher getShopVoucher() {
        return shopVoucher;
    }

    public void setShopVoucher(ShopVoucher shopVoucher) {
        this.shopVoucher = shopVoucher;
    }

    public Voucher getShipVoucher() {
        return shipVoucher;
    }

    public void setShipVoucher(ShipVoucher shipVoucher) {
        this.shipVoucher = shipVoucher;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" + "PurchaseOrderID=" + PurchaseOrderID 
                + ", Customer=" + Customer 
                + ", Vendor=" + Vendor 
                + ", shopVoucher=" + shopVoucher 
                + ", shipVoucher=" + shipVoucher 
                + ", platformVoucher=" + platformVoucher 
                + ", cart=" + cart 
                + ", createdOn=" + createdOn 
                + ", createdBy=" + createdBy 
                + ", deliveryDate=" + deliveryDate 
                + ", status=" + status 
                + ", paymentTerm=" + paymentTerm + '}';
    }
    
    
}
