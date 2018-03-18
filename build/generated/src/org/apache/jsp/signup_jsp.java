package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Food Hub</title>\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      .navbar{\n");
      out.write("          margin-bottom: 0;\n");
      out.write("          border-radius: 0;\n");
      out.write("      }\n");
      out.write("      .jumbotron{\n");
      out.write("         background-color:lightblue; \n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <div class =\"jumbotron\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <h1>Food Hub</h1>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class =\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class =\"nav nav-tabs\">\n");
      out.write("                        <li ><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                        <li ><a href =\"aboutus.jsp\">ABOUT US</a></li>\n");
      out.write("                        <li ><a href =\"contactus.jsp\">CONTACT US</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> SIGN UP</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> SIGN IN</a></li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("         </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .signup{\n");
      out.write("        text-color: black;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .bg {\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    background-image: url(\"img/fries.jpeg\");\n");
      out.write("\n");
      out.write("    \n");
      out.write("    width: 100%; \n");
      out.write("\n");
      out.write("   \n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body class=\"bg\">\n");
      out.write("   \n");
      out.write("<div class=\"signup\">\n");
      out.write("    <center>\n");
      out.write("<form action=\"signup.do\" method=\"post\">\n");
      out.write("    Name:<input type=\"text\" name=\"customername\"/>\n");
      out.write("    <br><br>\n");
      out.write("    Username:<input type=\"text\" name=\"username\"/>\n");
      out.write("    <br><br>\n");
      out.write("    Address:<input type=\"text\" name=\"address\"/>\n");
      out.write("    <br><br>\n");
      out.write("    Email:<input type=\"text\" name=\"emailid\"/>\n");
      out.write("    <br><br>\n");
      out.write("    Contact No:<input type=\"text\" name=\"contactno\"/>\n");
      out.write("    <br><br>\n");
      out.write("    Birth Date:<input type=\"text\" name=\"birthdate\"/>\n");
      out.write("    <br><br>\n");
      out.write("    Password:<input type=\"text\" name=\"password\"/>\n");
      out.write("    <br><br>\n");
      out.write("    <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("    <br><br>\n");
      out.write("</form></center>\n");
      out.write("</div>\n");
      out.write("</body> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Food Hub</title>\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("      .footer{\n");
      out.write("          \n");
      out.write("    left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   background-color: lightblue;\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("      }\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div class=\"footer\">\n");
      out.write("        <footer class=\"container-fluid\">\n");
      out.write("            <p>Food_hub@copyright.reserved</p>\n");
      out.write("        </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
