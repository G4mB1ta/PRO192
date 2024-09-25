/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author Kim Minh Đức - HE181371

import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class PhanSo {
    int TuSo, MauSo;

    //…1. tạo getter, setter 
    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int TuSo) {
        this.TuSo = TuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setMauSo(int MauSo) {
        this.MauSo = MauSo;
    }
    //…2. tạo các phương thức nhập dữ liệu phù hợp: inputTuSo(), inputMauSo(), input()
    public void inputTuSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        TuSo = scanner.nextInt();
    }
    public void inputMauSo(int MauSo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mẫu số: ");
        MauSo = scanner.nextInt();
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        TuSo = scanner.nextInt();
        System.out.print("Nhập mẫu số: ");
        MauSo = scanner.nextInt();
    }
    //…3. tạo phương thức display() để hiển thị thông tin của phân số như tử số, mẫu số
    public void display() {
        if (MauSo == 0) {   
            System.out.println("Phân số chưa được khởi tạo hoặc không hợp lệ!!!");
        } else {
            System.out.println("Tử số: " + this.TuSo);
            System.out.println("Mẫu số: "+ this.MauSo);
        }
    } 
    //…4. tạo phương thức rutGon() để rút gọn phân số nếu TuSo và MauSo đã có giá tr
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void rutGon() {
        int ucln = gcd(Math.abs(TuSo), Math.abs(MauSo));
        TuSo = TuSo / ucln;
        MauSo = MauSo / ucln;
        
    }
    //…5. tạo phương thức daRutGon() trả về giá trị dạng boolean để kiểm tra xem phân số
    //hiện tại đã được rút gọn chưa? Nếu rút gọn rồi thì trả về true, nếu chưa thì trả về fals
    public boolean daRutGon() {
        int ucln = gcd(Math.abs(TuSo), Math.abs(MauSo));
        if (ucln == 1) return true;
        else return false;
    } 
    //…6. tạo phương thức congPhanSo(PhanSo k) để tiến hành cộng phân số hiện tại
    //với một phân số k là tham số truyền vào. Kết quả trả về cũng là một phân số.
    public PhanSo congPhanSo(PhanSo k) {
        PhanSo result = new PhanSo();
        result.setTuSo(this.TuSo * k.MauSo + this.MauSo * k.TuSo);
        result.setMauSo(this.MauSo * k.MauSo);
        result.rutGon();
        return result;
    }
}
