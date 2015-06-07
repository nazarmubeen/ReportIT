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

import com.cmts.dao. MaintainanceDao;
import com.cmts.model. Maintainance;
/**
 *
 * @author LENOVO
 */
public class MaintainanceController extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
private  MaintainanceDao dao;
public  MaintainanceController() {
dao=new  MaintainanceDao();
}
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}
    @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
if(request.getParameter("action")!=null){
List< Maintainance> lstUser=new ArrayList< Maintainance>();
String action=(String)request.getParameter("action");
Gson gson = new Gson();
response.setContentType("application/json");
if(action.equals("list")){
try{
//Fetch Data from User Table
lstUser=dao.getAllUsers();
//Convert Java Object to Json
JsonElement element = gson.toJsonTree(lstUser, new TypeToken<List<Maintainance>>() {}.getType());
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
 Maintainance user=new  Maintainance();
if(request.getParameter("id")!=null){
int id=Integer.parseInt(request.getParameter("id"));
user.setId(id);
}
if(request.getParameter("pass")!=null){
String pass=(String)request.getParameter("pass");
user.setPass(pass);
}
if(request.getParameter("work_type")!=null){
String work_type=(String)request.getParameter("work_type");
user.setWork_type(work_type);
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
if(request.getParameter("id")!=null){
String id=(String)request.getParameter("id");
dao.deleteUser(Integer.parseInt(id));
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
