import java.sql.*;
import javax.swing.*;
import java.util.regex.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Register extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>"+"Register Page"+"</title>");
    out.println("</head>");
    out.println("<body>");
    String s1=request.getParameter("un");
    String s2=request.getParameter("fn");
    String s3=request.getParameter("cn");
    String s4=request.getParameter("an");
    String s5=request.getParameter("em");
    String s6=request.getParameter("dob");
    String s7=request.getParameter("x");
    String s8=request.getParameter("nal");
    String s9=request.getParameter("st");
    String s10=request.getParameter("pin");
    String s11="0";
    String s12="0";
    String s13="0";
    Pattern p=Pattern.compile("^0?[6-9][0-9]{9}$");
    Matcher m=p.matcher(s3);
    Pattern p1=Pattern.compile("([A-Z]*[0-9]+)|([a-z]{3,100})@gmail.com$");
    Matcher m1=p1.matcher(s5);
	Pattern p2=Pattern.compile("^[0-9]{12}$");
    Matcher m2=p2.matcher(s4);
    Pattern p3=Pattern.compile("^([A-Z]+|[a-z])[a-z, ]{2,20}$");
    Matcher m3=p3.matcher(s1);
    Pattern p4=Pattern.compile("^([A-Z]+|[a-z])[a-z, ]{2,20}$");
    Matcher m4=p4.matcher(s2);
    Pattern p5=Pattern.compile("^([A-Z]+|[a-z])|[a-z, ,A-Z]{2,40}$");
    Matcher m5=p5.matcher(s9);
	Pattern p6=Pattern.compile("^[0-9]{6}$");
    Matcher m6=p6.matcher(s10);
	Pattern p7=Pattern.compile("^[a-z]{3,20}$");
    Matcher m7=p7.matcher(s8);
	Pattern p8=Pattern.compile("^(Male)|(FeMale)$");
    Matcher m8=p8.matcher(s7);
	Pattern p9=Pattern.compile("^(19|20)[0-9][0-9]-(0[0-9]|10|11|12)-(([0-2][1-9])|([1-3][0-1]))$");
    Matcher m9=p9.matcher(s6);
    if(m.find() && m1.find() && m2.find() && m3.find() && m4.find() && m5.find() && m6.find() && m7.find() && m8.find() && m9.find()){
	try{
        Class.forName("com.mysql.cj.jdbc.Driver");
		String db_url="jdbc:mysql://localhost:3306/exam";
		String db_uname="root";
		String db_upass="root";
		Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		Statement st=(Statement) con.createStatement();
        String q="insert into register values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')";
		st.executeUpdate(q);
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>");
        out.println("</th>");
        out.println("</tr>");
        out.println("</table>");
        response.sendRedirect("login.html");}
    catch(Exception e1){out.println(e1);}}
    else{JOptionPane.showMessageDialog(null,"Invalid Detail..."); response.sendRedirect("register.html");} 
    out.println("</body>");
    out.println("</html>");
}
}
 // create table register(un varchar(30),fn  varchar(30),cn  varchar(30),an varchar(30),em  varchar(30),dob  varchar(30),gender  varchar(30),nal varchar(30),state  varchar(30),pin  varchar(30),result  varchar(30));