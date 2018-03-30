package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Food Hub</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"style01.css\" rel=\"stylesheet\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <h1>FoodHub</h1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <ul class=\"main-nav\">\n");
      out.write("                    <li><a href=\"\">HOME</a></li>\n");
      out.write("                    <li><a href=\"aboutus.jsp\">ABOUT US</a></li>\n");
      out.write("                    <li><a href=\"contactus.jsp\">CONTACT US</a></li>\n");
      out.write("                    <li><a href=\"signup.jsp\">SIGN UP</a></li>\n");
      out.write("                    <li><a href=\"signin.jsp\">SIGN IN</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("            <div class=\"slogan\">\n");
      out.write("                <h1>SAY HELLO...!<br>TO SUPER HEALTHY MEALS</h1>\n");
      out.write("                <div class=\"quick_button\">\n");
      out.write("                    <a href=\"quicksearch.jsp\" class=\"btn btn-half\">Quick search</a>\n");
      out.write("                    <a href=\"#cities\" class=\"btn btn-full\">Search Branches</a>\n");
      out.write("                </div>  \n");
      out.write("            </div></div>\n");
      out.write("        </header>\n");
      out.write("        <section class=\"cities\" id=\"cities\">\n");
      out.write("            <h2>WE ARE CURRENTLY IN THESE CITIES</h2>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <img src=\"img/mumbai.jpg\">\n");
      out.write("                        <h4>MUMBAI</h4>\n");
      out.write("                        <p><span>1000+ Happy customer</span></p>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <img src=\"img/Kolkata.jpg\">\n");
      out.write("                        <h4>KOLKATA</h4>\n");
      out.write("                        <p><span>1000+ Happy customer</span></p>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <img src=\"img/bangalore.jpg\">\n");
      out.write("                        <h4>BANGALORE</h4>\n");
      out.write("                        <p><span>1000+ Happy customer</span></p>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <img src=\"img/delhi.jpg\">\n");
      out.write("                        <h4>DELHI</h4>\n");
      out.write("                        <p><span>1000+ Happy customer</span></p>\n");
      out.write("                </div>\n");
      out.write("            </div></section>\n");
      out.write("       \n");
      out.write("           </body>\n");
      out.write("</html>\n");
      out.write("           \n");
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
