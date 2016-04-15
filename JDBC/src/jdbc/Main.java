package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.CallableStatement;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost/JDBC";
		String user = "root";
		String password = "123456";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
//		PreparedStatement preparedStatement = connection.prepareStatement(
//				"create table if not exists Person"
//				+ "(id int primary key auto_increment,"
//				+ "name varchar (50))");
//		
//		preparedStatement.executeUpdate();
		
		
//		connection.prepareCall("insert into person(name) values('roma'),"
//				+ "('petja'),('dasha')").executeUpdate();
//		
	
		
		
		
//		
//		
//		System.out.println("hello world ");
//		
//		insert(connection, "person", "name", "Roma");
//		
//		
		
//		PreparedStatement statment = connection.prepareStatement("insert into person(name) values(?),(?)");
//		statment.setString(1, "vika");
//		statment.setString(2, "Yula");
//		statment.executeUpdate();
//		
//		PreparedStatement statementQuery = connection.prepareStatement("select * from person");	
//		ResultSet resultset = statementQuery.executeQuery();
//		while(resultset.next()){
//			for (int i = 1; i <= resultset.getMetaData().getColumnCount(); i++) {
//				
//			
//			System.out.print(resultset.getString(i) + " ");
//			
//			
//		}
//		System.out.println();
//		}
//		
		
		
		
		java.sql.CallableStatement callableStatement = connection.prepareCall("call p1()");
		ResultSet resultSet2 = callableStatement.executeQuery();
		while(resultSet2.next()){
			System.out.println(resultSet2.getString(1));
			System.out.println(resultSet2.getString(2));
			
		}
		
		
		connection.close();
		
		
	}
	
	public static void insert(Connection connection,String table,String column,String value) throws SQLException{
		connection.prepareStatement("insert into " + table + " ("+ column + ")" + " value ('"+ value+ "')").executeUpdate();
		
		
		
	}

}
