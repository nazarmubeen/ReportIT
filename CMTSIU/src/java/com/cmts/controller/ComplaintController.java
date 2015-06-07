/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import com.cmts.dao.ComplaintDao;
import com.cmts.model.Complaint;
/**
 *
 * @author LENOVO
 */
public class ComplaintController extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
private ComplaintDao dao;
public ComplaintController() {
dao=new ComplaintDao();
}
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}
    @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
if(request.getParameter("action")!=null){
List<Complaint> lstUser=new ArrayList<Complaint>();
String action=(String)request.getParameter("action");
Gson gson = new Gson();
response.setContentType("application/json");
if(action.equals("list")){
try{
//Fetch Data from User Table
lstUser=dao.getAllUsers();
//Convert Java Object to Json
JsonElement element = gson.toJsonTree(lstUser, new TypeToken<List<Complaint>>() {}.getType());
JsonArray jsonArray = element.getAsJsonArray();
String listData=jsonArray.toString();
//Return Json in the format required by jTable plugin
listData="{\"Result\":\"OK\",\"Records\":"+listData+"}";
response.getWriter().print(listData);
}catch(Exception ex){
String error="{\"Result\":\"ERROR\",\"Message\":"+ex.getMessage()+"}";
response.getWriter().print(error);
}
}

//updatecode
else if(action.equals("create") || action.equals("update")){
Complaint user=new Complaint();
if(request.getParameter("clt_id")!=null){
int clt_id=Integer.parseInt(request.getParameter("clt_id"));
user.setClt_id(clt_id);
}
if(request.getParameter("user_id")!=null){
int user_id=Integer.parseInt(request.getParameter("user_id"));
user.setUser_id(user_id);
}
if(request.getParameter("clt_type")!=null){
String clt_type=(String)request.getParameter("clt_type");
user.setClt_type(clt_type);
}
if(request.getParameter("block_name")!=null){
String block_name=(String)request.getParameter("block_name");
user.setBlock_name(block_name);
}
if(request.getParameter("dept_name")!=null){
String dept_name=(String)request.getParameter("dept_name");
user.setDept_name(dept_name);
}
if(request.getParameter("loc_no")!=null){
String loc_no=(String)request.getParameter("loc_no");
user.setLoc_no(loc_no);
}
if(request.getParameter("clt_reason")!=null){
String clt_reason=(String)request.getParameter("clt_reason");
user.setClt_reason(clt_reason);
}
if(request.getParameter("clt_status")!=null){
String clt_status=(String)request.getParameter("clt_status");
user.setClt_status(clt_status);
}

//create code
try{
if(action.equals("create")){//Create new record
dao.addUser(user);
lstUser.add(user);
//Convert Java Object to Json
String json=gson.toJson(user);
//Return Json in the format required by jTable plugin
String listData="{\"Result\":\"OK\",\"Record\":"+json+"}";
response.getWriter().print(listData);
}else if(action.equals("update")){//Update existing record
dao.updateUser(user);
String listData="{\"Result\":\"OK\"}";
response.getWriter().print(listData);
}
}catch(Exception ex){
String error="{\"Result\":\"ERROR\",\"Message\":"+ex.getStackTrace().toString()+"}";
response.getWriter().print(error);
}
}
//delete code

else if(action.equals("delete")){//Delete record
try{
if(request.getParameter("clt_id")!=null){
String clt_id=(String)request.getParameter("clt_id");
dao.deleteUser(Integer.parseInt(clt_id));
String listData="{\"Result\":\"OK\"}";
response.getWriter().print(listData);
}
}catch(Exception ex){
String error="{\"Result\":\"ERROR\",\"Message\":"+ex.getStackTrace().toString()+"}";
response.getWriter().print(error);
}
}
}
}
    
    
}
