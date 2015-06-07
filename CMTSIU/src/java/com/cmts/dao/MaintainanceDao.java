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
import com.cmts.model.Maintainance;
import com.cmts.utility.DBUtility;
/**
 *
 * @author LENOVO
 */
public class MaintainanceDao {
    private Connection connection;
public MaintainanceDao() {
connection = DBUtility.getConnection();
}
public void addUser(Maintainance user) {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("insert into maintainance_engineer(id,pass,work_type) values (?,?, ? )");
// Parameters start with 1
preparedStatement.setInt(1, user.getId());
preparedStatement.setString(2, user.getPass());
preparedStatement.setString(3, user.getWork_type());
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public void deleteUser(int id) {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("delete from maintainance_engineer where id=?");
// Parameters start with 1
preparedStatement.setInt(1, id);
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public void updateUser(Maintainance user) throws ParseException {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("update maintainance_engineer set pass=?,work_type=?" +"where id=?");
// Parameters start with 1
preparedStatement.setString(1, user.getPass());
preparedStatement.setString(2, user.getWork_type());
preparedStatement.setInt(3, user.getId());
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}

public List<Maintainance> getAllUsers() {
List<Maintainance> users = new ArrayList<Maintainance>();
try {
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from maintainance_engineer");
while (rs.next()) {
Maintainance user = new Maintainance();
user.setId(rs.getInt("id"));
user.setPass(rs.getString("pass"));
user.setWork_type(rs.getString("work_type"));
users.add(user);
}
} catch (SQLException e) {
e.printStackTrace();
}
return users;
}
public Maintainance getUserById(int id) {
Maintainance user = new Maintainance();
try {
PreparedStatement preparedStatement = connection.
prepareStatement("select * from maintainance_engineer where id=?");
preparedStatement.setInt(1, id);
ResultSet rs = preparedStatement.executeQuery();
if (rs.next()) {
user.setId(rs.getInt("id"));
user.setPass(rs.getString("pass"));
user.setWork_type(rs.getString("work_type"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return user;
}
}


