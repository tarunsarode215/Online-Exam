import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class choice extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
PrintWriter out = response.getWriter();
String s1=request.getParameter("s1");
String s2=request.getParameter("s2");
String s3=request.getParameter("s3");
out.println("<html><head><title>Choice</title><style>table{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 100px;margin-top: 5%;color:black;}table tr td{font-size: 20px;padding: 20px;}table tr td input{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 10px;width: 50%;}.m{padding: 100px;}body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}</style></head><body></br><div class='m'><form action='exam'><input type='hidden' name='s1' value="+s1+"><input type='hidden' name='s2' value="+s2+"><input type='hidden' name='s3' value="+s3+"><center><table><tr><td><center>-----------------------------------------------------------search-------------------------------------------------------------</br><label> Please Select Your Language</label><br><br><select style='width: 50%; height:40px;' name='s4'><option>C-pro</option><option>C++</option><option>PHP</option><option>Java</option><option>Python</option></select></td></tr><tr><td><center><input type='submit' name='' value='submit'></td></tr></table></center></form></div></body></html>");
}}
