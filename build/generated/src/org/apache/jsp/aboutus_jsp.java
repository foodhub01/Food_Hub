package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Page content -->\r\n");
      out.write("<div class=\"w3-content\" style=\"max-width:1100px\">\r\n");
      out.write("\r\n");
      out.write("<!-- About Section -->\r\n");
      out.write("  <div class=\"w3-row w3-padding-64\" id=\"aboutus\">\r\n");
      out.write("    <div class=\"w3-col m6 w3-padding-large w3-hide-small\">\r\n");
      out.write("     <img src=\"img/about.jpg\" class=\"w3-round w3-image w3-opacity-min\" alt=\"about us img\" width=\"900\" height=\"900\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"w3-col m6 w3-padding-large\">\r\n");
      out.write("      <h1 class=\"w3-center\">About FoodHub</h1><br>\r\n");
      out.write("      <h5 class=\"w3-center\">Tradition since 2010</h5>\r\n");
      out.write("      <p class=\"w3-large\">Food Hub services came into existence as an innovative approach by two IIT graduate students, Tina and James,\r\n");
      out.write("      in 2010. The restaurant offers a sophisticated yet totally ethnic experience where the display kitchen is part of the restaurant. In Food Hub, while dining, guests\r\n");
      out.write("      are given checked aprons and are encouraged to eat with their hands to experience the food through all their senses.</p>\r\n");
      out.write("      <p class=\"w3-large\">In 2011,Tine and James decided to expand their  business across the country. </p>\r\n");
      out.write("      <p class=\"w3-large\">At present, Food Hub restaurants has their branches across the country and became a well-known brand in\r\n");
      out.write("      Indian cuisine restaurants.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("   color: white;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("      }\r\n");
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
