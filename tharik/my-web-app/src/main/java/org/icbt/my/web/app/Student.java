/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.app;

/**
 *
 * @author tharik
 */
public class Student {
    
    private String id;
    private String name;
    private String nic;

    public Student() {
        this.id = "";
        this.name = "";
        this.nic = "";
    }

    public Student(String id, String name, String nic) {
        this.id = id;
        this.name = name;
        this.nic = nic;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
    
}
