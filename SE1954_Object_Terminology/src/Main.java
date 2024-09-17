/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean isDisplayResult = true;
        String result;
        
        PTB1 pt1 = new PTB1(3, 5);
        result = pt1.solve(isDisplayResult);
        
        pt1.updateHS(8, 0);
        result = pt1.solve(isDisplayResult);
        
        pt1.updateHS(0, 0);
        result = pt1.solve(isDisplayResult);
        
        pt1.updateHS(0, -5);
        result = pt1.solve(isDisplayResult);
        
        PTB2 pt2 = new PTB2(1, 2, 3);
        result = pt2.solve(isDisplayResult);
        
        pt2.updateHS(0, 8, 10);
        result = pt2.solve(isDisplayResult);
        
        pt2.updateHS(1, -2, 1);
        result = pt2.solve(isDisplayResult);
        
        // 16 / 9 / 2024 
        
        enhance.PTB2 pt22 = new enhance.PTB2();

        pt22.display(true);
    }
    
}
