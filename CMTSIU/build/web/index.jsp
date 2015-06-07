<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
     <base href="<%=basePath%>">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CMTS Integral University</title>
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
<style type="text/css">
<!--
.style4 {font-size: 18px; color: #00FF00; }
.style5 {color: #EFEFEF}
-->
</style>
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
						<li><a href="#" target="_parent" class="current">Home</a></li>
						<li><a href="#" target="_parent">About CMTS </a></li>
					    <li><a href="#" target="_parent">Services</a></li>	
					  <li><a href="#">Contact Us</a></li>
					</ul>
                </div>

			<div class="templatemo_section_bottom_line"></div>
            <div class="templatemo_section">
            	<div class="templatemo_icon_home">
					<h1>OUR COMPANY PROFILE</h1>
                    <p>
                    	Maecenas aliquam, ligula id egestas suscipit, nisi sapien dignissim nibh, ac vestibulum lorem urna in neque. 
                    </p>

                </div>
			</div>
            <div class="templatemo_section_bottom_line"></div>
            <div class="templatemo_section">
            	<div class="templatemo_icon_cube">
              		<h1>OUR WORKING STRUCTURE</h1>
                    <p>
                    	Donec eget nulla et dui auctor adipiscing. Nulla vitae erat. Praesent vehicula risus vitae massa. Aenean dui.
                    </p>
                </div>
			</div>
            <div class="templatemo_section_bottom_line"></div>
            
            <div class="templatemo_section">
            	<div class="templatemo_icon_tick">
                	<h1>COMPANY FUTURE PLAN</h1>
                    <p>
                    	Nam lectus. Nulla facilisi. Mauris consectetur. Fusce luctus neque id quam. Phasellus in ante. Suspendisse metus. 
                    </p>
                </div>
			</div>
            <div class="templatemo_section_bottom_line"></div>
            

            </div><!-- End Of left Content -->
            <div id="templatemo_right_content">
				<div id="templatemo_content_area">
                	<div class="templatemo_title">
                    	WELCOME TO CMTS INTERFACE </div>
                    
                 
                    <p>&nbsp;          </p>
					<div>
                                            <form  method=get action="Logindb.jsp">
                     <table width="368" border="1" bgcolor="white">
                         
                        <tr>
                          <td width="166" class="templatemo_title">Client Login </td>
                          <td width="186">&nbsp;</td>
                        </tr>
                        <tr>
                          <td height="37" class="button">
                          <label><span class="templatemo_title">Usertype</span></label>
                          <span class="templatemo_title">&nbsp;:</span></td>
                          <td> 
                            
                              <select name="Events" class="textfield">
                                   <option value="0" selected>Please select</option>
                                <option value="1">Admin</option>
                                <option value="2">User</option>
                                <option value="3">Mainainance Engineer</option>
                              </select>
                          
                                                  </td>
                        </tr>
                        <tr>
                          <td class="button">
                            <label><span class="templatemo_title">ID</span></label>
                            <span class="templatemo_title">&nbsp;:
                            <label></label>
                            </span></td>
                          <td>
                            
                              <input name="id"  type="text" onfocus="clearText(this)" onblur="clearText(this)" class="textfield" />
                            
                                                   </td>
                        </tr>
                        <tr>
                          <td class="button">
                          <label><span class="templatemo_title">Password</span></label>
                          <span class="templatemo_title">&nbsp;:</span></td>
                          <td><input name="pass"  type="password" onfocus="clearText(this)" onblur="clearText(this)" class="textfield"/> &nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td>
                            
                              <input  type="submit" class="button" id="Login" value="Login" />
                           
                          
                          </td>
                          
                        </tr>
                      </table>
                                                </form>
				  </div>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
                      <p>&nbsp;</p>
				</div>
            </div><!-- End Of Right Content -->
            <div id="templatemo_right_content_bottom">
            	Copyright © 2014 Integral University | <a href="#" target="_parent">cmts</a> by <a title="free css templates" href="#" target="_parent">Mohd Nazar Mubeen</a>
            </div>
        </div><!-- End Of Content -->
    </div><!-- End Of Container -->
	

</html>