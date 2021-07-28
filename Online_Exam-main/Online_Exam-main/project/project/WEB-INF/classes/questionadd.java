import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class questionadd extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
    
        PrintWriter out = response.getWriter();
        
           
        

               
        out.println("<html>");
        out.println("<head>");
        
        out.println("<title>"+"Register Page"+"</title>");
        
        out.println("</head>");
        out.println("<body>");
        

String s1=request.getParameter("choice");
String s2=request.getParameter("ques");
String s3=request.getParameter("answer1");
String s4=request.getParameter("answer2");
String s5=request.getParameter("answer3");
String s6=request.getParameter("answer4");
String s7=request.getParameter("correct");


        try
        {
                Class.forName("com.mysql.jdbc.Driver");
			
			String db_url="jdbc:mysql://localhost:3306/exam";
			String db_uname="root";
			String db_upass="root";
			
          		
		Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
                Statement st=con.createStatement();
                
                String q="insert into question values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
                
                st.executeUpdate(q);
                
                response.sendRedirect("questionaddd.html");
            
        
        
        }
        catch(Exception e1)
        {
        out.println(e1);
        }



         
        
    

        out.println("</body>");
        out.println("</html>");
}
}
// create table question(choice varchar(30),ques varchar(100),ans1 varchar(30),ans2 varchar(30),ans3 varchar(30),ans4 varchar(30),correct varchar(30));