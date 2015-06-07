package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>AJAX based CRUD operations using jTable in Servlet and JSP</title>\n");
      out.write("<!-- Include one of jTable styles. -->\n");
      out.write("<link href=\"css/metro/crimson/jtable.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"css/jquery-ui-1.10.3.custom.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!-- Include jTable script file. -->\n");
      out.write("<script src=\"js/jquery-1.8.2.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery-ui-1.10.3.custom.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.jtable.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function () {\n");
      out.write("$('#PersonTableContainer').jtable({\n");
      out.write("title: 'Users Details',\n");
      out.write("actions: {\n");
      out.write("listAction: 'UserdetailsController?action=list',\n");
      out.write("createAction:'UserdetailsController?action=create',\n");
      out.write("updateAction: 'UserdetailsController?action=update',\n");
      out.write("deleteAction: 'UserdetailsController?action=delete'\n");
      out.write("},\n");
      out.write("fields: {\n");
      out.write("    id: {\n");
      out.write("title: 'id',\n");
      out.write("width: '30%',\n");
      out.write("edit: true\n");
      out.write("},\n");
      out.write("uname: {\n");
      out.write("title:'user name',\n");
      out.write("key: true,list: true,\n");
      out.write("create:true\n");
      out.write("},\n");
      out.write("dob: {\n");
      out.write("title: 'dob',\n");
      out.write("width: '20%',\n");
      out.write("edit:false\n");
      out.write("},\n");
      out.write("des: {\n");
      out.write("title: 'designation',\n");
      out.write("width: '30%',\n");
      out.write("edit:true\n");
      out.write("},\n");
      out.write("cont: {\n");
      out.write("title: 'contact',\n");
      out.write("width: '20%',\n");
      out.write("edit: true\n");
      out.write("},\n");
      out.write("\n");
      out.write("pass: {\n");
      out.write("title: 'pass',\n");
      out.write("width: '30%',\n");
      out.write("edit: true\n");
      out.write("}\n");
      out.write("}\n");
      out.write("});\n");
      out.write("$('#PersonTableContainer').jtable('load');\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"width:60%;margin-right:20%;margin-left:20%;text-align:center;\">\n");
      out.write("    HELLO\n");
      out.write("<div id=\"PersonTableContainer\"></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
