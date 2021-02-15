package g_oop2;

public interface SampleInterface {
	//일반적인 메서드는 가질 수 없고 상수와 추상 메서드만 가질 수 있다.
	//부모의 역할만 한다.
	//다중상속이 가능하다.
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야 한다.
	public static final int NUM1 = 1;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 =2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void merhod2();
}

class SampleImplement implements SampleInterface , SampleInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void merhod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}
interface SampleInterface2{
		void method1();
		void method3();
	}
	
	
	

