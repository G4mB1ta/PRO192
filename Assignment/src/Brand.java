/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Brand {
    String brandID;
    String brandName;
    String soundBrand;
    Double price;
    
    public Brand() {
        this.brandID = "AAA-0000";
        this.brandName = "Unnamed";
        this.soundBrand = "Unamed";
        this.price = 999999.0;
    }

    public Brand(String brandID, String brandName, String soundBrand, Double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.price = price;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSoundBrand() {
        return soundBrand;
    }

    public void setSoundBrand(String soundBrand) {
        this.soundBrand = soundBrand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "<"+ this.brandID+ ", " + this.brandName +", " + this.soundBrand + ", " + this.price + ">";
    }
    
}
