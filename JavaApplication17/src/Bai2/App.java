//  package Bai2;
import java.util.Scanner;
 
public class App {
    static class Solve {
        int testcase;   // Số lượng testcase
        int test[];      // số lượng hộp mỗi testcase
        int min[];      // min mỗi hộp
        int box[][];       // số lượng kẹo mỗi hộp với mỗi testcase;
        int res[];      // kết quả
        
        public void input() {
            Scanner sc = new Scanner(System.in);
            testcase = sc.nextInt();
            
             test = new int[testcase];
            min = new int[testcase];
            res = new int[testcase];
            box = new int[testcase][50];
            
            for (int i = 0; i < testcase; i++) {
                test[i] = sc.nextInt();
                min[i] = 10000001;
                
                for (int j = 0; j < test[i]; j++) {
                    box[i][j] = sc.nextInt();
                    if (box[i][j] < min[i]) min[i] = box[i][j];
                }
            }
        }
        
        public void process() {
            for (int i = 0; i < testcase; i++) {
                for (int j = 0; j < test[i]; j++) {
                    res[i] += box[i][j] - min[i];
                }
            }
        }
        public void output() {
            for (int i = 0; i < testcase; i++) {
                System.out.println(res[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        Solve obj1 = new Solve();
        obj1.input();
        obj1.process();
        obj1.output();
    }
}