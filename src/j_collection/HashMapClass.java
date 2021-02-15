package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put (Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
		HashMap<String, Object> map = new HashMap();
		map.put("number", 10);
		map.put("name","홍길동");
		map.put("scaner", new Scanner(System.in));
	
		System.out.println(map);
		
		map.put("name", "이순신"); //덮어쓰게 된다.
	    System.out.println(map);
	    
	    map.remove("number");     //값 삭제
	    System.out.println(map);
	    
	    Object value = map.get("name");  //키를 불러 값을 출력
	    System.out.println(value);
	    
	    System.out.println(((String)value).substring(0,1));  //형변환 후 사용하기, 이순신의 '이'가 출력
	    
	    Set<String> keys = map.keySet(); //저장된 모든 키
	    for(String key : keys){
	    	System.out.println(key + ":" + map.get(key));
	    	
	    	}
	    ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	    
	    HashMap<String, Object> row = new HashMap<>();
	    row.put("CART_MEMBER", "a001");
	    row.put("CART_NO", "a001");
	    row.put("CART_PROD", "P101000001");
	    row.put("CART_QTY", 5);
	    
	    /*
	     * 래퍼클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
	     * - byte : Byte
	     * - short : Short
	     * - int : Integer
	     * - long : Long
	     * - float : Float
	     * - double : Double
	     * - char : Character
	     * - boolean : Boolean
	     */
	     
	    
	    //회원 테이블
	    //아이디, 비밀번호, 이름, 전화번호
	    ArrayList<HashMap<String, Object>> users = new ArrayList<>();
	    HashMap<String, Object> user = new HashMap<>();
	    user.put("id", "admin");
	    user.put("password", "admin123");
	    user.put("name", "관리자");
	    user.put("tel", "010-1234-4568");
	    
	    HashMap<String, Object> user2 = new HashMap<>();
	    user2.put("id", "admin2");
	    user2.put("password", "admin1234");
	    user2.put("name", "관리자2");
	    user2.put("tel", "010-1235-5568");
	
	    users.add(user);
	    users.add(user2);
	    
		for (HashMap<String, Object> u : users) {
			for (String key : u.keySet()) {
				System.out.println(key + ":" + u.get(key));
			}
			System.out.println();
		}
	    
	}
}