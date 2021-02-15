package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자  (이런게 있구나 정도 알기)
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조 연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		//1byte : 01010101  // 0 또는 1 하나가 비트이다.
		System.out.println(10 | 15); // | : 둘다 0인 경우 0 그외 1
		//10 : 00001010
		//15 : 00001111
	   //결과 : 00001111  = 15
	
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;  // 조건식이 참이면 ? 거짓이면 :를 실행한다.
		                             // int result = x;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 1;     // 3이상의 숫자면 다 여자가 나와서 문제가 있다. 밑에 추가
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + " 입니다");
		
		gender = regNo == 3 ? "남자" : (regNo == 2 ? "여자" : "확인불가"); // 3부터 확인불가 출력
		System.out.println("당신의 성별은 " + gender + " 입니다");
		
		//2개의 숫자를 입력받고,둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 :");
		int aa = Integer.parseInt( sc. nextLine());
		System.out.println("두 번째 숫자 :");
		int bb = Integer.parseInt( sc. nextLine());
		int num = aa < bb ? bb : aa;
		System.out.println("더 큰 숫자 : " + num);	
		System.out.println("");
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.println("숫자를 입력하시오 :");
		aa = Integer.parseInt(sc. nextLine());
		gender =  aa ==1 || aa ==3 ? "남자" : (aa == 2 ||aa == 4 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + "입니다");
		
		
	}
}
