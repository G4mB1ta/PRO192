/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HE181371
 */
public class Main {

 public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();
        
        c1.SetReal(12);
        c1.SetImg(4);
        c2.Set(4, -12);
        
        ComplexNumber c3 = c1.Add(c2);
        c3.Display();
    }
}
