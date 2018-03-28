package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  .modal-header, h4, .close {\r\n");
      out.write("      background-color: lightseagreen;\r\n");
      out.write("      color:black !important;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      font-size: 50px;\r\n");
      out.write("  }\r\n");
      out.write("  .modal-footer {\r\n");
      out.write("      background-color: #f9f9f9;\r\n");
      out.write("  }\r\n");
      out.write("  .modal-content{\r\n");
      out.write("    width: 320px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 1px solid lightcyan;\r\n");
      out.write("    margin: 0 auto; \r\n");
      out.write("}\r\n");
      out.write(".input{\r\n");
      out.write("    display: block; margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg\">\r\n");
      out.write("\r\n");
      out.write("     <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-user\"></span> Log In</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("           <div class=\"modal-body\">\r\n");
      out.write("               \r\n");
      out.write("<form action=\"signin.do\" method=\"post\">\r\n");
      out.write("     Username:<input class=\"form-control\" type=\"text\" placeholder=\"UserName\" name=\"username\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("    Password:<input class=\"form-control\" type=\"password\" placeholder=\"Password\" name=\"password\"/>\r\n");
      out.write("    <br><center>\r\n");
      out.write("        <input type=\"submit\" value=\"Login\" style=\"background-color: lightseagreen\"; height=\"10px\"; width=\"20px\"; size=\"50px\"/></center>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("     </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
