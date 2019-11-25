package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Db;
import db.DbException;

public class Program64 {
	
	public static void main(String[] args) {		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			String sql = "UPDATE seller "
					+ "SET "
					+ "BASE_SALARY = BASE_SALARY + ? "
					+" WHERE DEPARTMENT_ID = ?";
			
			conn = Db.getConnection();
			st = conn.prepareStatement(sql);
			
			st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			Db.closeStatement(st);
			Db.closeConnection();
		}
	}
}
