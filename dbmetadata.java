import java.sql.*;


class dbmetadata
{
	public static void main(String args[]) throws SQLException,ClassNotFoundException
	{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/semIIIca226332","semIIIca226332","");
		System.out.println("Connection Found !!");
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			DatabaseMetaData dbmd = conn.getMetaData();
			ResultSet rs = null;
			System.out.println("Database product name : "+dbmd.getDatabaseProductName());
			System.out.println("User name : "+dbmd.getUserName());
			System.out.println("Database driver name : "+dbmd.getDriverName());
			System.out.println("Database driver version : "+dbmd.getDriverVersion());
			System.out.println("Database Version : "+dbmd.getDriverMajorVersion());

			rs = dbmd.getTables(null,null,null,new String[]{"Table"});

			System.out.println("List of tables : ");
		
			while(rs.next())
			{
				String tblName = rs.getString("TABLE_NAME");
				System.out.println("Table : "+tblName);
			}
			}catch(SQLException se)
			{
				System.out.println(se);			
			}catch(ClassNotFoundException ce)
			{
				System.out.println(ce);		
			}
			finally
			{
				try{
					conn.close();	
				   }catch(SQLException se){
						System.out.println(se);	
						}
			}
	  }	
}


