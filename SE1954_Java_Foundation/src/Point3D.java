/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author Kim Minh Đức - HE181371

public class Point3D extends Point{

    protected double z;
    
    public Point3D() {
        super(0, 0);
        z = 0;
    }
    
    public Point3D(double x, double y) {
        super(x, y);
        double z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +"{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
