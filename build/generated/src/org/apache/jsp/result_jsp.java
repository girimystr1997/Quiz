package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import com.mysql.jdbc.Driver;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- header files-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>QuiZ 1.0</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\"> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--HEADER ROW-->\n");
      out.write("        <div id=\"header-row\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!--LOGO-->\n");
      out.write("                    <div class=\"span3\"><h1>Result</h1></div>\n");
      out.write("                    <!-- /LOGO -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /HEADER ROW -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("                    <div class=\"active item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                <div class=\"span6\">\n");
      out.write("\n");
      out.write("                                    <div class=\"carousel-caption\">\n");
      out.write("                                        <p class=\"lead\">\n");
      out.write("                                            <!--jsp code-->\n");
      out.write("                                            ");

                                                String ans1 = request.getParameter("ans1");
                                                String ans2 = request.getParameter("ans2");
                                                String ans3 = request.getParameter("ans3");
                                                String ans4 = request.getParameter("ans4");
                                                String ans5 = request.getParameter("ans5");
                                                String ans6 = request.getParameter("ans6");
                                                    
                                                if(ans1==null||ans2==null||ans3==null||ans4==null||ans5==null||ans6==null){
                                                    ans1=ans2=ans3=ans4=ans5=ans6="null";
                                                }
                                                try {
                                                    out.print("conneted");
                                                    //to be changed
                                                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "");
                                                    Statement state = connect.createStatement();
                                                    if (!connect.isClosed()) {

                                                        String printQuery = "select * from quizanswer;";
                                                        ResultSet viewContent = state.executeQuery(printQuery);
                                                        viewContent.next();

                                                        String ansr1 = viewContent.getString(1);
                                                        String ansr2 = viewContent.getString(2);
                                                        String ansr3 = viewContent.getString(3);
                                                        String ansr4 = viewContent.getString(4);
                                                        String ansr5 = viewContent.getString(5);
                                                        String ansr6 = viewContent.getString(6);


                                                        int a, b, c, d, e, f;
                                                        
                                                            if (ans1.equals(ansr1)) {
                                                                    out.println(ans1);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("correct");
      out.write("<br><br>");

                                                                    a = 1;
                                                                } else {
                                                                    out.println(ans1);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("wrong");
      out.write("<br><br>");

                                                                    a = 0;
                                                                }
                                                            if (ans2.equals(ansr2)) {

                                                                    out.println(ans2);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("correct");
      out.write("<br><br>");

                                                                    b = 1;
                                                                } else {
                                                                    out.println(ans2);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("wrong");
      out.write("<br><br>");

                                                                    b = 0;
                                                                }
                                                            if (ans3.equals(ansr3)) {
                                                                    out.println(ans3);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("correct");
      out.write("<br><br>");

                                                                    c = 1;
                                                                } else {
                                                                    out.println(ans3);
      out.write("&nbsp;");

                                                                    out.println("wrong");
      out.write("<br><br>");

                                                                    c = 0;
                                                                }
                                                            
                                                            if (ans4.equals(ansr4)) {
                                                                    out.println(ans4);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("correct");
      out.write("<br><br>");

                                                                    d = 1;
                                                                } else {
                                                                    out.println(ans4);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("wrong");
      out.write("<br><br>");

                                                                    d = 0;
                                                                }
                                                            if (ans5.equals(ansr5)) {
                                                                    out.println(ans5);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("correct");
      out.write("<br><br>");

                                                                    e = 1;
                                                                } else {
                                                                    out.println(ans5);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("wrong");
      out.write("<br><br>");

                                                                    e = 0;
                                                                }
                                                            if (ans6.equals(ansr6)) {
                                                                    out.println(ans6);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.print("correct");
      out.write("<br><br>");

                                                                    f = 1;
                                                                } else {
                                                                    out.println(ans6);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

                                                                    out.println("wrong");
      out.write("<br><br>");

                                                                    f = 0;
                                                                }

                                            
                                            
      out.write("<h1>your score is ' ");
out.print(a + b + c + d + e + f);
      out.write(" '</h1>");


                                                    }

                                                } catch (Exception e) {
                                                    out.println(e);
                                                }

                                        
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                      <br><br>  \n");
      out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                        <a class=\"btn btn-large btn-primary\" href=\"index.html\">Leave</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                                        <a class=\"btn btn-large btn-primary\" href=\"quiz.html\">PlayAgain</a>\n");
      out.write("                                <div class=\"span6\"> <img src=\"img/slide/slide1.jpg\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("    </body>\n");
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
