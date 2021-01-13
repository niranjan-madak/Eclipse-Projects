

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Resource(name="mysqlpool")
    private DataSource ds;
    public Demo() {
        
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
		PrintWriter out=response.getWriter();
		try {
			
		con=ds.getConnection();
		String query="select* from student_info";
		smt=con.createStatement();
		rs=smt.executeQuery(query);
		while(rs.next()) {
			String name=rs.getString("NAME");
			out.print("<br/>"+name);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			}
}

}
