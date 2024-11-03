//Khai báo lớp Car và triển khai giao diện Comparable<Car> để có thể so sánh đối tượng Car
public class Car implements Comparable<Car> {
    
    private String carID, color, frameID, engineID;
    
    public Brand brand;

    //Khởi tạo không tham số (constructor mặc định)
    public Car() {

    }

    //Khởi tạo có tham số để khởi tạo đối tượng Car với các thuộc tính
    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    //screenString để trả về chuỗi mô tả ngắn gọn của xe
    public String screenString() {
        //Sử dụng String.format để định dạng chuỗi thông tin chi tiết của xe
        return String.format("Car ID: %s | Brand: %s | Color: %s | Frame ID: %s | Engine ID: %s", 
                             carID, brand.getBrandName(), color, frameID, engineID);
    }

    //Truy xuất nhãn hiệu của xe
    public Brand getBrand() {
        return brand;
    }

    //Truy xuất mã xe
    public String getCarID() {
        return carID;
    }

    //Truy xuất màu sắc của xe
    public String getColor() {
        return color;
    }

    //Truy xuất mã khung của xe
    public String getFrameID() {
        return frameID;
    }

    //Truy xuất mã động cơ của xe
    public String getEngineID() {
        return engineID;
    }

    //Thiết lập nhãn hiệu cho xe
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    //Thiết lập mã xe
    public void setCarID(String carID) {
        this.carID = carID;
    }

    //Thiết lập màu sắc của xe
    public void setColor(String color) {
        this.color = color;
    }

    //Thiết lập mã khung của xe
    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    //Thiết lập mã động cơ của xe
    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    //toString để hiển thị thông tin xe dưới dạng chuỗi
    @Override
    public String toString() {
        return carID + ", " + brand + ", " + color + ", " + frameID + ", " + engineID;
    }

    //So sánh hai xe dựa trên nhãn hiệu để sắp xếp
    @Override
    public int compareTo(Car o) {
        return this.brand.getBrandName().compareTo(o.brand.getBrandName());
    }

    //Kiểm tra hai xe có cùng mã khung và mã động cơ không
    public boolean isValid() {
        //Điều kiện: mã khung bắt đầu bằng "F" và có độ dài là 5, mã động cơ bắt đầu bằng "E" và có độ dài là 5
        return frameID.matches("^F\\w{4}$") && engineID.matches("^E\\w{4}$");
    }
}