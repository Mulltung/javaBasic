package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
	  /*
	   * 비교연산자
	   * - <, >, <=, >=, ==, !=
	   * - 문자열비교 : equals()
	   */
		
		int x = 10;
		int y = 20;
		boolean b = x < y; //비교연산의 연산결과는 boolean이다.
		System.out.println(b);
		b = x <= y -15; // 산술연산 후 비교연산을 수행한다.
		System.out.println(b);

		String str1 = "abc"; //참조형은 변수에 저장한 것이 아니라 주소에 저장한다.
		String str2 = "abc";
		b = str1 == str2;     //문자열의 내용이 아닌 주소를 비교한 것이다. 내용 비교x
		System.out.println(b);
		
		//String의 내용을 비교하기 위해서는 equals()메서드를 사용한다.
		b = str1.equals(str2);    //문자열 내용이 같은지 확인
		System.out.println(b);
		b = !str1.equals(str2);   //문자열 내용이 같지 않은지 확인
		System.out.println(b);
		System.out.println();
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크다.
		    x = 20;
		    y = 10;
		    boolean gg = x > y;
		    System.out.println(gg);
		    
		//2. x + 5와 y는 같다.
		    x = 5;
		    y = 10;
		    gg = y == x + 5;
		    System.out.println(gg);
		    
		//3. y는 홀수이다.
		     y = 9;
		     gg =  y % 2 == 1 ;
		     System.out.println(gg);
		//4. "기본형"과 "참조형은" 다르다.
             str1 = "기본형";
             str2 = "참조형";
		     gg	= !str1.equals(str2);
		     System.out.println(gg);
		
		
		
		
		
		
	}

}
