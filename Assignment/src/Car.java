/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Car {
    String carID;
    Brand brand;
    String color;
    String frameID;
    String engineID;

    public Car() {
    }

    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameID() {
        return frameID;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return "<" + this.carID + ", " + this.brand.getBrandID() + ", " + this.color + ", "+ this.frameID + ", "+ this.engineID +">" ;
    }
    
    public int comparedTo(Car car) {
        int result = this.getBrand().getBrandName().compareTo(car.getBrand().getBrandName());
        if (result != 0) return result;
        return this.getCarID().compareTo(car.getCarID());
    }
    
    public String screenString() {
        String str = "<" + this.brand.getBrandName() + "\n" + 
                     this.carID + ", " + 
                     this.color+ ", " + 
                     this.frameID + ", " + 
                     this.engineID;
        return str;
    }
}
