import java.sql.*;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class adminpannel extends HttpServlet
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
        
               
                String s1=request.getParameter("cn");
                String s2=request.getParameter("em");
                String s3=request.getParameter("an");


        
     
       if(s1.equals("admin")&&s2.equals("admin")&&s3.equals("admin"))
                 
                 response.sendRedirect("questionadd.html");
                else
             {
				 JOptionPane.showMessageDialog(null,"Invalid Admin");
                 response.sendRedirect("adminpannel.html");
             }
                 
        
        out.println("<table>");
            out.println("<tr>");
               out.println("<th>");
                    
                out.println("</th>");
            out.println("</tr>");
            
        
        out.println("</table>");

             
        
    

        out.println("</body>");
        out.println("</html>");
}
}