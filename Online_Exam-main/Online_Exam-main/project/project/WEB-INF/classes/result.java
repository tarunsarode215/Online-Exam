import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class result extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>"+"Register Students"+"</title>");
out.println("<style>body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}");
out.println("table{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 30px;margin-top: 5%;color:black;}");
out.println("table tr th {padding:10px}form input{background: linear-gradient( rgba(255,255,255,0.8),rgba(255,255,255,0.8));padding:15px;color:black;} form{margin-top:30px;}</style>");
out.println("</head>");
out.println("<body><form action='login.html'><center><input type='submit' value='Back'></center></form><center><div>");
String s1=request.getParameter("s1");
String s2=request.getParameter("s2");
String s3=request.getParameter("s3");
out.println("<table border='5'>");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=(Statement) con.createStatement();
String q="select * from register where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
ResultSet rs = st.executeQuery(q);
while(rs.next())
{
      out.println("<tr><th>Name:</th><th>"+rs.getString(1)+"</th><tr>");
      out.println("<tr><th>Father Name:</th><th>"+rs.getString(2)+"</th><tr>");
      out.println("<tr><th>Contact no:</th><th>"+rs.getString(3)+"</th><tr>");
      out.println("<tr><th>Adhar no:</th><th>"+rs.getString(4)+"</th><tr>");
      out.println("<tr><th>Email:</th><th>"+rs.getString(5)+"</th><tr>");
      out.println("<tr><th>Date of Birth:</th><th>"+rs.getString(6)+"</th><tr>");
      out.println("<tr><th>Gender:</th><th>"+rs.getString(7)+"</th><tr>");
      out.println("<tr><th>Nationality:</th><th>"+rs.getString(8)+"</th><tr>");
      out.println("<tr><th>State:</th><th>"+rs.getString(9)+"</th><tr>");
      out.println("<tr><th>Pin:</th><th>"+rs.getString(10)+"</th><tr>");
      out.println("<tr><th>Total question:</th><th>"+rs.getString(11)+"</th><tr>");
      out.println("<tr><th>correct answer:</th><th>"+rs.getString(12)+"</th><tr>");
}
out.println("</th>");
out.println("</tr>");
out.println("</table>");
}
catch(Exception e1)
{out.println(e1);}
out.println("</div></center></body>");
out.println("</html>");
}
}