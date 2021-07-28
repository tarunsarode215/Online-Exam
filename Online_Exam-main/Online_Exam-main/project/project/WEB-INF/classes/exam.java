import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class exam extends HttpServlet
{
    String ans;
	String op1;
	String op2;
	String op3;
	String op4;
	boolean an1(){if(op1.equals(ans))return true;return false;}
	boolean an2(){if(op2.equals(ans))return true;return false;}
	boolean an3(){if(op3.equals(ans))return true;return false;}
	boolean an4(){if(op4.equals(ans))return true;return false;}
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        PrintWriter out = response.getWriter();
		boolean b=true;
        int i=0,k=0,j=0,t=0;
		String s1=request.getParameter("s1");
        String s2=request.getParameter("s2");
        String s3=request.getParameter("s3");
        String s4=request.getParameter("s4");
		String s[]=new String[100];
		out.println("<html>");
        out.println("<head>");
        out.println("<title>"+"Register Page"+"</title>");
        out.println("<title>Question Paper</title><style>table{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 30px;margin-top: 5%;color:black;}button{font-size: 15px;}input{font-size: 30px;}.m{padding: 120px;}div ul li {float: right;display: inline-block;background-color: black;padding: 15px;margin: 5px;}div ul li:hover{float: right;display: inline-block;background-color: gray;padding: 15px;margin: 5px;}body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}</style>");
        out.println("<style>#div1{height: 60px;width: 60px;background-color: #bbb;border-radius:50%;font-size:50px;}#font{padding:7px;}</style>");
        out.println("</head>");
		out.println("<body onLoad='clock12();'><center><div class='m'><div id='div1'><font id='font1'></font></div>");
		out.println("<form action='check'  id='form_id' ><input type='hidden' name='s1' value="+s1+"><input type='hidden' name='s2' value="+s2+"><input type='hidden' name='s3' value="+s3+"><input type='hidden' name='s4' id='s4' value=''><input type='hidden' name='s5' id='s5' value=''><input type='hidden' name='s6' id='s6' value="+s4+"><center><TABLE BORDER=2 cellpadding=50 >");
        try{Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			String db_uname="root";
			String db_upass="root";
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		    Statement st=con.createStatement();
            String q="select * from question where choice='"+s4+"'";
	        ResultSet rs = st.executeQuery(q);
				   while(rs.next())
				   {					   
                   for(i=2;i<=7;i++,k++)
				   {
				    s[k]=rs.getString(i);
				   }
				   }
				   try{String db_url1="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			           String db_uname1="root";
			           String db_upass1="root";
			           Connection con1=DriverManager.getConnection(db_url1,db_uname1,db_upass1);
		               Statement st1=con1.createStatement();
		               String q1="select * from register where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
	                   ResultSet rs1 = st1.executeQuery(q1);
	                   rs1.next();
				       String g=rs1.getString(13);
				       String g1=rs1.getString(11);
					   i=Integer.parseInt(g);
					   j=Integer.parseInt(g1);
					   if(i>=k)
					   {
						   try{String db_url3="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			                  String db_uname3="root";
			                  String db_upass3="root";
							  Connection con3=DriverManager.getConnection(db_url3,db_uname3,db_upass3);
							  Statement st3=con3.createStatement();
							  String q3="UPDATE register SET i='"+0+"' where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
							  st3.executeUpdate(q3);}
                          catch(Exception e1){System.out.println(e1);}response.sendRedirect("result?s1="+s1+"&s2="+s2+"&s3="+s3+"");}else{
						   try{String db_url4="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			                  String db_uname4="root";
			                  String db_upass4="root";j++;
							  Connection con4=DriverManager.getConnection(db_url4,db_uname4,db_upass4);
							  Statement st4=con4.createStatement();
							  String q4="UPDATE register SET tq='"+j+"' where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
							  st4.executeUpdate(q4);}
                          catch(Exception e1){System.out.println(e1);}}}
                   catch(Exception e1){System.out.println(e1);}
				   for(;i<k && b;)
				   {
					   String ques=s[i++];
					   op1=s[i++];
					   op2=s[i++];
					   op3=s[i++];
					   op4=s[i++];
					   ans=s[i++];
					      try{String db_url2="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			                  String db_uname2="root";
			                  String db_upass2="root";
							  Connection con2=DriverManager.getConnection(db_url2,db_uname2,db_upass2);
							  Statement st2=con2.createStatement();
							  String q2="UPDATE register SET i='"+i+"' where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
							  st2.executeUpdate(q2);}
                          catch(Exception e1){System.out.println(e1);}			   
                       out.println("<tr><th colspan='4'>"+ques+"?</th></tr><div class='a1'><tr><th><button type='button' id='op1' onclick='an1()'>"+op1+"</button> </th><th><button type='button' onclick='an2()' id='op2'>"+op2+"</button> </th><th><button type='button' onclick='an3()' id='op3'>"+op3+"</button> </th><th><button type='button' onclick='an4()' id='op4'>"+op4+"</button> </th></tr></div><tr id='che'><th colspan='4'><div id='con'><div></th></tr><tr><th colspan='4'><input type='submit' value='next'></th></tr>");
					   out.println("<script type='text/javascript'>function an1(){if("+an1()+"){document.getElementById('s4').value=document.getElementById('op1').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>");
					   out.println("<script type='text/javascript'>function an2(){if("+an2()+"){document.getElementById('s4').value=document.getElementById('op2').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>");
					   out.println("<script type='text/javascript'>function an3(){if("+an3()+"){document.getElementById('s4').value=document.getElementById('op3').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>");
					   out.println("<script type='text/javascript'>function an4(){if("+an4()+"){document.getElementById('s4').value=document.getElementById('op4').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>");
					   out.println("<script type='text/javascript'>function fun3(){document.getElementById('s5').value='"+ans+"';document.getElementById('op1').disabled = true;document.getElementById('op2').disabled = true;document.getElementById('op3').disabled = true;document.getElementById('op4').disabled = true;}</script>");
					   out.println("<script type='text/javascript'>function fun(){document.getElementById('che').style.background='red';document.getElementById('con').innerHTML ='Incorrect ans..';next();}function fun1(){document.getElementById('che').style.background='green';document.getElementById('con').innerHTML ='correct ans';next();}</script>");
					   out.println("<script type='text/javascript'>var counter=30;var t;function clock12(){document.getElementById('font1').innerHTML=counter;counter--;if(counter>0){t=setTimeout('clock12();',1000);}else{document.getElementById('form_id').submit();}}</script>");
					   out.println("<script type='text/javascript'>var counter1=3;var t1;function next(){counter1--;if(counter1>0){t1=setTimeout('next();',1000);}else{ document.getElementById('form_id').submit();}}</script>");
					   b=false;
					}
		    }
        catch(Exception e1){}        
        out.println("</table>");
        out.println("</center></form></div>");
        out.println("</body>");
        out.println("</html>");
}}
 // create table register(un varchar(30),fn  varchar(30),cn  varchar(30),an varchar(30),em  varchar(30),dob  varchar(30),gender  varchar(30),nal varchar(30),state  varchar(30),pin  varchar(30),tq  varchar(30),cq  varchar(30),i varchar(30));