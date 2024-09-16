
package enhance;

import java.lang.*;
import java.util.*;
import java.io.*;

public class PTB1 {
    double HS1, HS0;
    
//    public PTB1(double HS1, double HS0) {
//        this.HS1 = HS1;
//        this.HS0 = HS0;
//    }
    
    public void updateHS1(double k) {
        HS1 = k;
    }
    
    public void updateHS0(double k) {
        HS0 = k;
    }
    
    public void updateHS(double HS1, double HS0) {
        this.HS1 = HS1;
        this.HS0 = HS0;
    }
    
    public String solve(boolean displayResult) {
        String result = "Phương trình bậc 1 dạng " + HS1 + "*x + " + HS0 + " = 0";
        
        if (HS1 != 0) {
            result += " có 1 nghiệm x = " + (-HS0/HS1);
        } else if (HS0 == 0) {
            result += " có vô số nghiệm";
        } else {
            result += " vô nghiệm";
        }
        
        if (displayResult)
            System.out.println(result);
        return result;
    }
    
    public String display(boolean displayResult) {
        String res = HS1 + "*x + " + HS0 + " = 0";
        if (displayResult) 
            System.out.println(res);
        return res;
    }
}
