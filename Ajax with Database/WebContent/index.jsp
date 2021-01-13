<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
  
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please enter id");  
}else{  
//int id=Integer.parseInt(s);  
out.print(s);  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","@Madak1996");  
PreparedStatement ps=con.prepareStatement("select * from employee_info where employee_id=?");  
ps.setString(1,s);  
ResultSet rs=ps.executeQuery();  
while(rs.next()){  
out.print(" "+rs.getString(2));  
}  
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>
</body>
</html>