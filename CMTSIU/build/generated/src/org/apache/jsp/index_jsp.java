package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("     <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>CMTS Integral University</title>\n");
      out.write("<meta name=\"keywords\" content=\"free css templates, web templates, Business Solution, XHTML, CSS\" />\n");
      out.write("<meta name=\"description\" content=\"Business Solution Template - Free Web Template, HTML CSS Layout, Free Download\" />\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("function clearText(field){\n");
      out.write("\n");
      out.write("    if (field.defaultValue == field.value) field.value = '';\n");
      out.write("    else if (field.value == '') field.value = field.defaultValue;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    \n");
      out.write("    .templatemo_icon_home { behavior: url(iepngfix.htc); }\n");
      out.write("    .templatemo_icon_cube { behavior: url(iepngfix.htc); }\n");
      out.write("    .templatemo_icon_tick { behavior: url(iepngfix.htc); }\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("<![endif]-->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style4 {font-size: 18px; color: #00FF00; }\n");
      out.write(".style5 {color: #EFEFEF}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--  Free CSS Template designed by TemplateMo.com  -->\n");
      out.write("\t<div id=\"templatemo_container\">\n");
      out.write("\t\t<div id=\"templatemo_header\">\n");
      out.write("        \t\n");
      out.write("        </div><!-- End Of Header -->\n");
      out.write("        \n");
      out.write("        <div id=\"templatemo_content\">\n");
      out.write("        \t<div id=\"templatemo_left_content\">\n");
      out.write("            \t<div class=\"templatemo_menu\">\n");
      out.write("                \t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" target=\"_parent\" class=\"current\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" target=\"_parent\">About CMTS </a></li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"#\" target=\"_parent\">Services</a></li>\t\n");
      out.write("\t\t\t\t\t  <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"templatemo_section_bottom_line\"></div>\n");
      out.write("            <div class=\"templatemo_section\">\n");
      out.write("            \t<div class=\"templatemo_icon_home\">\n");
      out.write("\t\t\t\t\t<h1>OUR COMPANY PROFILE</h1>\n");
      out.write("                    <p>\n");
      out.write("                    \tMaecenas aliquam, ligula id egestas suscipit, nisi sapien dignissim nibh, ac vestibulum lorem urna in neque. \n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <div class=\"templatemo_section_bottom_line\"></div>\n");
      out.write("            <div class=\"templatemo_section\">\n");
      out.write("            \t<div class=\"templatemo_icon_cube\">\n");
      out.write("              \t\t<h1>OUR WORKING STRUCTURE</h1>\n");
      out.write("                    <p>\n");
      out.write("                    \tDonec eget nulla et dui auctor adipiscing. Nulla vitae erat. Praesent vehicula risus vitae massa. Aenean dui.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <div class=\"templatemo_section_bottom_line\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"templatemo_section\">\n");
      out.write("            \t<div class=\"templatemo_icon_tick\">\n");
      out.write("                \t<h1>COMPANY FUTURE PLAN</h1>\n");
      out.write("                    <p>\n");
      out.write("                    \tNam lectus. Nulla facilisi. Mauris consectetur. Fusce luctus neque id quam. Phasellus in ante. Suspendisse metus. \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <div class=\"templatemo_section_bottom_line\"></div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            </div><!-- End Of left Content -->\n");
      out.write("            <div id=\"templatemo_right_content\">\n");
      out.write("\t\t\t\t<div id=\"templatemo_content_area\">\n");
      out.write("                \t<div class=\"templatemo_title\">\n");
      out.write("                    \tWELCOME TO CMTS INTERFACE </div>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    <p>&nbsp;          </p>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("                                            <form  method=get action=\"Logindb.jsp\">\n");
      out.write("                     <table width=\"368\" border=\"1\" bgcolor=\"white\">\n");
      out.write("                         \n");
      out.write("                        <tr>\n");
      out.write("                          <td width=\"166\" class=\"templatemo_title\">Client Login </td>\n");
      out.write("                          <td width=\"186\">&nbsp;</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td height=\"37\" class=\"button\">\n");
      out.write("                          <label><span class=\"templatemo_title\">Usertype</span></label>\n");
      out.write("                          <span class=\"templatemo_title\">&nbsp;:</span></td>\n");
      out.write("                          <td> \n");
      out.write("                            \n");
      out.write("                              <select name=\"Events\" class=\"textfield\">\n");
      out.write("                                   <option value=\"0\" selected>Please select</option>\n");
      out.write("                                <option value=\"1\">Admin</option>\n");
      out.write("                                <option value=\"2\">User</option>\n");
      out.write("                                <option value=\"3\">Mainainance Engineer</option>\n");
      out.write("                              </select>\n");
      out.write("                          \n");
      out.write("                                                  </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"button\">\n");
      out.write("                            <label><span class=\"templatemo_title\">ID</span></label>\n");
      out.write("                            <span class=\"templatemo_title\">&nbsp;:\n");
      out.write("                            <label></label>\n");
      out.write("                            </span></td>\n");
      out.write("                          <td>\n");
      out.write("                            \n");
      out.write("                              <input name=\"id\"  type=\"text\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"textfield\" />\n");
      out.write("                            \n");
      out.write("                                                   </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"button\">\n");
      out.write("                          <label><span class=\"templatemo_title\">Password</span></label>\n");
      out.write("                          <span class=\"templatemo_title\">&nbsp;:</span></td>\n");
      out.write("                          <td><input name=\"pass\"  type=\"password\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"textfield\"/> &nbsp;</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td>&nbsp;</td>\n");
      out.write("                          <td>&nbsp;</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td>&nbsp;</td>\n");
      out.write("                          <td>\n");
      out.write("                            \n");
      out.write("                              <input  type=\"submit\" class=\"button\" id=\"Login\" value=\"Login\" />\n");
      out.write("                           \n");
      out.write("                          \n");
      out.write("                          </td>\n");
      out.write("                          \n");
      out.write("                        </tr>\n");
      out.write("                      </table>\n");
      out.write("                                                </form>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("                      <p>&nbsp;</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("            </div><!-- End Of Right Content -->\n");
      out.write("            <div id=\"templatemo_right_content_bottom\">\n");
      out.write("            \tCopyright © 2014 Integral University | <a href=\"#\" target=\"_parent\">cmts</a> by <a title=\"free css templates\" href=\"#\" target=\"_parent\">Mohd Nazar Mubeen</a>\n");
      out.write("            </div>\n");
      out.write("        </div><!-- End Of Content -->\n");
      out.write("    </div><!-- End Of Container -->\n");
      out.write("\t\n");
      out.write("\n");
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
