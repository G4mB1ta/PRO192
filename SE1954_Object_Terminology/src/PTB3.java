/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.lang.*;
import java.util.*;
import java.io.*;

public class PTB3 {
    double HS3, HS2, HS1, HS0;
    
    public String solve(boolean displayResult) {
        String result;
        if(HS3 == 0) {
            
            result = new PTB2(this.HS2,this.HS1, this.HS0).solve(displayResult);
            return result;
        } else {
            return "";
        }
    }
}
