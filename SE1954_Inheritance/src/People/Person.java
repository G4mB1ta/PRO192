/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author Kim Minh Đức - HE181371

package People;

import java.util.Random;

class Relationship {
    Person person; 
    Person.Relation relation;
}

public class Person {
    public int id;
    public String name;
    protected double money;
    protected Gender gender;
    private Relationship[] relationships;
    
    public enum Gender {
        Male,
        Female,
        Other,
    }
            
    public enum Relation {
        Father,
        Mother,
        Son,
        Daughter,
        Sugarbaby,
    }

    public Person() {
        randomID();
    }
    
    public void randomID() {
        Random random = new Random();
        this.id = random.nextInt(10000) + 1;
    }
    
}
