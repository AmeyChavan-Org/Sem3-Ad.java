import java.sql.*;


class employee
{
	public static void main(String args[]) throws SQLException,ClassNotFoundException
	{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.28.3:3306/semIIIca226332","semIIIca226332","");
		System.out.println("Connection Found !!");
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			String qry="create table Employee1(empid int primary key,empname varchar(20),salary float)";
			PreparedStatement ps = conn.prepareStatement(qry);
			ps.executeUpdate(qry);
		   	System.out.println("Table Created !!");
		   }catch(SQLException se){
				System.out.println(se);			
			}catch(ClassNotFoundException ce){
				System.out.println(ce);		
			}
		finally{
			try{
				conn.close();
			}catch(SQLException se){
				System.out.println(se);	
			}
			}	
		}
}
