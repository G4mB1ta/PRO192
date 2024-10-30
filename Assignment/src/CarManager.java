
import java.util.ArrayList;
import java.util.Scanner;

public class CarManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ops = new ArrayList<String>();
        
        String brandFile = "src\\brands.txt";
        String carFile = "src\\cars.txt";
        
        BrandList brandList = new BrandList();
        boolean a = brandList.loadFromFile(brandFile);
        
        if (!a) return;
        
        CarList carList = new CarList(brandList);
        boolean b = carList.loadFromFile(carFile);
        
        if (!b) return;
        
        String choice1 = "List all brands";
        String choice2 = "Add a new brand";
        String choice3 = "Search a brand base on its ID";
        String choice4 = "Update a brand";
        String choice5 = "Save brands to the file, named brands.txt";
        String choice6 = "List all cars in ascending order of brand names";
        String choice7 = "List cars based on a part of an input brand name";
        String choice8 = "Add a car";
        String choice9 = "Remove a car based on its ID ";
        String choice10 = "Update a car based on its ID";
        String choice11 = "Save cars to file, named cars.txt";
        
        ops.add(choice1);
        ops.add(choice2);
        ops.add(choice3);
        ops.add(choice4);
        ops.add(choice5);
        ops.add(choice6);
        ops.add(choice7);
        ops.add(choice8);
        ops.add(choice9);
        ops.add(choice10);
        ops.add(choice11);
        
        Menu newMenu = new Menu();
        int choice;
        do {
            choice = newMenu.int_getChoice(ops);
            switch (choice) {
                case 1:
                    System.out.println(ops.get(choice-1));
                    brandList.listBrands();
                    break;
                case 2:
                    System.out.println(ops.get(choice-1));
                    brandList.addBrand();
                    break;
                case 3:
                    System.out.println(ops.get(choice-1));
                    System.out.print("Enter brand's id: ");
                    String bID = sc.nextLine();
                    int index = brandList.searchID(bID);
                    if (index != -1) {
                        System.out.println(brandList.get(index).toString());
                    } else {
                        System.out.println("Brand not found");
                    }
                    break;
                case 4:
                    System.out.println(ops.get(choice-1));
                    brandList.saveToFile(brandFile);
                    break;
                case 5:
                    System.out.println(ops.get(choice-1));
                    break;
                case 6:
                    System.out.println(ops.get(choice-1));
                    break;
                case 7:
                    System.out.println(ops.get(choice-1));
                    break;
                case 8:
                    System.out.println(ops.get(choice-1));
                    break;
                case 9:
                    System.out.println(ops.get(choice-1));
                    break;
                case 10:
                    System.out.println(ops.get(choice-1));
                    break;
                case 11:
                    System.out.println(ops.get(choice-1));
                    break;
                default:
                    System.out.println("Hhihihaha");
            }
        } while (choice > 0 && choice <= ops.size());
        
    }
}
