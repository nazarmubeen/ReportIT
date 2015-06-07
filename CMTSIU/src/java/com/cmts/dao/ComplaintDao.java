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
import com.cmts.model.Complaint;
import com.cmts.utility.DBUtility;
/**
 *
 * @author LENOVO
 */
public class ComplaintDao {
    private Connection connection;
public  ComplaintDao() {
connection = DBUtility.getConnection();
}
public void addUser(Complaint user) {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("insert into complaint_details(clt_id,user_id,clt_type,block_name,dept_name,loc_no,clt_reason,status) values (?,?, ?, ?,?,?,?,? )");
// Parameters start with 1
preparedStatement.setInt(1, user.getClt_id());
preparedStatement.setInt(2, user.getUser_id());
preparedStatement.setString(3, user.getClt_type());
preparedStatement.setString(4, user.getBlock_name());
preparedStatement.setString(5, user.getDept_name());
preparedStatement.setString(6, user.getLoc_no());
preparedStatement.setString(7, user.getClt_reason());
preparedStatement.setString(8, user.getClt_status());
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public void deleteUser(int clt_id) {
try {
PreparedStatement preparedStatement = connection
.prepareStatement("delete from complaint_details where clt_id=?");
// Parameters start with 1
preparedStatement.setInt(1, clt_id);
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public void updateUser(Complaint user) throws ParseException {
try {
PreparedStatement preparedStatement = connection.prepareStatement("update complaint_details set clt_type=?,block_name=?,dept_name=?,loc_no=?,clt_reason=?,clt_status=? " + " where clt_id=?");
// Parameters start with 1

preparedStatement.setString(1, user.getClt_type());
preparedStatement.setString(2, user.getBlock_name());
preparedStatement.setString(3, user.getDept_name());
preparedStatement.setString(4, user.getLoc_no());
preparedStatement.setString(5, user.getClt_reason());
preparedStatement.setString(6, user.getClt_status());
preparedStatement.setInt(7, user.getClt_id());
preparedStatement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
public List<Complaint> getAllUsers() {
List<Complaint> users = new ArrayList<Complaint>();
try {
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from complaint_details");
while (rs.next()) {
Complaint user = new Complaint();

user.setClt_id(rs.getInt("clt_id"));
user.setUser_id(rs.getInt("user_id"));
user.setClt_type(rs.getString("clt_type"));
user.setBlock_name(rs.getString("block_name"));
user.setDept_name(rs.getString("dept_name"));
user.setLoc_no(rs.getString("loc_no"));
user.setClt_reason(rs.getString("clt_reason"));
user.setClt_status(rs.getString("clt_status"));
users.add(user);
}
} catch (SQLException e) {
e.printStackTrace();
}
return users;
}
public Complaint getUserById(int clt_id) {
Complaint user = new Complaint();
try {
PreparedStatement preparedStatement = connection.
prepareStatement("select * from complaint_details where clt_id=?");
preparedStatement.setInt(1, clt_id);
ResultSet rs = preparedStatement.executeQuery();
if (rs.next()) {
user.setClt_id(rs.getInt("clt_id"));
user.setUser_id(rs.getInt("user_id"));
user.setClt_type(rs.getString("clt_type"));
user.setBlock_name(rs.getString("block_name"));
user.setDept_name(rs.getString("dept_name"));
user.setLoc_no(rs.getString("loc_no"));
user.setClt_reason(rs.getString("clt_reason"));
user.setClt_status(rs.getString("clt_status"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return user;
}
}

