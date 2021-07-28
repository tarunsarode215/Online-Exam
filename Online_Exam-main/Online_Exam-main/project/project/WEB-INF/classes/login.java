import java.sql.*;
import javax.swing.*;
import java.util.regex.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class login extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>"+"Register Page"+"</title>");
    out.println("</head>");
    String s1=request.getParameter("un");
    String s2=request.getParameter("em");
    String s3=request.getParameter("dob");
    out.println("<body>");
	Pattern p=Pattern.compile("^([A-Z]+|[a-z])[a-z, ]{2,20}$");
    Pattern p1=Pattern.compile("([A-Z]*[0-9]+)|([a-z]{3,100})@gmail.com$");
    Pattern p2=Pattern.compile("^(19|20)[0-9][0-9]-(0[0-9]|10|11|12)-(([0-2][1-9])|([1-3][0-1]))$");
    Matcher m=p.matcher(s1);
    Matcher m1=p1.matcher(s2);
    Matcher m2=p2.matcher(s3);
	if(m.find() & m1.find() & m2.find()){
    try{
        Class.forName("com.mysql.jdbc.Driver");
	    String db_url="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
		String db_uname="root";
		String db_upass="root";
		Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		Statement st=con.createStatement();
        String q="select * from register where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"' ";
	    ResultSet rs=st.executeQuery(q);
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>");
        out.println("</th>");
        out.println("</tr>");
        out.println("</table>");
        if(rs.next())response.sendRedirect("choice?s1="+s1+"&s2="+s2+"&s3="+s3+"");
		else {JOptionPane.showMessageDialog(null,"Register first");response.sendRedirect("register.html");}}
	catch(Exception e1){out.println(e1);}}
	else {JOptionPane.showMessageDialog(null,"Invalid id..."); response.sendRedirect("login.html");}
        out.println("</body>");
        out.println("</html>");
}}