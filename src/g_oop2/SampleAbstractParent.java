package g_oop2;

public abstract class SampleAbstractParent { //추상메서드를 하나라도 가지고 있다면 추상 클래스 선언을 해야한다.

	/*
	 * 추상메서드 : 내용이 없는 메서드
	 *           내용이 없어서 객체생성을 할 수 없다.
	 *           부모클래스의 역할을 한다.
	 */

	void method(){ //선언무
		//구현부
		
	}

	abstract void abstractMethod();  //추상메서드는 ;로 끝난다.


}

