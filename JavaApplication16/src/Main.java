
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        System.out.println(s);
        int n, y, l;
        int a[] = new int[2101];
        
        n = sc.nextInt(); sc.nextLine();
        String raw[]= new String[n];
        String res[]= new String[n];
        
        do {
        
        } while 
        
        for (int i = 0; i < n; i++ ) {
            raw[i] = sc.nextLine();
            l = raw[i].length();
            y = Integer.parseInt(raw[i].substring(l-4, l));
            a[y] ++;
            
            res[i] = raw[i].substring(l-7, l-5)+ raw[i].substring(l-2, l);
            if (a[y] < 10) {
            res[i] += "000" + a[y]; 
            } else if (a[y] < 100) {
                res[i] += "00" + a[y];
            } else if (a[y] < 1000) {
                res[i] += "0" + a[y];
            } else {
                res[i] += a[y];
            } 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(res[i] + "|" + raw[i]);
        }
    }
    
}
