package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Insert_005fComplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'Insert_Complaint.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function clearText(field){\r\n");
      out.write("\r\n");
      out.write("    if (field.defaultValue == field.value) field.value = '';\r\n");
      out.write("    else if (field.value == '') field.value = field.defaultValue;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">  \r\n");
      out.write("\r\n");
      out.write("      var xmlHttp  \r\n");
      out.write("      var xmlHttp\r\n");
      out.write("      function showBlock(str){\r\n");
      out.write("\r\n");
      out.write("      if (typeof XMLHttpRequest != \"undefined\"){\r\n");
      out.write("\r\n");
      out.write("      xmlHttp= new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("      else if (window.ActiveXObject){\r\n");
      out.write("\r\n");
      out.write("      xmlHttp= new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("      if (xmlHttp==null){\r\n");
      out.write("\r\n");
      out.write("      alert(\"Browser does not support XMLHTTP Request\")\r\n");
      out.write("\r\n");
      out.write("      return;\r\n");
      out.write("      } \r\n");
      out.write("\r\n");
      out.write("      var url=\"block.jsp\";\r\n");
      out.write("\r\n");
      out.write("      url +=\"?count=\" +str;\r\n");
      out.write("\r\n");
      out.write("      xmlHttp.onreadystatechange = stateChange;\r\n");
      out.write("\r\n");
      out.write("      xmlHttp.open(\"GET\", url, true);\r\n");
      out.write("\r\n");
      out.write("      xmlHttp.send(null);\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function stateChange(){   \r\n");
      out.write("\r\n");
      out.write("      if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\"){   \r\n");
      out.write("\r\n");
      out.write("      document.getElementById(\"block\").innerHTML=xmlHttp.responseText   \r\n");
      out.write("\r\n");
      out.write("      }   \r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function showRoom(str){\r\n");
      out.write("\r\n");
      out.write("      if (typeof XMLHttpRequest != \"undefined\"){\r\n");
      out.write("\r\n");
      out.write("        xmlHttp= new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("      else if (window.ActiveXObject){\r\n");
      out.write("        xmlHttp= new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("      if (xmlHttp==null){\r\n");
      out.write("\r\n");
      out.write("      alert(\"Browser does not support XMLHTTP Request\")\r\n");
      out.write("\r\n");
      out.write("      return;\r\n");
      out.write("      } \r\n");
      out.write("\r\n");
      out.write("      var url=\"room.jsp\";\r\n");
      out.write("\r\n");
      out.write("      url +=\"?count=\" +str;\r\n");
      out.write("\r\n");
      out.write("      xmlHttp.onreadystatechange = stateChange1;\r\n");
      out.write("\r\n");
      out.write("      xmlHttp.open(\"GET\", url, true);\r\n");
      out.write("\r\n");
      out.write("      xmlHttp.send(null);\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("      function stateChange1(){   \r\n");
      out.write("\r\n");
      out.write("      if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\"){   \r\n");
      out.write("\r\n");
      out.write("      document.getElementById(\"room\").innerHTML=xmlHttp.responseText   \r\n");
      out.write("\r\n");
      out.write("      }   \r\n");
      out.write("      }\r\n");
      out.write("      </script>  \r\n");
      out.write("      ");
 int cid=0, k;
Class.forName("com.mysql.jdbc.Driver").newInstance();  

 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/cmts","root","prad");  

 Statement stmt1 = con1.createStatement();  

 ResultSet rs1 = stmt1.executeQuery("Select * from complaint");

 while(rs1.next()){

     
      cid=rs1.getInt(1); 
}
 
      out.write("\r\n");
      out.write("<!--[if lt IE 7]>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    .templatemo_icon_home { behavior: url(iepngfix.htc); }\r\n");
      out.write("    .templatemo_icon_cube { behavior: url(iepngfix.htc); }\r\n");
      out.write("    .templatemo_icon_tick { behavior: url(iepngfix.htc); }\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--  Free CSS Template designed by TemplateMo.com  -->\r\n");
      out.write("<div id=\"templatemo_container\">\r\n");
      out.write("\t\t<div id=\"templatemo_header\">\r\n");
      out.write("        \t\r\n");
      out.write("        </div><!-- End Of Header -->\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"templatemo_content\">\r\n");
      out.write("        \t<div id=\"templatemo_left_content\">\r\n");
      out.write("           \t  <div class=\"templatemo_menu\">\r\n");
      out.write("               \t  <ul>\r\n");
      out.write("\t\t\t\t\t  <li><a href=\"User_Home.jsp\" target=\"_parent\" class=\"current\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t  <li><a href=\"Complaint_Status.jsp\" target=\"_parent\">Check  Complaint status </a></li>\r\n");
      out.write("\t\t\t\t      <li><a href=\"Insert_Complaint.jsp\" target=\"_parent\">Insert Complaints </a></li>\t\r\n");
      out.write("\t\t\t\t      <li><a href=\"Edit_Profile.jsp\">Edit Profile </a></li>\r\n");
      out.write("\t\t\t\t\t   <li><a href=\"Workschedules.jsp\">Check  Workschedules </a></li>\r\n");
      out.write("\t\t\t      </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t  <div class=\"templatemo_section_bottom_line\"></div>\r\n");
      out.write("            <div class=\"templatemo_section\">\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"templatemo_section_bottom_line\"></div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"templatemo_section_bottom_line\"></div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"templatemo_section_bottom_line\"></div>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            </div><!-- End Of left Content -->\r\n");
      out.write("            <div id=\"templatemo_right_content\">\r\n");
      out.write("\t\t\t\t<div id=\"templatemo_content_area\">\r\n");
      out.write("                \t<div class=\"templatemo_title\">\r\n");
      out.write("                    \tInsert Complaint </div>\r\n");
      out.write("                    <br>");
k=cid+1; 
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t  <form method=get action=\"User_Register.jsp\">\r\n");
      out.write("\t\t\t<table><tr><th colspan=2></th></tr>\r\n");
      out.write("\t\t <tr><td>Complaint_Id:</td><td>");
      out.print(k );
      out.write("</td></tr>\r\n");
      out.write("\t\t<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr> \r\n");
      out.write("\t\t<tr><td>Department:</td><td>  <select name='department' onchange=\"showBlock(this.value)\">  \r\n");
      out.write("<option value=\"none\">(please select:)</option>\r\n");
      out.write(" ");

 Class.forName("com.mysql.jdbc.Driver").newInstance();  

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/cmts","root","prad");  

 Statement stmt = con.createStatement();  

 ResultSet rs = stmt.executeQuery("Select * from department");

 while(rs.next()){

     
      out.write("\r\n");
      out.write("      <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>  \r\n");
      out.write("\r\n");
      out.write("      ");

 }
     
      out.write("\r\n");
      out.write("</select></td></tr>\r\n");
      out.write("\t\t<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr><td>Block:</td><td>  <div id='block'>  \r\n");
      out.write("\r\n");
      out.write("      <select name='block' >  \r\n");
      out.write("\r\n");
      out.write("      <option value='-1'>(please select:)</option>  \r\n");
      out.write("\r\n");
      out.write("      </select>  \r\n");
      out.write("      </div>  </td></tr>\r\n");
      out.write("\t\t<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr><td>Room_No.:</td><td>  <div id='room'>  \r\n");
      out.write("\r\n");
      out.write("      <select name='room' >  \r\n");
      out.write("\r\n");
      out.write("      <option value='-1'>(please select:)</option>  \r\n");
      out.write("\r\n");
      out.write("      </select>  \r\n");
      out.write("      </div></td></tr>\r\n");
      out.write("\t\t<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>\r\n");
      out.write("\t\t<tr><td>Complaint_type:</td><td>  <select name=\"Events\">  \r\n");
      out.write("\t\t\t  <option value=\"0\" selected>(please select:)</option>  \r\n");
      out.write("\t\t\t  <option value=\"1\">A</option>  \r\n");
      out.write("\t\t\t  <option value=\"200M Run\">B</option>  \r\n");
      out.write("\t\t\t  <option value=\"400M Run\">C</option>  \r\n");
      out.write("\t\t\t  <option value=\"800M Run\">D</option>  \r\n");
      out.write("\t\t\t  </select></td></tr>\r\n");
      out.write("\t\t<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>\r\n");
      out.write("\t\t <tr><td>Detail:</td><td> <textarea name =\"textarea1\" rows=\"5\" cols=\"50\" ></textarea></td></tr>\r\n");
      out.write("\t\t<tr>  <td>&nbsp;   </td><td> &nbsp;</td></tr>\r\n");
      out.write("\t\t<tr><td><input type=\"Submit\" value=Submit>     \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("                 \r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("                      <p>&nbsp;</p>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("  </div><!-- End Of Right Content -->\r\n");
      out.write("            <div id=\"templatemo_right_content_bottom\">\r\n");
      out.write("            \tCopyright ? 2014 Integral University | <a href=\"#\" target=\"_parent\">cmts</a> by <a title=\"Mohd nazar mubeen\" href=\"#\" target=\"_parent\">Mohd Nazar Mubeen</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Of Content -->\r\n");
      out.write("    <!-- End Of Container -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
