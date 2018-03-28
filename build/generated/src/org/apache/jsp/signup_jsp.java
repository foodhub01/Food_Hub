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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title> Food Hub</title>\r\n");
      out.write("       <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("      .navbar{\r\n");
      out.write("          margin-bottom: 0;\r\n");
      out.write("          border-radius: 0;\r\n");
      out.write("      }\r\n");
      out.write("      .jumbotron{\r\n");
      out.write("         background-color:lightblue; \r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("        <div class =\"jumbotron\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <h1>Food Hub</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class =\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("                    <ul class =\"nav nav-tabs\">\r\n");
      out.write("                        <li ><a href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("                        <li ><a href =\"aboutus.jsp\">ABOUT US</a></li>\r\n");
      out.write("                        <li ><a href =\"contactus.jsp\">CONTACT US</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> SIGN UP</a></li>\r\n");
      out.write("                        <li><a href=\"signin.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> SIGN IN</a></li>\r\n");
      out.write("                        <h2><li>Welcome ");
out.println(session.getAttribute("loginid")); 
      out.write("</li></h2>\r\n");
      out.write("                    </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("         </header>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write(" <link href=\"style01.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/bootstrap-grid.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\">\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .login-bg{ background-image:linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.7)),url(img/homebg.jpg);\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    background-attachment: fixed;}\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("  .modal-header, h4, .close {\r\n");
      out.write("      background-color: lightseagreen;\r\n");
      out.write("      color:black !important;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      font-size: 50px;\r\n");
      out.write("  }\r\n");
      out.write("  .modal-footer {\r\n");
      out.write("      background-color: #f9f9f9;\r\n");
      out.write("  }\r\n");
      out.write("  .modal-body{\r\n");
      out.write("    width: 320px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 5px;\r\n");
      out.write("    margin: 0; \r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg\">\r\n");
      out.write("<center>\r\n");
      out.write("     <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\" style=\"padding:20px 20px;\">\r\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-user\"></span> REGISTER </h4>\r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("           <div class=\"modal-body\" style=\"padding:10px 50px;\">\r\n");
      out.write("               \r\n");
      out.write("<form action=\"signup.do\" method=\"post\">\r\n");
      out.write("    Name:<input class=\"form-control\" type=\"text\" placeholder=\"FullName\" name=\"customername\" required/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Username:<input class=\"form-control\" type=\"text\" placeholder=\"UserName\" name=\"username\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Address:<input class=\"form-control\" type=\"text\" placeholder=\"Full address\" name=\"address\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Email:<input class=\"form-control\" type=\"text\"placeholder=\"Email\" name=\"emailid\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Contact No:<input class=\"form-control\" type=\"text\" placeholder=\"Contact info\" name=\"contactno\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Birth Date:<input class=\"form-control\" type=\"text\" placeholder=\"YYYY/MM/DD\" name=\"birthdate\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Password:<input class=\"form-control\" type=\"password\" placeholder=\"Password\" name=\"password\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    <input type=\"submit\" value=\"Submit\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("     </div>\r\n");
      out.write("</body></center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title> Food Hub</title>\r\n");
      out.write("       <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("\r\n");
      out.write("      .footer{\r\n");
      out.write("          \r\n");
      out.write("    left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   background-color: lightblue;\r\n");
      out.write("   color: black;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("     \r\n");
      out.write("  </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("          <div class=\"footer\">\r\n");
      out.write("        <footer class=\"container-fluid\">\r\n");
      out.write("            <p>Food_hub@copyright.reserved</p>\r\n");
      out.write("        </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
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
