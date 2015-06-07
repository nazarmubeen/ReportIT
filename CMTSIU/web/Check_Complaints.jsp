<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<base href="<%=basePath%>">
    
    <title>My JSP 'Check_Engineers.jsp' starting page</title>
    
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
<!--[if lt IE 7]>
<style type="text/css">
    
    .templatemo_icon_home { behavior: url(iepngfix.htc); }
    .templatemo_icon_cube { behavior: url(iepngfix.htc); }
    .templatemo_icon_tick { behavior: url(iepngfix.htc); }
    
</style>
<![endif]-->
<!-- Include one of jTable styles. -->
<link href="css/metro/crimson/jtable.css" rel="stylesheet" type="text/css" />
<link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" type="text/css" />
<!-- Include jTable script file. -->
<script src="js/jquery-1.8.2.js" type="text/javascript"></script>
<script src="js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
<script src="js/jquery.jtable.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
$('#PersonTableContainer').jtable({
title: '',
actions: {
listAction: 'ComplaintController?action=list',
createAction:'ComplaintController?action=create',
updateAction: 'ComplaintController?action=update',
deleteAction: 'ComplaintController?action=delete'
},
fields: {
clt_id: {
title:'clt_id',
key: true,list: true,
create:true
},
user_id: {
title: 'user_id',
width: '20%',
edit:false
},
clt_type: {
title: 'clt_type',
width: '30%',
edit:true
},
block_name: {
title: 'block_name',
width: '20%',
edit: true
},
dept_name: {
title: 'dept_name',
width: '30%',
edit: true
},
loc_no: {
title: 'loc_no',
width: '30%',
edit: true
},
clt_reason: {
title: 'clt_reason',
width: '40%',
edit: true
},
clt_status: {
title: 'clt_status',
width: '30%',
edit: true
}
}
});
$('#PersonTableContainer').jtable('load');
});
</script>
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
					  <li><a href="Admin.jsp" target="_parent" class="current">Home</a></li>
					  <li><a href="Check_Complaints.jsp" target="_parent">Check Complaints </a></li>
				      <li><a href="checkusers.jsp" target="_parent">Check users </a></li>	
				      <li><a href="checkengineers.jsp">Check Engineers</a></li>
					   
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
                    	  Complaint Details </div>
                    
                                    <div>
                 <div style="width:60%;margin-right:0%;margin-left:0%;text-align:center;">
<div id="PersonTableContainer"></div></div>
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
            	Copyright   2014 Integral University | <a href="#" target="_parent">cmts</a> by <a title="Mohd nazar mubeen" href="#" target="_parent">Mohd Nazar Mubeen</a>
            </div>
            <p>&nbsp;</p>
</div>
<!-- End Of Content -->
    <!-- End Of Container -->
	

</html>
