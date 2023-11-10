package Script_Design_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection 
{

	public static void main(String[] args) throws SQLException
	{

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendata", "root", "root");

	}

}
