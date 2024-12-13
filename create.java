package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class create {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			String sql="create database sign";
			PreparedStatement pmst=conn.prepareStatement(sql);
			pmst.execute();
			pmst.close();
			conn.close();
			System.out.println("created");
			} 
		catch (Exception e) {
			System.out.println("error");
		}
	}

}
