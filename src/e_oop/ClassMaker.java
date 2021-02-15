package e_oop;

public class ClassMaker {

	//전역변수 하나를 선언 및 초기화 해주세요.
	int a = 5;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에는 전역변수를 출력해주세요.
	void b(){
		System.out.println(a);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요
	int c(){
		return a;
	}
	
	//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	
	void d(int parameter){
		System.out.println(parameter);
		return ; //메서드를 종료시키는 역할. 넘겨줄 값은 없다.
	}
	
	
	//int타입의 리턴타입과 int타입의 피라미터 두개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	
	int e(int parameter, int parameter2){
		return parameter * parameter2;
	}
	
	//return의 역할 
	//1. 메서드를 종료시킨다.
	//2. 값을 넘겨준다.
	
	
}
