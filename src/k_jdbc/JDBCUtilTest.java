package k_jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import d_array.Array;

public class JDBCUtilTest {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		/*String sql = "select * from cart "
				  + "where cart_member = ? ";
		List<Object>param = new ArrayList<>();
		param.add("a001");
		
		// List<Map<String, Object>> selectOne(String sql, List<Object> param)
		List<Map<String, Object>> list = jdbc.selectList(sql,param);
		System.out.println(list);*/
		
		
		//List<Map<String, Object>> selectOne(String sql)
		/*String sql = "select * from cart "
				  + "where cart_member = 'a001'";
		List<Map<String, Object>> list = jdbc.selectList(sql);
		System.out.println(list);*/
		
		
		/*//Map<String, Object> selectOne(String sql)
		String sql = "select * from cart "
				  + "where cart_prod='P101000001' ";
		Map<String, Object> map = jdbc.selectOne(sql);
		System.out.println(map);*/
		
		
		/*//Map<String, Object> selectOne(String sql, List<Object> param)
		String sql = "select * from cart "
				  + "where cart_prod = ? ";
		List<Object> param = new new ArrayList<>();
		param.add("P101000001");
		
		Map<String, Object> row = jdbc.selectOne(sql, param);
		System.out.println(row);*/
	
		
		//int update(String sql)
		String sql = "insert into tb_jdbc_board values("
				+ "(select nvl(max(board_no),0) + 1 from tb_jdbc_board)"
				+ ",?,?,?,sysdate";
		List<Object> param = new ArrayList<>();
		param.add("제목입니다.");
		param.add("내용입니다.");
		param.add("a001");

		int result = jdbc.update(sql,param);
		System.out.println(result + "행의 영향을 받았습니다.");
		
	}

}
