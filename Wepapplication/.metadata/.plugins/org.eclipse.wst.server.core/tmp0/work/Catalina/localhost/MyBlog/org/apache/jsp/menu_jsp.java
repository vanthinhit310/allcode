/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2018-04-10 05:41:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Menu</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"img/apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\"\r\n");
      out.write("\thref=\"img/apple-touch-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\"\r\n");
      out.write("\thref=\"img/apple-touch-icon-114x114.png\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"fonts/font-awesome/css/font-awesome.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Stylesheet\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/prettyPhoto.css\">\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato:400,700,900,300'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800,600,300'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/modernizr.custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"font-family: monospace;\">\r\n");
      out.write("\t<div id=\"nav\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-custom\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-target=\".navbar-main-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand page-scroll\" href=\"index.jsp\">THỊNH LÊ</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"collapse navbar-collapse navbar-right navbar-main-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Hidden li included to remove active class from about link when scrolled up past about section -->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hidden\"><a href=\"#page-top\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"page-scroll\" href=\"index.jsp#about\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"page-scroll\" href=\"index.jsp#skills\">Skills</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"page-scroll\" href=\"index.jsp#portfolio\">Lab-Project</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"page-scroll\" href=\"index.jsp#resume\">Resume</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"page-scroll\" href=\"index.jsp#contact\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"btn-lg\"><a class=\"page-scroll\" href=\"index.jsp#login\">Login</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}