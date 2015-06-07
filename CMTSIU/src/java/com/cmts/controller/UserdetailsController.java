/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.controller;

/**
 *
 * @author LENOVO
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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


import com.cmts.dao.UserdetailsDao;
import  com.cmts.model.User_details;
/**
 *
 * @author LENOVO
 */
public class UserdetailsController extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
private UserdetailsDao dao;
public UserdetailsController() {
dao=new UserdetailsDao();
}
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}
    @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
if(request.getParameter("action")!=null){
List<User_details> lstUser=new ArrayList<User_details>();
String action=(String)request.getParameter("action");
Gson gson = new Gson();
response.setContentType("application/json");
if(action.equals("list")){
try{
//Fetch Data from User Table
lstUser=dao.getAllUsers();
//Convert Java Object to Json
JsonElement element = gson.toJsonTree(lstUser, new TypeToken<List<User_details>>() {}.getType());
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
User_details user=new User_details();
if(request.getParameter("id")!=null){
String id=(String)request.getParameter("id");
user.setId(id);
}
if(request.getParameter("uname")!=null){
String uname=(String)request.getParameter("uname");
user.setUname(uname);
}
if(request.getParameter("dob")!=null){
String dob=(String)request.getParameter("dob");
user.setDob(dob);
}
if(request.getParameter("des")!=null){
String des=(String)request.getParameter("des");
user.setDes(des);
}
if(request.getParameter("cont")!=null){
String cont=(String)request.getParameter("cont");
user.setCont(cont);
}

if(request.getParameter("pass")!=null){
String pass=(String)request.getParameter("pass");
user.setPass(pass);
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
String id=request.getParameter("id");
dao.deleteUser(id);
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

