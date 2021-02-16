package k_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import e_oop.ScanUtil;


public class JDBCBoard {

	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "pc18";
	static String password = "java";
	
	static Connection con  = null;  
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어 주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		
		
		//테이블은 SQL Developer에서 만듦
	
		while(true){

		System.out.println("1.조회\t2.등록\t0.종료");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			select();
			break;
		case 2:
			insert();
			break;
		
		case 0:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
			break;
		}
	}
		
	}
	
		private static void select(){
			Connection con  = null;  
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "select * from TB_JDBC_BOARD";
				ps = con.prepareStatement(sql);
			
				//select
				rs = ps.executeQuery();
				
				System.out.println("-----------------------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("-----------------------------");
				
				while(rs.next()){
				System.out.print(rs.getString("BOARD_NO")+"\t");
				System.out.print(rs.getString("TITLE")+"\t");
				System.out.print(rs.getString("USER_ID")+"\t");
				System.out.print(rs.getString("REG_DATE")+"\t");
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
	
	
	
	
		private static void insert(){
			try {
			con = DriverManager.getConnection(url,user,password);
			String sql = "INSERT INTO TB_JDBC_BOARD(BOARD_NO, TITLE, CONTENT ,USER_ID,REG_DATE)"
					  + " VALUES(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			System.out.print("BOARD_NO >> ");
			int input = ScanUtil.nextInt();
			ps.setObject(1, input);
			
			System.out.print("TITLE >> ");
			String input2 = ScanUtil.nextLine();
			ps.setObject(2, input2);
			
			System.out.print("CONTENT >> ");
			input2 = ScanUtil.nextLine();
			ps.setObject(3, input2);
			
			System.out.print("USER_ID >> ");
			input2 = ScanUtil.nextLine();
			ps.setObject(4, input2);
			
			System.out.print("REG_DATE >> ");
			input2 = ScanUtil.nextLine();
			ps.setObject(5, input2);
			
			int result = ps.executeUpdate();
			System.out.println(result + "개 행 등록 완료");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(ps != null) try {ps.close(); }catch(Exception e) {}
			if(con != null) try {con.close(); }catch(Exception e) {}
	
		}
		
		}
}
		
		

		

	