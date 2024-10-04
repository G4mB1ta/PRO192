/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;
    
    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase( int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
    
    public void inputVase() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Height? ");
        this.height = sc.nextInt();         
        sc.nextLine();
        System.out.println("Material? ");
        this.material = sc.nextLine();
    }
}
