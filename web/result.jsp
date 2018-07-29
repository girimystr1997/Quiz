<!-- header files-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.io.*" %>
<%@page import = "java.sql.*" %>
<%@page import = "java.sql.Connection"%> 
<%@page import = "com.mysql.jdbc.Driver"%> 


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>QuiZ 1.0</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Bootstrap -->
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap-responsive.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet"> 
        <script src="js/bootstrap.min.js"></script>


    </head>
    <body>
        <!--HEADER ROW-->
        <div id="header-row">
            <div class="container">
                <div class="row">
                    <!--LOGO-->
                    <div class="span3"><h1>Result</h1></div>
                    <!-- /LOGO -->
                </div>
            </div>
        </div>
        <!-- /HEADER ROW -->


        <div class="container">

            <div id="myCarousel" class="carousel slide">
                <div class="carousel-inner">

                    <div class="active item">
                        <div class="container">
                            <div class="row">

                                <div class="span6">

                                    <div class="carousel-caption">
                                        <p class="lead">
                                            <!--jsp code-->
                                            <%
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
                                                   //to be changed
                                                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "");
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
                                                                    out.println(ans1);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("correct");%><br><br><%
                                                                    a = 1;
                                                                } else {
                                                                    out.println(ans1);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("wrong");%><br><br><%
                                                                    a = 0;
                                                                }
                                                            if (ans2.equals(ansr2)) {

                                                                    out.println(ans2);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("correct");%><br><br><%
                                                                    b = 1;
                                                                } else {
                                                                    out.println(ans2);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("wrong");%><br><br><%
                                                                    b = 0;
                                                                }
                                                            if (ans3.equals(ansr3)) {
                                                                    out.println(ans3);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("correct");%><br><br><%
                                                                    c = 1;
                                                                } else {
                                                                    out.println(ans3);%>&nbsp;<%
                                                                    out.println("wrong");%><br><br><%
                                                                    c = 0;
                                                                }
                                                            
                                                            if (ans4.equals(ansr4)) {
                                                                    out.println(ans4);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("correct");%><br><br><%
                                                                    d = 1;
                                                                } else {
                                                                    out.println(ans4);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("wrong");%><br><br><%
                                                                    d = 0;
                                                                }
                                                            if (ans5.equals(ansr5)) {
                                                                    out.println(ans5);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("correct");%><br><br><%
                                                                    e = 1;
                                                                } else {
                                                                    out.println(ans5);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("wrong");%><br><br><%
                                                                    e = 0;
                                                                }
                                                            if (ans6.equals(ansr6)) {
                                                                    out.println(ans6);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.print("correct");%><br><br><%
                                                                    f = 1;
                                                                } else {
                                                                    out.println(ans6);%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                                    out.println("wrong");%><br><br><%
                                                                    f = 0;
                                                                }

                                            
                                            %><h1>your score is ' <%out.print(a + b + c + d + e + f);%> '</h1><%

                                                    }

                                                } catch (Exception e) {
                                                    out.println(e);
                                                }

                                        %>
                                        </p>
                                    </div>

                                </div>
                                      <br><br>  
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <a class="btn btn-large btn-primary" href="index.html">Leave</a>&nbsp;&nbsp;&nbsp;
                                        <a class="btn btn-large btn-primary" href="quiz.html">PlayAgain</a>
                                <div class="span6"> <img src="img/slide/slide1.jpg">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 
    </body>
</html>
