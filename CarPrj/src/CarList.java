import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Lớp CarList mở rộng từ ArrayList để quản lý danh sách các đối tượng Car và cung cấp nhiều phương thức để thao tác với danh sách này.
public class CarList extends ArrayList<Car> {
    private String carID, color, frameID, engineID;  // Lưu thông tin tạm thời cho từng thuộc tính của xe.
    private Brand brand;                             // Lưu đối tượng thương hiệu cho mỗi xe.
    Menu menu = new Menu();                          // Tạo đối tượng Menu để hỗ trợ chọn thương hiệu.
    Scanner scanner = new Scanner(System.in);        // Scanner để nhập dữ liệu từ người dùng.
    BrandList brandList;                             // Danh sách các thương hiệu để chọn cho mỗi xe.
    BufferedReader br;                               // BufferedReader để đọc dữ liệu từ file.
    String line;                                     // Biến tạm thời để lưu từng dòng được đọc từ file.
    String[] arr;                                    // Mảng tạm thời để lưu dữ liệu đã tách từ từng dòng trong file.

    // Constructor để khởi tạo CarList với danh sách thương hiệu có sẵn.
    public CarList(BrandList bList) {
        brandList = bList;
    }

    // Phương thức để tải dữ liệu xe từ file chỉ định
    public boolean loadFromFile(String fileName) throws IOException {
        try {
            br = new BufferedReader(new FileReader(fileName));  // Mở file với tên fileName để đọc.
            line = br.readLine();                               // Đọc từng dòng trong file.
            while (line != null) {                              // Lặp qua từng dòng cho đến khi gặp dòng rỗng.
                arr = line.split(",");                          // Tách dòng thành mảng chuỗi dựa vào dấu phẩy.
                carID = arr[0].trim();                          // Lấy mã xe và loại bỏ khoảng trắng.
                brand = brandList.get(brandList.searchID(arr[1].trim()));  // Lấy thương hiệu xe từ danh sách thương hiệu.
                color = arr[2].trim();                          // Lấy màu xe và loại bỏ khoảng trắng.
                frameID = arr[3].trim();                        // Lấy mã khung xe và loại bỏ khoảng trắng.
                engineID = arr[4].trim();                       // Lấy mã động cơ và loại bỏ khoảng trắng.
                this.add(new Car(carID, brand, color, frameID, engineID));  // Thêm xe mới vào danh sách.
                line = br.readLine();                           // Đọc dòng tiếp theo.
            }
            br.close();                                         // Đóng file sau khi đọc xong.
return true;                                        // Trả về true nếu đọc thành công.
        } catch (FileNotFoundException e) {                     // Bắt lỗi nếu file không tìm thấy.
            System.out.println("File not found !");
        }
        return false;                                           // Trả về false nếu có lỗi.
    }

