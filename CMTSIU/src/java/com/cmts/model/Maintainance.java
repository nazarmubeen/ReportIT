/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.model;

/**
 *
 * @author LENOVO
 */
public class Maintainance {
    private int id;
    private String pass;
    private String work_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
    }
    
    
    @Override
public String toString() {
return "Maintainance [id=" + id + ", pass=" + pass
+ ", work_type=" + work_type + "]";
}
    
}
