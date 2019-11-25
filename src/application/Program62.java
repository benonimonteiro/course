package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.Db;

public class Program62 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = Db.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM DEPARTMENT");
		
			while (rs.next()) {
				System.out.printf("%d, %s%n", rs.getInt("ID"), rs.getString("NAME"));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Db.closeResultSet(rs);
			Db.closeStatement(st);
			Db.closeConnection();
		}
	}
}