package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x =  10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y; // &&는 하나라도 false면 false(둘 다 만족), ||는 하나라도 true면 true
		//||보다 &&의 우선순위가 높다.
		
		b = !(x < y); //조건식의 결과를 반대로 저장한다. 괄호 없이는 사용하면 안된다.
		
		//효율적 연산
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b = false && false; // false

		b = true || true; // true
		b = true || false; // true
		b = false || true; // true
		b = false || false; // false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		//노란색 줄은 문제가 될 수 있는 코드라는 뜻 , 실행은 된다.
		
		int a = 10;
		b = a < 5 && 0 < a++;    //왼쪽이 false때문에 오른쪽이 실행되지 않는다, 11로 1 올라가지 않는다.
		System.out.println(a);
				
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x < 10;
		System.out.println(b);
		
		//2. x가 짝수이고, x가 y의 배수이다.
		b = x % 2 == 0 && x % y == 0;
		System.out.println(b);
		
		//3. x가 3의 배수이거나, x가 5의 배수이다.
		b = x % 3 == 0 && x % 5 == 0;
		System.out.println(b);
		
		
		
		
		
		
		

	}

}
