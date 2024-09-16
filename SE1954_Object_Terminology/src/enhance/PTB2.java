
package enhance;

import java.lang.*;
import java.util.*;
import java.io.*;

public class PTB2 extends PTB1 {
    double HS2;
    
    public void updateHS2(double k) {
        HS2 = k;
    }
    
    public void updateHS(double HS2, double HS1, double HS0) {
        this.HS2 = HS2;
        this.HS1 = HS1;
        this.HS0 = HS0;
    }
    
    @Override
    public String solve(boolean displayResult) {
        String result;
        if(HS2 == 0) {
            PTB1 pt1 = new PTB1();
            pt1.updateHS(this.HS1, this.HS0);
            result = pt1.solve(displayResult);
            return result;
        } else {
            result = "Phương trình bậc 2 có dạng " + HS2 + "*x^2 + "+ HS1 + "*x + " + HS0 + " = 0";
            double delta = HS1*HS1 - 4*HS2*HS0;
            if (delta > 0) {
                double r1 = (-HS1 + Math.sqrt(delta))/(2*HS2);
                double r2 = (-HS1 - Math.sqrt(delta))/(2*HS2);
                result += " có 2 nghiệm phân biện: " + r1 + ", " + r2;
            } 
            else if (delta < 0) {
                result += " vô nghiệm";
            }
            else {
                double r3 = (-HS1)/(2*HS2);
                result += " có nghiệm kép: " + r3;
            }
            
            if (displayResult)
                System.out.println(result);
            return result;
        }
    }
    
    @Override
    public String display(boolean displayResult) {
        String res = HS2 + "*x^2 + " + super.display(false);
        if (displayResult) 
            System.out.println(res);
        return res;
    }
}
