/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author Kim Minh Đức - HE181371

import java.lang.*;
import java.util.*;
import java.io.*;

public class Line {
    Point beginPoint, endPoint;
    
    public Point getMiddlePoint() {
        double x = (beginPoint.x + endPoint.x) / 2;
        double y = (beginPoint.y + endPoint.y) / 2; 
        return new Point(x, y);
    }
}
