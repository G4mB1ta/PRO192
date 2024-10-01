/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//@author Kim Minh Đức - HE181371

import java.lang.*;

public class Point {
    double x, y;
    
    public Point(double x, double y) {
        this.x = x; 
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
