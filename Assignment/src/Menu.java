/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public <E> int int_getChoice(ArrayList<E> options) {
        int N = options.size();
        for (int i = 0; i < N; i++) {
            System.out.println(i+1 + ". " + options.get(i).toString());
        }
        System.out.println("Please choose an option 1...N: ");
        int response = -1;
        Scanner sc = new Scanner(System.in);
        response = sc.nextInt();
        sc.nextLine();
        return response;
    }
    
    public <E> E ref_getChoice(ArrayList<E> options) {
        int response;
        int N = options.size();
        do {
            response = int_getChoice(options);
        } while (response < 0 || response > N);
        return options.get(response);
    }
}
