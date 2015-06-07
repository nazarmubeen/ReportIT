<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>User Home</title>
<meta name="keywords" content="free css templates, web templates, Business Solution, XHTML, CSS" />
<meta name="description" content="Business Solution Template - Free Web Template, HTML CSS Layout, Free Download" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
function clearText(field){

    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;

}
</script>
<!--[if lt IE 7]>
<style type="text/css">
    
    .templatemo_icon_home { behavior: url(iepngfix.htc); }
    .templatemo_icon_cube { behavior: url(iepngfix.htc); }
    .templatemo_icon_tick { behavior: url(iepngfix.htc); }
    
</style>
<![endif]-->

</head>
<body>
<!--  Free CSS Template designed by TemplateMo.com  -->
<div id="templatemo_container">
		<div id="templatemo_header">
        	
        </div><!-- End Of Header -->
        
        <div id="templatemo_content">
        	<div id="templatemo_left_content">
           	  <div class="templatemo_menu">
               	  <ul>
					  <li><a href="User_Home.jsp" target="_parent" class="current">Home</a></li>
					  <li><a href="checkusercomplaint.jsp" target="_parent">Check  Complaint status </a></li>
				      <li><a href="Insert_Complaint.jsp" target="_parent">Insert Complaints </a></li>	
				      <li><a href="Edit_Profile.jsp">Edit Profile </a></li>
					   <li><a href="Workschedules.jsp">Check  Workschedules </a></li>
			      </ul>
              </div>

			  <p>&nbsp;</p>
			  <div class="templatemo_section_bottom_line"></div>
            <div class="templatemo_section">
              <p>&nbsp;</p>
              <p>&nbsp;</p>
              <p>&nbsp;</p>
              <p>&nbsp;</p>
            </div>
            <div class="templatemo_section_bottom_line"></div>
            
            <div class="templatemo_section_bottom_line"></div>
            
            
            <div class="templatemo_section_bottom_line"></div>
            

            </div><!-- End Of left Content -->
            <div id="templatemo_right_content">
				<div id="templatemo_content_area">
                	<div class="templatemo_title">
                    	your complaints are: </div>
                    
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
  
   <div>
                  <%
   try
   {
  
 int uid=Integer.parseInt(request.getParameter("userid"));
   out.println(uid);
     }
   catch(Exception eee){}
   %>
        <center>
       <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3307/cmts"
user="root" password="prad"/>
<sql:query dataSource="${snapshot}" var="result">
    SELECT * from complaint_details where user_id= <%= request.getParameter("userid") %>;
</sql:query>
<table border="1" width="100%">
<tr>
<th>clt_id</th>
<th>user_id</th>
<th>clt_type</th>
<th>block_name</th>
<th>loc_no</th>
<th>clt_reason</th>
<th>status</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
<td><c:out value="${row.clt_id}"/></td>
<td><c:out value="${row.user_id}"/></td>
<td><c:out value="${row.clt_type}"/></td>
<td><c:out value="${row.block_name}"/></td>
<td><c:out value="${row.loc_no}"/></td>
<td><c:out value="${row.clt_reason}"/></td>
<td><c:out value="${row.clt_status}"/></td>
</tr>
</c:forEach>
</table>
        </center>

           </div>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
              </div>
          </div>
  </div><!-- End Of Right Content -->
            <div id="templatemo_right_content_bottom">
            	Copyright ? 2014 Integral University | <a href="#" target="_parent">cmts</a> by <a title="Mohd nazar mubeen" href="#" target="_parent">Mohd Nazar Mubeen</a>
            </div>
            <p>&nbsp;</p>
</div>
<!-- End Of Content -->
<div> </div><!-- End Of Container -->
	

</html>