/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.93
 * Generated at: 2023-03-21 07:30:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/templates/imports-top.jsp", Long.valueOf(1679373838514L));
    _jspx_dependants.put("/WEB-INF/views/templates/footer/footer.jsp", Long.valueOf(1679208962659L));
    _jspx_dependants.put("/WEB-INF/views/templates/header/header.jsp", Long.valueOf(1679375854987L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>About Us</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<header class=\"header\">\r\n");
      out.write("\t<h1 class=\"logo\">My<span>Website</span></h1>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">About Us</a></li>\r\n");
      out.write("\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\">Contact Us</a></li>\r\n");
      out.write("\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\">Gallery</a></li>\r\n");
      out.write("\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\">Login</a></li>\r\n");
      out.write("\t</ul>\t\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\t<section class=\"aboutus\">\r\n");
      out.write("\t<div class=\"aboutsec\">\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light py-3\">\r\n");
      out.write("  <div class=\"container\"><a href=\"#\" class=\"navbar-brand d-flex align-items-center\"> <i class=\"fa fa-snowflake-o fa-lg text-primary mr-2\"></i><strong>Snowflake</strong></a>\r\n");
      out.write("    <button type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\" class=\"navbar-toggler\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("    <div id=\"navbarSupportedContent\" class=\"collapse navbar-collapse\">\r\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> Home </a></li>\r\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> About </a></li>\r\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> Services </a></li>\r\n");
      out.write("        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link font-italic\"> Contact</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bg-light\">\r\n");
      out.write("  <div class=\"container py-5\">\r\n");
      out.write("    <div class=\"row h-100 align-items-center py-5\">\r\n");
      out.write("      <div class=\"col-lg-6\">\r\n");
      out.write("        <h1 class=\"display-4\">About us page</h1>\r\n");
      out.write("        <p class=\"lead text-muted mb-0\">Create a minimal about us page using Bootstrap 4.</p>\r\n");
      out.write("        <p class=\"lead text-muted\">Snippet by <a href=\"https://bootstrapious.com/snippets\" class=\"text-muted\"> \r\n");
      out.write("                    <u>Bootstrapious</u></a>\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-lg-6 d-none d-lg-block\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/illus.png\" alt=\"\" class=\"img-fluid\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bg-white py-5\">\r\n");
      out.write("  <div class=\"container py-5\">\r\n");
      out.write("    <div class=\"row align-items-center mb-5\">\r\n");
      out.write("      <div class=\"col-lg-6 order-2 order-lg-1\"><i class=\"fa fa-bar-chart fa-2x mb-3 text-primary\"></i>\r\n");
      out.write("        <h2 class=\"font-weight-light\">Lorem ipsum dolor sit amet</h2>\r\n");
      out.write("        <p class=\"font-italic text-muted mb-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><a href=\"#\" class=\"btn btn-light px-5 rounded-pill shadow-sm\">Learn More</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-lg-5 px-5 mx-auto order-1 order-lg-2\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/img-1.jpg\" alt=\"\" class=\"img-fluid mb-4 mb-lg-0\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row align-items-center\">\r\n");
      out.write("      <div class=\"col-lg-5 px-5 mx-auto\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/img-2.jpg\" alt=\"\" class=\"img-fluid mb-4 mb-lg-0\"></div>\r\n");
      out.write("      <div class=\"col-lg-6\"><i class=\"fa fa-leaf fa-2x mb-3 text-primary\"></i>\r\n");
      out.write("        <h2 class=\"font-weight-light\">Lorem ipsum dolor sit amet</h2>\r\n");
      out.write("        <p class=\"font-italic text-muted mb-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><a href=\"#\" class=\"btn btn-light px-5 rounded-pill shadow-sm\">Learn More</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bg-light py-5\">\r\n");
      out.write("  <div class=\"container py-5\">\r\n");
      out.write("    <div class=\"row mb-4\">\r\n");
      out.write("      <div class=\"col-lg-5\">\r\n");
      out.write("        <h2 class=\"display-4 font-weight-light\">Our team</h2>\r\n");
      out.write("        <p class=\"font-italic text-muted\">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row text-center\">\r\n");
      out.write("      <!-- Team item-->\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/avatar-4.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("          <h5 class=\"mb-0\">Nikita Mahajan</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\r\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- End-->\r\n");
      out.write("\r\n");
      out.write("      <!-- Team item-->\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/avatar-3.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("          <h5 class=\"mb-0\">Rahul Chavan</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\r\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- End-->\r\n");
      out.write("\r\n");
      out.write("      <!-- Team item-->\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/avatar-2.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("          <h5 class=\"mb-0\">Vinod Sajgure</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\r\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- End-->\r\n");
      out.write("\r\n");
      out.write("      <!-- Team item-->\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 mb-5\">\r\n");
      out.write("        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://bootstrapious.com/i/snippets/sn-about/avatar-1.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\r\n");
      out.write("          <h5 class=\"mb-0\">Amol Bawane</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\r\n");
      out.write("          <ul class=\"social mb-0 list-inline mt-3\">\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- End-->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"bg-light pb-5\">\r\n");
      out.write("  <div class=\"container text-center\">\r\n");
      out.write("    <p class=\"font-italic text-muted mb-0\">&copy; Copyrights Company.com All rights reserved.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write(" \t</div>\r\n");
      out.write("  </section>\r\n");
      out.write("\t");
      out.write("<footer>\r\n");
      out.write("\t<p>Copyright &copy; 2023 VINOD SAJGURE All Rights Reserved.</p>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/templates/imports-top.jsp(3,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/style.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/templates/header/header.jsp(4,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/templates/header/header.jsp(5,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/aboutus");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/templates/header/header.jsp(6,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/contactus");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/templates/header/header.jsp(7,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/gallery");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/views/templates/header/header.jsp(8,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/login");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }
}
