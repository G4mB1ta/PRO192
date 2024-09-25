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

public class BTVN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        int result = 0;
        char currChar = 'a';

        for (int i = 0; i < str.length(); i++) {
            char nextChar = str.charAt(i);

            int left = (nextChar - currChar + 26) % 26;
            int right = (currChar - nextChar + 26) % 26;
            result += (left < right) ?  left : right;
            currChar = nextChar;
        }
        System.out.println(result);
    }
    
    // Optimized by ChatGPT
}
