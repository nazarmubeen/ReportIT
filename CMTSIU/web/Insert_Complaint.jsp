<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Insert_Complaint.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
function clearText(field){

    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;

}
</script>
<script language="javascript" type="text/javascript">  

      var xmlHttp  
      var xmlHttp
      function showBlock(str){

      if (typeof XMLHttpRequest != "undefined"){

      xmlHttp= new XMLHttpRequest();

      }
      else if (window.ActiveXObject){

      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");

      }
      if (xmlHttp==null){

      alert("Browser does not support XMLHTTP Request")

      return;
      } 

      var url="block.jsp";

      url +="?count=" +str;

      xmlHttp.onreadystatechange = stateChange;

      xmlHttp.open("GET", url, true);

      xmlHttp.send(null);

      }

      function stateChange(){   

      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   

      document.getElementById("block").innerHTML=xmlHttp.responseText   

      }   
      }

      function showRoom(str){

      if (typeof XMLHttpRequest != "undefined"){

        xmlHttp= new XMLHttpRequest();

        }
      else if (window.ActiveXObject){
        xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");

        }
      if (xmlHttp==null){

      alert("Browser does not support XMLHTTP Request")

      return;
      } 

      var url="room.jsp";

      url +="?count=" +str;

      xmlHttp.onreadystatechange = stateChange1;

      xmlHttp.open("GET", url, true);

      xmlHttp.send(null);

      }
      function stateChange1(){   

      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   

      document.getElementById("room").innerHTML=xmlHttp.responseText   

      }   
      }
      </script>  
      <% int cid=0, k;
Class.forName("com.mysql.jdbc.Driver").newInstance();  

 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/cmts","root","prad");  

 Statement stmt1 = con1.createStatement();  

 ResultSet rs1 = stmt1.executeQuery("Select * from complaint");

 while(rs1.next()){

     
      cid=rs1.getInt(1); 
}
 %>
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
					  <li><a href="Complaint_Status.jsp" target="_parent">Check  Complaint status </a></li>
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
                    	Insert Complaint </div>
                    <br><%k=cid+1; %>
		<center>
			  <form method=get action="User_Register.jsp">
			<table><tr><th colspan=2></th></tr>
		 <tr><td>Complaint_Id:</td><td><%=k %></td></tr>
		<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr> 
		<tr><td>Department:</td><td>  <select name='department' onchange="showBlock(this.value)">  
<option value="none">(please select:)</option>
 <%
 Class.forName("com.mysql.jdbc.Driver").newInstance();  

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/cmts","root","prad");  

 Statement stmt = con.createStatement();  

 ResultSet rs = stmt.executeQuery("Select * from department");

 while(rs.next()){

     %>
      <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>  

      <%
 }
     %>
</select></td></tr>
		<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>
		
		
		<tr><td>Block:</td><td>  <div id='block'>  

      <select name='block' >  

      <option value='-1'>(please select:)</option>  

      </select>  
      </div>  </td></tr>
		<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>
		
		
		<tr><td>Room_No.:</td><td>  <div id='room'>  

      <select name='room' >  

      <option value='-1'>(please select:)</option>  

      </select>  
      </div></td></tr>
		<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>
		<tr><td>Complaint_type:</td><td>  <select name="Events">  
			  <option value="0" selected>(please select:)</option>  
			  <option value="1">A</option>  
			  <option value="200M Run">B</option>  
			  <option value="400M Run">C</option>  
			  <option value="800M Run">D</option>  
			  </select></td></tr>
		<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>
		 <tr><td>Detail:</td><td> <textarea name ="textarea1" rows="5" cols="50" ></textarea></td></tr>
		<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>
		<tr><td><input type="Submit" value=Submit>     
		
		
		
		</table>
               
			
</form>
		

			</center>
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
    <!-- End Of Container -->
	

</html>