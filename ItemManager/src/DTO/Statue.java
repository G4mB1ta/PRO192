/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue() {
        super();
        weight = 0;
        colour = "";
    }
    
    public Statue( int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
    
    public void inputStatue() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight? ");
        this.weight = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Colour? ");
        this.colour = sc.nextLine(); 
    }
}