    // Phương thức mở file với tên fileName để ghi dữ liệu xe từng dòng dưới dạng text.
    public boolean saveToFile(String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));  // Mở file để ghi dữ liệu.
            for (Car i : this) {                          // Lặp qua từng xe trong danh sách.
                pw.println(i);                            // Ghi từng xe vào file.
            }
            pw.close();                                   // Đóng file sau khi ghi xong.
            return true;                                  // Trả về true nếu ghi thành công.
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;                                     // Trả về false nếu có lỗi.
    }

    // Tìm kiếm xe dựa vào mã xe (car ID).
    public int searchID(String carID) {
        for (int i = 0; i < this.size(); i++) {           // Duyệt qua danh sách xe.
            if (carID.equals(this.get(i).getCarID())) {   // So sánh mã xe.
                return i;                                 // Trả về vị trí của xe nếu tìm thấy.
            }
        }
        return -1;                                        // Trả về -1 nếu không tìm thấy.
    }
    
    // Tìm kiếm xe theo mã động cơ để kiểm tra không bị trùng.
    private int searchEngineID(String searchEngineID) {
        for (int i = 0; i < this.size(); i++) {                    // Duyệt qua danh sách xe.
            if (searchEngineID.equals(this.get(i).getEngineID())) { // So sánh mã động cơ.
                return i;                                          // Trả về vị trí nếu tìm thấy.
            }
        }
        return -1;                                                 // Trả về -1 nếu không tìm thấy.
    }

    // Tìm kiếm xe theo mã khung để kiểm tra không bị trùng.
    private int searchFrameID(String searchFrameID) {
        for (int i = 0; i < this.size(); i++) {                    // Duyệt qua danh sách xe.
            if (searchFrameID.equals(this.get(i).getFrameID())) {   // So sánh mã khung.
                return i;                                          // Trả về vị trí nếu tìm thấy.
            }
        }
        return -1;                                                 // Trả về -1 nếu không tìm thấy.
    }

    // Thêm xe mới vào danh sách
    public void addCar() {
        boolean checkCarID = false;
        do {
            System.out.print("Input car ID: ");
            carID = scanner.nextLine();
for (int i = 0; i < this.size(); i++) {
                if (carID.equals(this.get(i).getCarID())) {  // Kiểm tra mã xe có trùng hay không.
                    checkCarID = true;
                    System.out.println("This car ID is existed. Try another one!");
                    break;
                } else {
                    checkCarID = false;
                }
            }
        } while (checkCarID == true);  // Lặp lại nếu mã xe bị trùng.

        // Hiển thị menu để chọn thương hiệu xe.
        Brand brand = menu.ref_getChoice(brandList);
        
        // Nhập màu xe, không được để trống.
        do {
            System.out.print("Input color: ");
            color = scanner.nextLine();
            if (!color.equals("")) {
                break;
            }
            System.out.println("The color must not be null. Try again !");
        } while (true);

        // Nhập mã khung xe, phải đúng định dạng và không trùng lặp.
        do {
            System.out.print("Input frame ID: ");
            frameID = scanner.nextLine();
            if ((frameID.matches("F[0-9][0-9][0-9][0-9]")) && (searchFrameID(frameID) == -1)) {
                break;
            }
            System.out.println("The frame ID must be in F0000 format and not be duplicated. Try again !");
        } while (true);

        // Nhập mã động cơ, phải đúng định dạng và không trùng lặp.
        do {
            System.out.print("Input engine ID: ");
            engineID = scanner.nextLine();
            if ((engineID.matches("E[0-9][0-9][0-9][0-9]")) && (searchEngineID(engineID) == -1)) {
                break;
            }
            System.out.println("The engine ID must be in E0000 format and not be duplicated. Try again !");
        } while (true);

        this.add(new Car(carID, brand, color, frameID, engineID));  // Thêm xe mới vào danh sách.
        System.out.println("Car has added successfully !");
    }

    // In xe dựa theo tên thương hiệu.
    public void printBasedBrandName() {
        String aPartOfBrandName;
        int count = 0;
        System.out.println("Input brand name: ");
        aPartOfBrandName = scanner.nextLine();
        for (int i = 0; i < this.size(); i++) {
            if (aPartOfBrandName.matches(this.get(i).brand.getBrandName())) {
                System.out.println(this.get(i).screenString());
                count++;
            }
            if (count == 0) {
                System.out.println("No car is detected !");
            }
        }
    }

    // Xóa xe dựa trên mã xe (car ID).
    public boolean removeCar() {
        int pos;
        String removedID;
        System.out.print("Input car ID to removed: ");
        removedID = scanner.nextLine();
        pos = searchID(removedID);
        if (pos >= 0) {
            this.remove(pos);  // Xóa xe nếu tìm thấy.
            return true;
        }
        return false;
    }
// Cập nhật thông tin xe dựa trên mã xe (car ID).
    public boolean updateCar() {
        int pos;
        String updatedID;
        System.out.print("Input car ID to updated: ");
        updatedID = scanner.nextLine();
        pos = searchID(updatedID);
        if (pos >= 0) {
            Brand brand = menu.ref_getChoice(brandList);

            do {
                System.out.print("Input color: ");
                color = scanner.nextLine();
                if (!color.equals("")) {
                    break;
                }
                System.out.println("The color must not be null. Try again !");
            } while (true);

            do {
                System.out.print("Input frame ID: ");
                frameID = scanner.nextLine();
                if ((frameID.matches("F[0-9][0-9][0-9][0-9]")) && (searchFrameID(frameID) == -1)) {
                    break;
                }
                System.out.println("The frame ID must be in F0000 format and not be duplicated. Try again !");
            } while (true);

            do {
                System.out.print("Input engine ID: ");
                engineID = scanner.nextLine();
                if ((engineID.matches("E[0-9][0-9][0-9][0-9]")) && (searchEngineID(engineID) == -1)) {
                    break;
                }
                System.out.println("The engine ID must be in E0000 format and not be duplicated. Try again !");
            } while (true);

            this.set(pos, new Car(updatedID, brand, color, frameID, engineID));  // Cập nhật thông tin xe.
            return true;
        }
        return false;
    }

    // Sắp xếp danh sách xe theo mã xe.
    public void listCars() {
        Collections.sort(this);
        for (Car i : this) {
            System.out.println(i.screenString());
        }
    }
}