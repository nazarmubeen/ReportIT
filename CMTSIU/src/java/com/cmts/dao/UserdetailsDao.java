/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cmts.model.User_details;
import com.cmts.utility.DBUtility;
/**
 *
 * @author LENOVO
 */
public class UserdetailsDao {
    private Connection connection;
public  UserdetailsDao() {
connection = DBUtility.getConnection();
}
public void addUser(User_details user) {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("insert into user_details(id,uname,dob,des,cont,pass) values (?,?, ?, ?,?,? )");
// Parameters start with 1

preparedStatement.setString(1, user.getId());
preparedStatement.setString(2, user.getUname());
preparedStatement.setString(3, user.getDob());
preparedStatement.setString(4, user.getDes());
preparedStatement.setString(5, user.getCont());

preparedStatement.setString(6, user.getPass());
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public void deleteUser(String id) {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("delete from user_details where id='?'");
// Parameters start with 1
preparedStatement.setString(1, id);
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public void updateUser(User_details user) throws ParseException {
try {
PreparedStatement preparedStatement = connection.prepareStatement("update user_details set uname=?,dob=?,des=?,cont=?,pass=?" + " where id='?'");
// Parameters start with 1

preparedStatement.setString(1, user.getUname());
preparedStatement.setString(2, user.getDob());
preparedStatement.setString(3, user.getDes());
preparedStatement.setString(4, user.getCont());
preparedStatement.setString(5, user.getPass());
preparedStatement.setString(6, user.getId());


preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public List<User_details> getAllUsers() {
List<User_details> users = new ArrayList<User_details>();
try {
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from user_details");
while (rs.next()) {
User_details user = new User_details();
user.setId(rs.getString("id"));
user.setUname(rs.getString("uname"));
user.setDob(rs.getString("dob"));
user.setDes(rs.getString("des"));
user.setCont(rs.getString("cont"));

user.setPass(rs.getString("pass"));
users.add(user);
}
} catch (SQLException e) {
e.printStackTrace();
}
return users;
}
public User_details getUserById(String id) {
User_details user = new User_details();
try {
PreparedStatement preparedStatement = connection.
prepareStatement("select * from user_details where id='?'");
preparedStatement.setString(1, id);
ResultSet rs = preparedStatement.executeQuery();
if (rs.next()) {
 
      user.setId(rs.getString("id"));
user.setUname(rs.getString("uname"));
user.setDob(rs.getString("dob"));
user.setDes(rs.getString("des"));
user.setCont(rs.getString("cont"));

user.setPass(rs.getString("pass"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return user;
}
}


