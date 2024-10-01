
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Person {
    public int id;
    public String name;
    private double money;
    private int MST;
    

    public Person() {
        id = 0;
        name = "";
        money = 0;
        MST = 0;
    }

    public Person(int id, String name, double money, int MST) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.MST = MST;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getMST() {
        return MST;
    }

    public void setMST(int MST) {
        this.MST = MST;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", money=" + money + ", MST=" + MST + '}';
    }
    
    
}
