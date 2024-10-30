/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarList extends ArrayList<Car>{
    BrandList brandList;
    
    public CarList(BrandList bList) {
        brandList = bList;
    }
    
    public boolean loadFromFile(String fileName) {
        File f = new File(fileName);
        if (!f.exists()) {
            return false;
        } else {
            
            // Read each line and add to BrandList in format
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    
                    String cID, color, fID, eID, bID;
                    Brand brand;
                    String a[] = line.split(", ");
                    cID = a[0];
                    brand = this.brandList.get(this.brandList.searchID(a[1]));
                    color = a[2];
                    fID = a[3];
                    eID = a[4];
                    Car car = new Car(cID, brand, color, fID, eID);
                    this.add(car);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    
    public boolean saveToFile(String fileName) {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Car car : this) {
                String str = car.getCarID() + ", " +
                             car.getBrand().getBrandID() + ", " +
                             car.getColor() + ", " +
                             car.getFrameID() + ", " +
                             car.getEngineID() + "\n";
                writer.write(str);
            }
        } catch (IOException e) {
        }
        
        return true;
    }
    
    public int searchID(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (ID.equals(this.get(i).getCarID())) {
                return i;
            }
        }
        return -1;
    }
    
    public int searchFrame(String fID) {
        for (int i = 0; i < this.size(); i++) {
            if (fID.equals(this.get(i).getFrameID())) {
                return i;
            }
        }
        return -1;
    }
    
    public int searchEngine(String eID) {
        for (int i = 0; i < this.size(); i++) {
            if (eID.equals(this.get(i).getEngineID())) {
                return i;
            }
        }
        return -1;
    }
    
    public void addCar() {
        String id = "C";
        int index = this.size() + 1;
        if (index <= 9) {
            id = id + "0" + index;
        } else {
            id = id + index;
        }
        
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Brand brand = menu.ref_getChoice(brandList);
        String color = sc.nextLine(); sc.nextLine();
        String fID = sc.nextLine(); sc.nextLine();
        String eID = sc.nextLine(); 
        
        Car car = new Car(id, brand, color, fID, eID);
        this.add(car);
    }
    
    public void printBasedBrandName() {
        
    }
    
    
    
    public boolean removeCar() {
        return true;
    }
    
    public boolean updateCar() {
        return true;
    }
    
    public void listCars() {
        int N = this.size();
        for (int i = 0; i < N; i++) {
            Car c = this.get(i);
            c.screenString();
        }
    }
}
