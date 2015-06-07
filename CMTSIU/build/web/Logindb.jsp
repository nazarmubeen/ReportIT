<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Logindb.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%
   try
   {
  
   String id=request.getParameter("id");
   String pass=request.getParameter("pass");
   String event =request.getParameter("Events");  
   
    System.out.println(event);
    
			Class.forName("com.mysql.jdbc.Driver");

	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/cmts","root","prad");

	       Statement st=con.createStatement();
	       if(event.equals("1"))
	       {
   String s="Select * from login  where id='"+id+"' and pass='"+pass+"'";
   ResultSet rs=st.executeQuery(s);
   rs.next();
   if(rs.getRow()>0)
   response.sendRedirect("Home.jsp");
   else
   response.sendRedirect("Error.jsp");
   }
   if(event.equals("2"))
	       {
   String s="Select * from User_details  where id='"+id+"' and pass='"+pass+"'";
   ResultSet rs=st.executeQuery(s);
   rs.next();
   if(rs.getRow()>0)
   response.sendRedirect("User_Home.jsp");
   else
   response.sendRedirect("Error.jsp");
   }
   if(event.equals("3"))
	       {
   String s="Select * from maintainance_engineer  where id='"+id+"' and pass='"+pass+"'";
   ResultSet rs=st.executeQuery(s);
   rs.next();
   if(rs.getRow()>0)
   response.sendRedirect("Maintainance_eng.jsp");
   else
   response.sendRedirect("Error.jsp");
   }
   
   }catch(Exception eee){}
    %>
   
  </body>
</html>
