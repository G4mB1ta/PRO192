/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN;
// @author Kim Minh Đức - HE181371

import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s1 = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();
        scanner.close();
        
        int result = s1.compareTo(s2);
        
        if (result < 0) {
            result = -1;
        } else if (result > 0) {
            result = 1;
        }
        System.out.println(result);
    }
}
