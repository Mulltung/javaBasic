package e_oop;

public class StaticTest {
	
	static int classVar;  //클래스 변수
	int instanceVar;     //인스턴스 변수

	public static void main(String[] args) {               //main메서드에 staric이 붙었다
		
		System.out.println(classVar);
		System.out.println(new StaticTest().instanceVar);  //StaticTest 객체생성을 해야 실행이 가능하다.
		}

	void instanceMethod(){                      //인스턴스 메서드
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
	
	
	
}
