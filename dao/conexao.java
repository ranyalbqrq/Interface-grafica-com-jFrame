package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.management.RuntimeErrorException;

public class conexao {

	
	private static final String DRIVER= "com.mysql.jdbc.Driver";
	private static final String URL= "jdbc:mysql://localhost:3306/mydb";
	private static final String USER= "ranyalbqrq";
	private static final String PASS= "Rany2001*";
	
	public static Connection getConnection(){
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL,USER,PASS);
			
		} catch (Exception e) {
			throw new RuntimeErrorException( null, "erro conexão");
		
    }
	}
	public static void closeConnection(Connection con) {
		try {
			if(con!=null) {
				con.close();
			}
		} catch (Exception e) {
		
		}
	}
	
public static void closeConnection(Connection con, PreparedStatement stat){ {
	closeConnection(con);
	try {
		if(stat!=null) {
			stat.close();
		}
	} catch (Exception e) {
	
	}
}
}
public static void closeConnection(Connection con, PreparedStatement stat, ResultSet rs){ {
	closeConnection(con, stat);
	try {
		if(rs!=null) {
		rs.close();
		}
	} catch (Exception e) {
	
	}
}
}
}

