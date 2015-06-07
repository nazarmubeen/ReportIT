package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Check_005fComplaints_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin</title>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'Check_Engineers.jsp' starting page</title>\r\n");
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
      out.write("<!--[if lt IE 7]>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    .templatemo_icon_home { behavior: url(iepngfix.htc); }\r\n");
      out.write("    .templatemo_icon_cube { behavior: url(iepngfix.htc); }\r\n");
      out.write("    .templatemo_icon_tick { behavior: url(iepngfix.htc); }\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!-- Include one of jTable styles. -->\r\n");
      out.write("<link href=\"css/metro/crimson/jtable.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/jquery-ui-1.10.3.custom.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- Include jTable script file. -->\r\n");
      out.write("<script src=\"js/jquery-1.8.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery-ui-1.10.3.custom.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.jtable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("$('#PersonTableContainer').jtable({\r\n");
      out.write("title: 'Complaint Records',\r\n");
      out.write("actions: {\r\n");
      out.write("listAction: 'ComplaintController?action=list',\r\n");
      out.write("createAction:'ComplaintController?action=create',\r\n");
      out.write("updateAction: 'ComplaintController?action=update',\r\n");
      out.write("deleteAction: 'ComplaintController?action=delete'\r\n");
      out.write("},\r\n");
      out.write("fields: {\r\n");
      out.write("clt_id: {\r\n");
      out.write("title:'clt_id',\r\n");
      out.write("key: true,list: true,\r\n");
      out.write("create:true\r\n");
      out.write("},\r\n");
      out.write("user_id: {\r\n");
      out.write("title: 'user_id',\r\n");
      out.write("width: '20%',\r\n");
      out.write("edit:false\r\n");
      out.write("},\r\n");
      out.write("clt_type: {\r\n");
      out.write("title: 'clt_type',\r\n");
      out.write("width: '30%',\r\n");
      out.write("edit:true\r\n");
      out.write("},\r\n");
      out.write("block_name: {\r\n");
      out.write("title: 'block_name',\r\n");
      out.write("width: '20%',\r\n");
      out.write("edit: true\r\n");
      out.write("},\r\n");
      out.write("dept_name: {\r\n");
      out.write("title: 'dept_name',\r\n");
      out.write("width: '30%',\r\n");
      out.write("edit: true\r\n");
      out.write("},\r\n");
      out.write("loc_no: {\r\n");
      out.write("title: 'loc_no',\r\n");
      out.write("width: '30%',\r\n");
      out.write("edit: true\r\n");
      out.write("},\r\n");
      out.write("clt_reason: {\r\n");
      out.write("title: 'clt_reason',\r\n");
      out.write("width: '40%',\r\n");
      out.write("edit: true\r\n");
      out.write("},\r\n");
      out.write("clt_status: {\r\n");
      out.write("title: 'clt_status',\r\n");
      out.write("width: '30%',\r\n");
      out.write("edit: true\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("});\r\n");
      out.write("$('#PersonTableContainer').jtable('load');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
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
      out.write("\t\t\t\t\t  <li><a href=\"Admin.jsp\" target=\"_parent\" class=\"current\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t  <li><a href=\"Check_Complaints.jsp\" target=\"_parent\">Check Complaints </a></li>\r\n");
      out.write("\t\t\t\t      <li><a href=\"Check_Users.jsp\" target=\"_parent\">Check users </a></li>\t\r\n");
      out.write("\t\t\t\t      <li><a href=\"Check_Engineers.jsp\">Check Engineers</a></li>\r\n");
      out.write("\t\t\t\t\t   <li><a href=\"Check_Workschedules.jsp\">Check Workschedules </a></li>\r\n");
      out.write("\t\t\t       </ul>\r\n");
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
      out.write("                    \t  Complaint Details </div>\r\n");
      out.write("                    \r\n");
      out.write("                                    <div>\r\n");
      out.write("                 <div style=\"width:60%;margin-right:0%;margin-left:0%;text-align:center;\">\r\n");
      out.write("<div id=\"PersonTableContainer\"></div></div>\r\n");
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
      out.write("            \tCopyright   2014 Integral University | <a href=\"#\" target=\"_parent\">cmts</a> by <a title=\"Mohd nazar mubeen\" href=\"#\" target=\"_parent\">Mohd Nazar Mubeen</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Of Content -->\r\n");
      out.write("    <!-- End Of Container -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
