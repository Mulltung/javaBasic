package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, -- 
		 */

	int result = 10 + 20 + - 30 * 40 / 50 % 60;
	System.out.println(result);
	
	//나머지 연산
	result = 10 / 3;
	System.out.println(result);
	result = 10 % 3;
	System.out.println(result);   //나머지값을 구함 (결과 : 1)
	
	//5개의 산술 연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
	result = 10 + 15;
	System.out.println(result);
	result = 50 - 20;
	System.out.println(result);
	result = 30 * 20;
	System.out.println(result);
	result = 502 / 130;
	System.out.println(result);	
	result = 52 % 51;
	System.out.println(result);	
	System.out.println();
	
	//복합연산자
	//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
	result += 3;
	result = result +3;      //같은 표현
	
	result -= 5;
	System.out.println(result);
	
	result *= 2;
	System.out.println(result);	
	
	//아래의 문장을 복합연산자를사용한 문장으로 만들어주세요.
	//result = result +10
	  result += 10;
	
	//result = result - 2 *3;
	  result -= 2 * 3;
	
	//result = result % 5;
	  result %= 5;
	
	//증감연산자
	//증감연산자(++) : 변수의 값을 1 증가시킨다.
	//감소연산자(--) : 변수의 값을 1 감소시킨다.
	int i = 0;
	
	++i; // 전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
	i++; // 후위형 : 변수의 값을 읽어온 후에 1 증가된다.
	--i; 
	i--;
	
	i = 0;
	System.out.println("++i = " + ++i);
	i = 0;
	System.out.println("i++ = " + i++);	
	System.out.println(i);	
	
	//피연자산의 타입이 서로 같아야만 연산이 가능하다.
	// 2 * 3 = 2와 3은 피연산자이이고 이항연산이라고 한다.
	int _int = 10;
	double _double = 3.14;
	double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다. (생략가능)
	System.out.println(result2);
	
	long _long = 100L;
	_long =_int + _long;
	_int = _int + (int)_long;    // 변수가 int이기 때문에 작은쪽으로 형변환을 시켜줘야한다.
	
	byte  _byte =5;
	short _short=10;
	int result3 = _byte + _short; // int보다 작은 타입은 int로 형변환된다. 
	                              // 연산은 최소 4바이트가 필요하기 때문에 int로 형변환된다.
	System.out.println(result3);
	
	char _char = 'a';
	char _char2 = 'b';
	_int = _char + _char2;         //최소 4바이트의 int로 형변환 되고
	                               //유니코드속 a와 b의 숫자가 더해진다.
	System.out.println(_int);
	
	//오버플로우, 언더플로우
	//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
	byte b =127;       //byte는 -128~127까지 표현할 수 있다.
	b++;               //오버플로우가 되어  가장 작은값이 되어 버린다.
	System.out.println(b);
	b--;               //언더플로우가 되어 가장 큰값이 되어 버린다.
	System.out.println(b);
	
	//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
	//1. 123456 + 654321
	//2. 1번의 결과값 * 123456
	//3. 2번의 결과값 / 123456
	//4. 3번의 결과값 - 654321
	//5. 4번의 결과값 % 123456
	
	double aa = 123456 + 654321;
	aa *= 123456;
	aa /= 123456;
	aa -= 654321;
	aa %= 123456;
	System.out.println(aa);
	
	//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
	int aaa = 113;
	int bbb = 223;
	int ccc = 3323;
	int sum = aaa + bbb + ccc;
	System.out.println("합계 : "+ sum);
	double avg = sum / 3.0;   //피연산자 sum과 3이 둘 다 int라서 double 방에 넣어도 소수점이 표현이 안된다.
	                        //3을 3.0으로 바꿔서 하나는 double로 해준다. 소수점이 나옴
	System.out.println("평균 : "+ avg);
	
	//반올림
	//avg = Math.round(avg); //소수점 첫째자리에서 반올림
	//System.out.println(avg);
	avg = Math.round(avg * 10) / 10.0; //소수점을 옮기고 반올림을 한 뒤 다시 제자리로 돌린다.
	System.out.println(avg);           //소수점 둘째자리에서 반올림
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
