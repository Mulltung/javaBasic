import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class JDBC3 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18";
		String password = "java";
		
		Connection con  = null;  
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
/*		//DAWICE2 SELECT
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from DAWICE2";
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
		*/
		
		
		
		
		
/*DAWICE2 INSERT
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO DAWICE(DW_ACTINFO, DW_ACTYEAR, DW_MEMBER) VALUES('DDㅇDD','2022','PSY')";
			ps = con.prepareStatement(sql);
		
			//INSERT
			int result = ps.executeUpdate();
			System.out.println(result + "개 행이 삽입되었습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(ps != null) try {ps.close(); }catch(Exception e) {}
			if(con != null) try {con.close(); }catch(Exception e) {}
	}
		*/
		
		
		
		
		
		
/*		
//UPDATE
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE LPROD SET LPROD_NM = '테스트' WHERE LPROD_GU = 'P202'";
			ps = con.prepareStatement(sql);
			
			//UPDATE
			int result = ps.executeUpdate();
			System.out.println(result + "개 행이 삽입되었습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(ps != null) try {ps.close(); }catch(Exception e) {}
			if(con != null) try {con.close(); }catch(Exception e) {}
	}
*/	
		
		
		
		
//	DELETE
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM LPROD WHERE LPROD_NM ='테스트'";
			ps = con.prepareStatement(sql);
		
			//delete
			int result = ps.executeUpdate();
			System.out.println(result + "개 행이 삭제되었습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(ps != null) try {ps.close(); }catch(Exception e) {}
			if(con != null) try {con.close(); }catch(Exception e) {}
	}
		
		
	}
}
