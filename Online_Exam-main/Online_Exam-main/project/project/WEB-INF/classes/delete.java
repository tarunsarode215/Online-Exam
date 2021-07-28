import java.sql.*;
import javax.swing.*;
import java.util.regex.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class delete extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>"+"Register Page"+"</title>");
    out.println("</head>");
    out.println("<body>");
    String s1=request.getParameter("choice");
    String s2=request.getParameter("ques");
    try{
        Class.forName("com.mysql.jdbc.Driver");
	    String db_url="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
		String db_uname="root";
		String db_upass="root";
		Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		Statement st=con.createStatement();
        String q1="select * from question where choice='"+s1+"' AND ques='"+s2+"'";
        String q2="delete from question where choice='"+s1+"' AND ques='"+s2+"'";
	    ResultSet rs=st.executeQuery(q1);
        if(rs.next()){JOptionPane.showMessageDialog(null,"Question delete");st.executeUpdate(q2);}
		response.sendRedirect("delete.html");}
	catch(Exception e1){out.println(e1);}
    	out.println("</body>");
        out.println("</html>");
}}