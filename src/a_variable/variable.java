package a_variable;

import java.util.Scanner; // Ctrl + shift + o 

public class variable {  //클래스

	public static void main(String[] args) {   // 메서드 -()가 붙은것, main은 매서드의 이름
		                                       // 메서드: 명령문의 집합
	                                           // main메서드 : 프로그램의 시작과 끝
                                               // 주석: 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
                                               // 한줄 주석 : Ctrl + Shift + c
		                                       /* 범위주석 : Ctrl + Shift + /(해제:\), 블럭지정 후 단축키*/     //주석 단추기 외우기 
//		변수
//		데이터를 담는 그릇
//		- 변수를 만드는 방법 : 데이터의 형태(데이터 타입) + 이름
//
//
//		기본형 타입  !!외우기!!
//		( )는 크기, *를 가장 많이 사용한다
//		-정수 : byte(1) , short(2), *int(4), long(8)
//		-상수 : float(4), *double(8) // float는 7자리까지 정확, double 15자리까지 정확 (정확도 차이)
//		-문자 : char(2)
//		-논리 : boolean(1)
		
		
		
		
    int x;     //정수를 저장할 수 있는 x라는 이름을 가진 그릇을 만들어라.
	           //변수를 만드는 것을 변수 선언이라고 표현한다.
//	double x;  //블럭{}안에서 이름이 중복될 수 없다.
	           //빨간색 밑줄은 에러를 뜻함 컴파일을 할 수 없다.
	double y; 
	
	// (=대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
	x = 10;   // 초기화: 변수에 처음으로 값을 저장하는 것
	y = 3.14; // 변수의 타입에 맞는 값을 저장해야한다.
	

	int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
	long ㅣ= 40L; //접미사 L를 붙어야 long타입이 된다. int타입에서 long타입으로 바뀐다. 대소문자 상관없지만 L경우는 대문자로 사용
	float f = 5.5f; // 접미사 f를 붙어야 float타입이 된다. double타입에서 float타입으로 바뀐다. 대소문자 상관없음
	char c = '한'; // 따옴표안에 반드시 한글자를 넣어야 한다.
	boolean b = true; //true, false 둘 중 하나의 값이 저장된다.
	
	//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
	byte a = 1;
	short aa= 2;
	int aaa= 3;
	long aaaa= 4L;
	float bb = 1.1f;
	double bbb= 1.2;
	char cc = '영';
	boolean dddd= true;
	
    x = 20; // 기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
	
    // 위에서 만든 8개의 변수에 새로운 값을 저장해주세요.
    a =2;
    aa =5;
    aaa = 7;
    aaaa = 9L;
    bb = 1.9f;
    bbb = 2.2;
    cc = '빈';
    dddd = false;
    
    //콘솔창에 출력
    System.out.println(x);//()가 붙었기 때문에 메서드다.
    //실행 단축키 : Ctrl + F11
    System.out.println(100);
    
    //위에서 만든 8개의 변수의 값을 출력해주세요.
    System.out.println(a);
    System.out.println(aa);
    System.out.println(aaa);
    System.out.println(aaaa);
    System.out.println(bb);
    System.out.println(bbb);
    System.out.println(cc);
    System.out.println(dddd);
    
    //문자열
    String str = "문자 여러개.."; // 클래스는 참조형타입 데이터이다. 문자가 안 들어가도 상관없다
                               // 기본형을 제외한 나머지는 참조형타입이다.
                               // 기본형타입은 변수 위치에 저장하고
                               // 참조형은 값을 남는 공간인 밖에 저장하고 그 위치를 변수에 저장한다.
    System.out.println(str);
    //문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
    System.out.println(str + 50);  //string은 다른 타입과 만나면 다른 타입도 무조건 string으로 바뀐다.
    System.out.println(str + 50 + 30); // 30도 string으로 바뀐다. 그래서 80이 아닌 5030이 출력된다.
    System.out.println(50 + 30 + str); //int와 int가 만나 80으로 더해지고 나중에 string으로 바뀐다.
    
    //형변환
    //다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라 한다.
    int small = 10;
    long big = 10L;
    
    small = (int)big;  //big 앞에 (int)를 붙이면 형변환이 된다.
    big= small;        //작은 쪽으로 큰 쪽으로 하는 것이기 때문에 형변형이 생략이 가능하다
    				   //큰 쪽에서 작은 쪽으로 형변형은 데이터 손실이 있을 수 있기 때문에 해줘야한다.
    
    /*  외울것
     *  명명규칙
     *  - 영문자 대소문자, 한글(사용할 수 있지만 거의 사용하지않음), 숫자, 특수문자('_', '$')를 사용할 수 있다.
     *  - 숫자로 시작할 수 없다.
     *  - 예약어는 사용할 수 없다. ex) 진한 보라색
     *  - [낙타식 표기법을 사용한다. (mySampleClass)]         //새로운 단어가 시작되면 대문자를 사용한다. 변수를 만들때는 소문자로 시작
     *  - [클래스명의 첫글자를 대문자로 한다. (MySampleClass)]  // 클래스를 만들때는 대문자
     */
    
    /*
     *  상수
     *  - 값을 변경 할 수 없는 그릇
     *  - 리터럴에 의미를 부여하기 위해 사용한다.  
     */
    final int MAX_NUMBER = 10;    //10을 상수로 리터럴에 의미를부여하기 위해  MAX_NUMBER로 저장한다.
                                  //final을 붙이면 변경 할 수 없는 상수가 된다.
    // MAX_NUMBER ==100;          //컴파일 에러 발생
    
    //줄바꿈 
    System.out.print("줄바꿈을 하지 않는다.");
    System.out.println("줄바꿈을 한다.");
    System.out.print("뒤쪽에 역슬러시 n을 통해 줄바꿈을 한다.\n");
    System.out.print("여러칸을 \t뜀.");  // 여러칸을 뜀
    System.out.printf("문자열 : %s, 숫자: %d", "안녕", 10); //출력 포멧을 지정한다.
    System.out.println();
    
    //입력
    Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
    //System.out.println("아무거나 입력 해주세요>");
    //String str2 = sc.nextLine();                  //nextLine()을 사용하면 문자열을 받을 수 있다
    //System.out.println("입력받은 내용 :"+ str2);
    //입력을 받게되면 사용자가 입력 할 때까지 프로그램이 멈추게 된다.
    //내용을 입력 후 엔터를 치면 이력이 종료되고 프로그램이 다시 진행된다.
    //System.out.println("int 입력>");
    //int nextInt = sc.nextInt();       //숫자를 입력 받음
    //System.out.println(nextInt);      //숫자를 입력 받아서 출력
    
//    System.out.println("int 입력>");
//    int nextInt = sc.nextInt();
//    System.out.println(nextInt);
//    System.out.println("문자열 입력>");  //int 입력 받고 문자열 입력 받아야 하는데 에러남 밑에 방법으로 실행
//    String nextLine = sc.nextLine();
//    System.out.println(nextInt);
//    System.out.println("입력 끝!");
    
    
    //숫자 입력
//    System.out.println("int 입력>");
//    int number = Integer.parseInt(sc.nextLine());  //문자열을 입력 받아서 Integer.parseInt로 문자열을 숫자로 바꿔준다.
//                                                   //형변환으로는 문자열을 숫자로 못 바꿈
//    System.out.println(number);
    
    //자신의 이름을 저장할 변수를 선언해주세요.
    String name ;
    
    //위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
    // System.out.println("이름을 입력해주세요 :");
    //name = sc.nextLine();
   
    
    //자신의 나이를 저장할 변수를 선언해주세요.
    int age;
    
    //위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
    //System.out.println("나이를 입력해주세요: ");
    //age = Integer.parseInt(sc.nextLine());   // Scanner에 있는 함수 nextLine을 사용하겠다. (위에 첫줄에 sc로 선언) 
    // Double.parseDouble(sc.nextLine());       // 문자열을 Double로 변환 (parseInt와 다름)
    
    // System.out.println("이름: " + name + "/ 나이" + age);
    
    // 다음과 같은 프로그램을 작성해주세요.
    /*
     * =========회원가입=========== (입력 받는 부분)
     * 아이디 > admin
     * 비밀번호(4자리 숫자) > 1234
     * 이름 > 홍길동
     * 나이 > 99
     * 키 > 185.5
     * ========================== (출력 부분)
     *아이디 : admin
     * 비밀번호 : 1234
     * 이름 : 홍길동
     * 나이 : 99세
     * 키 : 185.5cm
     */
    
    System.out.println("========회원가입=========");
    System.out.println("아이디 > ");
    String id = sc.nextLine();
    System.out.println("비밀번호(4자리 숫자) > ");
    int pass = Integer.parseInt(sc.nextLine());
    System.out.println("이름 > ");
    name = sc.nextLine();
    System.out.println("나이 > ");
    age = Integer.parseInt(sc.nextLine());
    System.out.println("키 > ");
    double hight = Double.parseDouble(sc.nextLine());
    System.out.println("====================");
    System.out.println("아이디 :"+ id);
    System.out.println("비밀번호 :"+ pass);
    System.out.println("이름:"+ name);
    System.out.println("나이 :"+ age + "세");
    System.out.println("키:"+ hight + "cm");
    System.out.println("====================");
        
	} 	
}

