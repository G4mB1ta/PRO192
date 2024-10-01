/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author Kim Minh Đức - HE181371

import java.lang.*;

public class Point {
    protected double x, y;

    public Point() {
        x = y = 0;
    }

    public Point(double k) {
        this.x = this.y = k;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "x=" + x + ", y=" + y + '}';
    }
}
