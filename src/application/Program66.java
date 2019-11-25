package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.Db;
import db.DbException;

public class Program66 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		
		try {
			conn = Db.getConnection();
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BASE_SALARY = 1500.0 WHERE DEPARTMENT_ID = 1");
			
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error");
			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BASE_SALARY = 2500.0 WHERE DEPARTMENT_ID = 2");
			
			System.out.println("rows1: " + rows1);
			System.out.println("rows2: " + rows2);
			
			conn.commit();
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Cased by" + e.getMessage());
			}
		}
		finally {
			Db.closeStatement(st);
			Db.closeConnection();
		}
	}
}
