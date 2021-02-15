package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는 것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * - 객체란 실제로 존재하는 것 (대상,사물 등등)
		 */

		SampleClass sc = new SampleClass();   //다른 class를 사용하기위해 메모리에 올리는 과정이다. 사용가능한 주소를 sc에 저장해서 sc를 활용하여 사용(객체생성)
		
		System.out.println(sc.field);
		
		sc.merhod1();
		
		String returnValue = sc.method2(10);
		System.out.println(returnValue);

		sc.flowTest1();
		
		System.out.println();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메서드를 호출 해주세요.
		//리턴타입이 있는 메서드를 리턴받은 값을 출력해주세요.
		
		ClassMaker aa = new ClassMaker();
		
		aa.b();
		
		System.out.println(aa.c());
		
		aa.d(100);
		
		System.out.println(aa.e(8, 9));
	   //Ctrl + SpaceBar : 자동완성
	   // 패키지 > 클래스 > 메서드 > 변수 
		
		System.out.println();
		//=================================================================================================
		//계산기 실행
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		// 1. 123456 + 654321
		// 2. 1번의 결과값  * 123456
		// 3. 2번의 결과값  / 123456
		// 4. 3번의 결과값  - 123456
		// 5. 4번의 결과값  % 123456
		
		Calculator qwe = new Calculator();
		
		//+
		double aa1 = qwe.aa(123456, 654321);
		System.out.println("더하기 : " + aa1);
		
		// *
		double aa2 = qwe.cc(aa1, 123456);
		System.out.println("곱하기 : " + aa2);

		// /
		double aa3 = qwe.dd(aa2, 123456);
		System.out.println("나누기 : " + aa3);
		
		// -
		double aa4 = qwe.bb(aa3, 654321);
		System.out.println("빼기 : " + aa4);
		
		// %
		double aa5 = qwe.ee(aa4, 123456);
		System.out.println("나머지 : " + aa5);
		
		System.out.println("최종결과 : " + aa5);
		
		
		
		
	}

}
