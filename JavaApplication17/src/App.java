/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kmduc
 */

import java.util.Scanner;

public class App {
    
    static class Solve {
        String a, b, c = ""; // a,b là input  c là kết quả
        
        public void input() {
            Scanner sc = new Scanner(System.in);
            a = sc.nextLine();
            b = sc.nextLine();
        }

        public void process() {
            for (int i = 0; i < a.length(); i++) {
                
                // kí tự a[i] != b[i] thì c[i] = 1 không thì bằng  0
                c += (b.charAt(i) != a.charAt(i)) ? "1" : "0";
            }
        }

        public void output() {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Solve obj = new Solve();
        obj.input();
        obj.process();
        obj.output();
    }
    
}
