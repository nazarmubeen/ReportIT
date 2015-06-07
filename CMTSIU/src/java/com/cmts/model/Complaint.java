/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.model;

/**
 *
 * @author LENOVO
 */
public class Complaint {
 private int clt_id;
 private int user_id;
private String clt_type;
private String block_name;
private String dept_name;
private String loc_no;
private String clt_reason;
private String clt_status;

    public String getClt_status() {
        return clt_status;
    }

    public void setClt_status(String clt_status) {
        this.clt_status = clt_status;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public int getClt_id() {
        return clt_id;
    }

    public void setClt_id(int clt_id) {
        this.clt_id = clt_id;
    }

    public String getClt_reason() {
        return clt_reason;
    }

    public void setClt_reason(String clt_reason) {
        this.clt_reason = clt_reason;
    }

    public String getClt_type() {
        return clt_type;
    }

    public void setClt_type(String clt_type) {
        this.clt_type = clt_type;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getLoc_no() {
        return loc_no;
    }

    public void setLoc_no(String loc_no) {
        this.loc_no = loc_no;
    }

    

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

@Override
public String toString() {
return "Complaint [clt_id=" + clt_id + ",user_id=" + user_id + ", clt_type=" + clt_type + ",block_name=" + block_name + ",dept_name=" + dept_name + ",loc_no=" + loc_no + ",clt_reason=" + clt_reason + ",clt_status=" + clt_status + "]";


}

}
