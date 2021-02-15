package e_oop;

public class ClassMaker2 {

	//인스턴스변수 하나를 선언하고 명시적을 초기화 해주세요.
	int a = 10;
	
	//위에서 선언한 인스턴스변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		a = 20;
	}
	
	//위에서 선언한 인스턴스변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int a){
		this.a = a;
	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화 해주세요
	ClassMaker2(){
		this(50);
	}
	
	//초기화 순서
	// 1. 명시적 초기화
	// 2. 초기화 블럭
	// 3. 생성자 
	
	public static void main(String[] args) {
		ClassMaker2 cm =new ClassMaker2();
		System.out.println(cm.a);
		
		ClassMaker2 cm2 =new ClassMaker2(10);
		System.out.println(cm2.a);
		
		
		
	}
}
