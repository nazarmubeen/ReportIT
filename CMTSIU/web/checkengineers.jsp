<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Business Solution Template, Free Web Template, Website Layout</title>
<meta name="keywords" content="free css templates, web templates, Business Solution, XHTML, CSS" />
<meta name="description" content="Business Solution Template - Free Web Template, HTML CSS Layout, Free Download" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<link href="css/metro/crimson/jtable.css" rel="stylesheet" type="text/css" />
<link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" type="text/css" />
<!-- Include jTable script file. -->
<script src="js/jquery-1.8.2.js" type="text/javascript"></script>
<script src="js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
<script src="js/jquery.jtable.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
$('#PersonTableContainer').jtable({
title: 'MaintainanceController',
actions: {
listAction: 'MaintainanceController?action=list',
createAction:'MaintainanceController?action=create',
updateAction: 'MaintainanceController?action=update',
deleteAction: 'MaintainanceController?action=delete'
},
fields: {
    id: {
title: 'id',
width: '30%',
edit: true
},
pass: {
title:'pass',
key: true,list: true,
create:true
},
work_type: {
title: 'work_type',
width: '20%',
edit:false
}
}
});
$('#PersonTableContainer').jtable('load');
});
</script>
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
					  <li><a href="#" target="_parent" class="current">Home</a></li>
					  <li><a href="Check_Complaints.jsp" target="_parent">Check Complaints </a></li>
				      <li><a href="checkusers.jsp" target="_parent">Check users </a></li>	
				      <li><a href="#">Check Engineers</a></li>
					   
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
                    	WELCOME TO ADMIN INTERFACE </div>
<div style="width:60%;margin-right:20%;margin-left:20%;text-align:center;">
    HELLO
<div id="PersonTableContainer"></div>
                 
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
    </div><!-- End Of Container -->
	

</html>