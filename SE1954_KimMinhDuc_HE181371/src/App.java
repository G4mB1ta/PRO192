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
        // TODO code application logic here
        
        PhanSo x = new PhanSo();
        x.input();
        x.display();
        x.rutGon();
        x.display();
        
        PhanSo y = new PhanSo();
        y.setTuSo(5);
        y.setMauSo(4);
        PhanSo z = x.congPhanSo(y);
        z.display();
    }
    
}
