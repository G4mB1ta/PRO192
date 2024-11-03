
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BrandList extends ArrayList<Brand> {
    public BrandList() {
    }
    
    // 1
    public boolean loadFromFile(String fileName) {
        File f = new File(fileName);
        if (!f.exists()) {
//            System.out.println("File is not exists");
            return false;
        } else {
            // Read each line and add to BrandList in format
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    
                    String brandId, brandName, soundBrand;
                    Double price;
                    String a[] = line.split(", ");
                    
                    brandId = a[0];
                    brandName = a[1];
                    soundBrand = a[2].split(": ")[0];
                    price = Double.valueOf(a[2].split(": ")[1]);
                    Brand brand = new Brand(brandId, brandName, soundBrand, price);
                    
                    this.add(brand);
                }
            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
//        System.out.println("Load brands successfully");
        return true;
    }
    
    // 5
    public boolean saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            
            for (Brand b : this) {
                String str = b.getBrandID() + ", " +
                             b.getBrandName() + ", " +
                             b.getSoundBrand() + ": " +
                             b.getPrice() + "\n";
                writer.write(str);
            }
            
        } catch (IOException e) {
        }
        return true;
    }
    
    // 3
    public int searchID(String bID) {
        int N = this.size();
        for (int i = 0; i < N; i++) {
            if (bID.equals(this.get(i).getBrandID())) {
                return i;
            }
        }
        return -1;
    }
    
    public Brand getUserChoice() {
        Menu menu = new Menu();
        return menu.ref_getChoice(this);
    }
    
    // 2
    public void addBrand() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter brand id: ");
            String brandID = sc.nextLine();

            System.out.print("Enter brand name: ");
            String brandName = sc.nextLine();

            System.out.print("Enter sound brand: ");
            String soundBrand = sc.nextLine(); 

            System.out.print("Enter price: ");
            Double price = sc.nextDouble();

            Brand brand = new Brand(brandID, brandName, soundBrand, price);
            this.add(brand);
        } catch (Exception e) {
            System.out.println("Add failed");
        }
        
    }
    
    //4
    public void updateBrand() {
        try {
            System.out.print("Enter brand id: ");
            Scanner sc = new Scanner(System.in);
            String brandID = sc.nextLine();
            int pos = searchID(brandID);

            if (pos < 0) {
                System.out.println("Not found!");
            } else {
                System.out.print("Enter brand name: ");
                String brandName = sc.nextLine();
                System.out.print("Enter sound brand: ");
                String soundBrand = sc.nextLine();
                System.out.print("Enter price: ");
                Double price = sc.nextDouble();

                this.get(pos).setBrandName(brandName);
                this.get(pos).setSoundBrand(soundBrand);
                this.get(pos).setPrice(price);
            }    
        } catch (Exception e) {
            System.out.println("Update failed");
        }
    }
    
    // 1
    public void listBrands() {
        for (Brand b : this) {
            System.out.println(b.toString());
        }
    }
}
