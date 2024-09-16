/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HE181371
 */
public class ComplexNumber {
    double real, img; 
    
    public void Display() {
        String display = real + " + " + img + "i";
        System.out.println(display);
    }
    
    public void SetReal(double real) {
        this.real = real;
    }
    
    public void SetImg(double img) {
        this.img = img;
    }
    
    public void Set(double real, double img){
        this.real = real;
        this.img = img;
    }
    
    public ComplexNumber Add(ComplexNumber x) {
        ComplexNumber result = new ComplexNumber();
        result.SetReal(real + x.real);
        result.SetImg(img + x.img);
        return result;
    }
}
