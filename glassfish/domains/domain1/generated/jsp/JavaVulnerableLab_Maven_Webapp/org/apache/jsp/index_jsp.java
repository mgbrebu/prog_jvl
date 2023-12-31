package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.File;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(' ');
      out.write(" \n");
      out.write("\n");
      out.write("\n");

   String path = request.getContextPath();
   String configPath=getServletContext().getRealPath("/WEB-INF/config.properties");
   
    Properties properties=new Properties();
    properties.load(new FileInputStream(configPath));
    String siteTitle=properties.getProperty("siteTitle");
     
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("\t<title>");
      out.print(siteTitle);
      out.write("</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/style.css\" type=\"text/css\" charset=\"utf-8\" />\n");
      out.write("           ");
 out.print("<script src=\""+path+"/jquery.min.js\" type=\"text/javascript\"></script>"); 
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"container\" >\n");
      out.write("\n");
      out.write("     <div id=\"Menu\">\n");
      out.write("\t\t<ul id=\"menu-bar\" style=\"margin-left: auto ;  margin-right: auto ;\" >\n");
      out.write("\t\t\t<li class=\"current\"><a href=\"");
      out.print(path);
      out.write("\">Home</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li><a href=\"#\">Vulnerability</a>\n");
      out.write("\t\t\t\t<ul><li><a href=\"#\">A1- Injection</a>\n");
      out.write("\t\t\t\t\t<ul><li><a href=\"#\">SQL Injection</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/forumposts.jsp?postid=1\">Sql Injection 1</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"");
      out.print(path);
      out.write("/login.jsp\">Authentication Bypass</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/sqli/download.jsp\">Blind SQLi 1</a></li>\n");
      out.write("                                                   <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/sqli/union2.jsp\">Union 2</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                                <li><a href=\"#\">XPath Injection</a>\n");
      out.write("                                                 <ul>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/Injection/xpath_login.jsp\">Login Bypass</a></li>\n");
      out.write("                                                 </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                                  <li><a href=\"#\">XML Injection</a>\n");
      out.write("                                                 <ul>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/Injection/xxe.jsp\">External Entity</a></li>\n");
      out.write("                                                  <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/Injection/xslt.jsp?style=1.xsl\">XSLT Injection</a></li>\n");
      out.write("                                                 \n");
      out.write("                                                 </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                           <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/Injection/orm.jsp?id=1\">ORM Injection</a></li>\n");
      out.write("                                                 \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("                                     </li>\n");
      out.write("                                   \n");
      out.write("                                    <li><a href=\"#\">A2- Broken Authentication & Session Management</a>\n");
      out.write("                                       <ul>\n");
      out.write("                                           <li><a href=\"");
      out.print(path);
      out.write("/ForgotPassword.jsp\">UserName Enumeration</a></li>\n");
      out.write("                                           <li><a href=\"");
      out.print(path);
      out.write("/login.jsp\">Brute Foce Login Page</a></li>\n");
      out.write("                                           <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/baasm/URLRewriting.jsp;jsessionid=");
      out.print(session.getId());
      out.write("\">Session ID in URL</a></li>\n");
      out.write("                                           <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/baasm/SiteTitle.jsp\">Improper Authentication: Privilege Escalation</a></li>\n");
      out.write("                                       \n");
      out.write("                                       </ul>\n");
      out.write("                                     </li>\n");
      out.write("                                        \n");
      out.write("\t\t\t   \t       <li><a href=\"#\">A3- XSS</a>\n");
      out.write("\t\t\t\t             <ul>\n");
      out.write("\t\t\t\t\t       <li><a href=\"#\">Reflected(GET)</a>\n");
      out.write("\t\t\t\t\t \t <ul>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"");
      out.print(path);
      out.write("/vulnerability/xss/search.jsp\">Challenge 1</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"");
      out.print(path);
      out.write("/vulnerability/xss/xss2.jsp\">Challenge 2</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"");
      out.print(path);
      out.write("/vulnerability/xss/xss3.jsp\">Challenge 3</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"");
      out.print(path);
      out.write("/vulnerability/xss/xss4.jsp\">Challenge 4</a></li>\n");
      out.write("\t\t\t\t\t       \t </ul>\n");
      out.write("\t\t\t\t\t       </li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t       <li><a href=\"#\">Flash Based</a>\n");
      out.write("\t\t\t\t\t\t <ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/xss/flash/xss1.swf?vuln=");
      out.print(path);
      out.write("\">Challenge 1</a></li>\n");
      out.write("\t\t\t\t\t\t \t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/xss/flash/exss.jsp\">Challenge 2</a></li>\n");
      out.write("\t\t\t\t\t\t </ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/forum.jsp\">Stored XSS(Persistent)</a></li>\n");
      out.write("\t\t\t\t  \t    </ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">A4-Insecure Direct Object References</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <li><a href=\"");
      out.print(path);
      out.write("/myprofile.jsp?id=");
 if(session.getAttribute("userid")!=null){ out.print(session.getAttribute("userid"));} 
      out.write("\" title=\"Make sure you have logged in \">Viewing Details</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/idor/change-email.jsp\" title=\"Make sure you have logged in \">Modifying email ID</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/idor/download.jsp\">Download Document</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">A5-Security Misconfiguration</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/install.jsp\">Setup Page not removed</a></li>\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/admin/\">Default Admin Credentials not changed</a></li>\n");
      out.write("                                                        <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/securitymisconfig/pages.jsp?id=1\">Error Handling</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li><a href=\"#\">A6-Sensitive Data Exposure</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/changeCardDetails.jsp\">Cleartext Transmission of Sensitive Information</a></li>\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/ForgotPassword.jsp\">Storing Login Credentials in Plain Text</a></li>\t\n");
      out.write("                                                        <li><a href=\"");
      out.print(path);
      out.write("/login.jsp\">Storing Login Credentials in Plain Text in a cookie</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/sde/hash.jsp\">Hashed Credentials</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li><a href=\"#\">A7- Missing Function Level Access Control</a>\n");
      out.write("\t\t\t\t\t\t<ul>                \n");
      out.write("                                                    <li> <a href=\"");
      out.print(path);
      out.write("/admin/\" title=\"Hint: Forced Browsing\">Challenge 1:Bypass Admin Login</a></li>\n");
      out.write("                                                    <li> <a href=\"");
      out.print(path);
      out.write("/admin/AddPage.jsp\"> Challenge 2: Add Page</a></li>\n");
      out.write("                                                    <li> <a href=\"");
      out.print(path);
      out.write("/admin/Configure.jsp\"> Configure</a></li>\n");
      out.write("                                                     <li> <a href=\"");
      out.print(path);
      out.write("/vulnerability/mfac/SearchEngines.jsp\"> Crawlers</a></li>                                             \n");
      out.write("                                                </ul>\n");
      out.write("                                        </li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">A8- CSRF</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <li><a href=\"");
      out.print(path);
      out.write("/vulnerability/csrf/change-info.jsp\">CSRF 1(GET): Change Info</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/csrf/changepassword.jsp\">CSRF 2(POST): Change Password</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li><a href=\"#\">A9- Using components with known vulnerabilities</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <li><a href=\"/VulnerableSpring/error.htm?msg=error.c403\">Web Application using Spring Framework</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">A10. Unvalidated Redirect & Forward..</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/unvalidated/OpenURL.jsp\">Open Redirect</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/unvalidated/OpenForward.jsp\">Open Forward</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t</ul></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/vulnerability/forum.jsp\">Forum</a></li>\n");
      out.write("\t\t\t\t");
 
                                if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("1"))
                                {
                                    if(session.getAttribute("privilege")!=null && session.getAttribute("privilege").equals("admin"))
                                    {
                                       out.print("<li><a href='"+path+"/admin/admin.jsp'>Admin Panel</a></li>"); 
                                    }
                                    out.print("<li><a href='"+path+"/myprofile.jsp?id="+session.getAttribute("userid")+"'>My Profile</a></li>");
                                     out.print("<li><a href='"+path+"/Logout'>Logout</a></li>");
                                }
                                else
                                {
                                   out.print("<li><a href='"+path+"/login.jsp'>LogIn</a></li>");
                                    out.print("<li><a href='"+path+"/Register.jsp'>Register</a></li>");
                                }
                                
      out.write("\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(path);
      out.write("/contact.jsp\">Contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"Main-Container\">\n");
      out.write("\t<br/>\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\n");
      out.write("<h1>");
      out.print(siteTitle);
      out.write("</h1>\n");
      out.write("</div>\n");
      out.write("<br/>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"Main\">\n");
      out.write("\t\t");
      out.write("\n");
      out.write(" \n");
      out.write(" ");

 if(session.getAttribute("user")!=null)
{
    out.print("Hello "+session.getAttribute("user")+",");
}
 
      out.write("\n");
      out.write(" Welcome to Java Vulnerable Lab !<br/><br/>\n");
      out.write(" A Deliberately vulnerable Web Application built on JAVA designed to teach Web Application Security. \n");
      out.write("  ");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("\t<center>\t<p>Copyrights &copy; <b><a href=\"http://www.cysecurity.org\">Cyber Security & Privacy Foundation </a> </p></b></center>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\n");
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
