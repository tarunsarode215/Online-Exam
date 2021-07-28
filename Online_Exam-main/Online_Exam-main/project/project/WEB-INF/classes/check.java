import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class check extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        PrintWriter out = response.getWriter();
		int i=0,c=0;
		String ans="";
		String s1=request.getParameter("s1");
        String s2=request.getParameter("s2");
        String s3=request.getParameter("s3");
        String s4=request.getParameter("s4");
        String s5=request.getParameter("s5");
        String s6=request.getParameter("s6");
	    try{Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			String db_uname="root";
			String db_upass="root";
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		    Statement st=con.createStatement();	
            String q="select * from register where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
	        ResultSet rs=st.executeQuery(q);
	        rs.next();
			String g=rs.getString(13);
			String g1=rs.getString(12);
			i=Integer.parseInt(g);
			c=Integer.parseInt(g1);c++;}catch(Exception e1){}
		if(s5.equals(s4)){
		try{Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url2="jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true";
			String db_uname2="root";
			String db_upass2="root";
			Connection con2=DriverManager.getConnection(db_url2,db_uname2,db_upass2);
		    Statement st2=con2.createStatement();
			String q2="UPDATE register SET cq='"+c+"' where un='"+s1+"' AND em='"+s2+"' AND dob='"+s3+"'";
		    st2.executeUpdate(q2);}catch(Exception e1){}}response.sendRedirect("exam?s1="+s1+"&s2="+s2+"&s3="+s3+"&s4="+s6+"");
}}