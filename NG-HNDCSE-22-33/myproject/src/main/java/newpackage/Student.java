/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.icbt.myproject.*;

/**
 *
 * @author trill
 */
public class Student extends Person {
    private String id;
    
    public Student(){
        super();
        this.id = "";
    }

    public Student(String id, String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
     
}