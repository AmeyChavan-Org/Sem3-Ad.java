import java.sql.*;


class resultmetadata
{
	public static void main(String args[]) throws SQLException,ClassNotFoundException
	{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.28.3:3306/semIIIca226332","semIIIca226332","");
		System.out.println("Connection Found !!");
		
		try{
			Statement stmt;
			Class.forName("com.mysql.cj.jdbc.Driver");
			stmt=conn.createStatement();			
			ResultSet rs = stmt.executeQuery("select * from employee");

			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			
			int columns = rsmd.getColumnCount();

			System.out.println("Number of Columns : "+columns);
		
			for(int i=1;i<=columns;i++)
			{
				System.out.println("Columns no : "+i);
				System.out.println("Column Name : "+rsmd.getColumnName(i));
				System.out.println("Column type : "+rsmd.getColumnTypeName(i));
				//System.out.println("Column details"+rsmd.getString(i));
			}
			
			while(rs.next())
				{		
						for(int i=1;i<=columns;i++)	
						System.out.println("Column details"+rs.getString(i));
				}					
		
	

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
