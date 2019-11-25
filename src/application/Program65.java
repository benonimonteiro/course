package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Db;
import db.DbIntegrityException;

public class Program65 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;
		
		try {			
			String sql = "DELETE FROM DEPARTMENT WHERE ID = ?";
			
			conn = Db.getConnection();
			st = conn.prepareStatement(sql);
			
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			Db.closeStatement(st);
			Db.closeConnection();
		}
	}
}
