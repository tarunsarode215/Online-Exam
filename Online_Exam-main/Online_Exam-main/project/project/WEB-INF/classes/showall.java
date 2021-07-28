import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class showall extends HttpServlet
{

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
    
        PrintWriter out = response.getWriter();
        
           
        

               
        out.println("<html>");
        out.println("<head>");
        
        out.println("<title>"+"Register Students"+"</title>");
		
        out.println("<style>body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}");
        out.println("table{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 30px;margin-top: 5%;color:black;}");
		out.println("table tr th {padding:10px}form input{background: linear-gradient( rgba(255,255,255,0.8),rgba(255,255,255,0.8));padding:15px;color:black;} form{margin-top:30px;}</style>");
		out.println("</head>");
        out.println("<body><form action='questionadd.html'><center><input type='submit' value='Back'></center></form><center><div>");
        
               
                String s1=request.getParameter("cn");
                String s2=request.getParameter("em");
                String s3=request.getParameter("an");

    
        out.println("<table border='5'>");
        
     
            
    try
               {
            Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_url="jdbc:mysql://localhost:3306/exam";
			String db_uname="root";
			String db_upass="root";
			
		Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		
		Statement st=(Statement) con.createStatement();
                
		String q="select * from register ";
	
	      ResultSet rs;
            rs = st.executeQuery(q);
                 
            while(rs.next())

{
      out.println("<tr>");
      out.write("<th>");
      out.print(rs.getString(1));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(2));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(3));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(4));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(5));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(6));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(7));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(8));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(9));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(10));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(11));
      out.write("</th>\n");
      out.write("<th>");
      out.print(rs.getString(12));
      out.write("</th>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("");
           
}
    
                out.println("</th>");
            out.println("</tr>");
            
        
        out.println("</table>");

               }
    
       catch(Exception e1)
       {
           out.println(e1);
       }
         
        
    

        out.println("</div></center></body>");
        out.println("</html>");
}
}