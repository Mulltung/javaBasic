import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class JDBCBoard {

	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어 주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18";
		String password = "java";
		
		Connection con  = null;  
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		//테이블은 SQL Developer에서 만듦
	
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from TB_JDBC_BOARD";
			ps = con.prepareStatement(sql);
		
			//select
			rs = ps.executeQuery();
			ResultSetMetaData md = rs.getMetaData(); 
			int columnCount = md.getColumnCount();
			
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					System.out.print(md.getColumnName(i) + " : ");
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close(); }catch(Exception e) {}
			if(ps != null) try {ps.close(); }catch(Exception e) {}
			if(con != null) try {con.close(); }catch(Exception e) {}
	}
		
	}
}
