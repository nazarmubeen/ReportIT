/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.model;

/**
 *
 * @author sony
 */
public class User_details {
    private String uname;
private String dob;
private String des;
private String cont;
private String id;
private String pass;

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    
    @Override
public String toString() {
return "Complaint [uname=" + uname + ",dob=" + dob+ ", des=" + des + ",cont=" +cont + ",id=" + id + ",pass=" + pass + "]";


}
    
}
