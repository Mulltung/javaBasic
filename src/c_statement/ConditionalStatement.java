package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if(조건식){} :
		 * 다수의 조건이 필요할때 if 뒤에 추가한다. - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해
		 * 추가한다.
		 */

		int a = 1;
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 0) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}

		if (a == 1) {
			System.out.println("a가 1인 경우에 하고싶은 것"); // a가 1일 경우 여기만 실행하고 다음줄은
													// 실행하지 않는다.
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고싶은 것");
		} else
			System.out.println("이외의 경우에 하고싶은 것");

		// 조건을 한묶음으로 사용하기 위해서는 반드시 else if를 사용해야 한다. (둘 중에 하나만 실행된다.)
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		} else if (a < 20) {
			System.out.println("a가 20보다 작다.");
		}

		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;

		if (60 <= score) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 성적에 등급을 부여하는 플그램을 만들어봅시다
		score = 80;
		String grade = null;

		if (90 <= score && score <= 100) {
			grade = "A";
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else if (60 <= score) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");

		score = 100;
		grade = null;

		if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}

		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}

		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}

		} else if (60 <= score) {
			grade = "C";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}

		} else {
			grade = "F";
		}

		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");

		// 자동정렬 : Crtl + shift + f (블럭 지정 후 자동정렬)

		/*
		 * switch문 - switch(int/ String) {case 1: break;} - 조건식의 결과는 정수와 문자열만
		 * (JDK1.7부터 문자열 허용) 허용한다. - 조건식과 일치하는 case문 이후의 문장을 수행한다. - break를 만나서
		 * 빠져나올때까지 실행
		 */

		a = 1;
		switch (a) {
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("의외의 경우에 하고싶은 것");

		}

		String b = "a";
		switch (b) {
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것"); // "" 안에 ""를 넣기 위해 문자 앞에
														// \를 넣어 중복되지않게 한다.
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("의외의 경우에 하고싶은 것");

		}

		// 주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";

			break;
		case 6:
		case 7:
		case 8:
			season = "여름";

			break;
		case 9:
		case 10:
		case 11:
			season = "가을";

			break;
		default:
			season = "겨울";
			System.out.println(month + "월은 " + season + "입니다.");
		}

		score = 100;
		grade = null;
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			
		}
		System.out.println(score + "점은  " + grade + "입니다.");
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
//		 Scanner sc = new Scanner(System.in);
//		 
//
//		System.out.println("숫자를 입력하세요 : ");
//		int aa = Integer.parseInt(sc.nextLine());
//
//		if (aa == 0) {
//			System.out.println("0이다");
//		} else {
//			System.out.println("0이 아니다");
//		}
//		
//		//숫자를 입력받아 그 숫자가 홀수인지 짜수인지 출력해주세요.
//		
//		System.out.println("숫자를 입력하세요 : ");
//		int BB = Integer.parseInt(sc.nextLine());
//
//		if (BB % 2 == 0 ) {
//			System.out.println("짝수이다");
//		} else {
//			System.out.println("홀수이다");
//		}
//		
//		//뭐가 다른지
//		// int number = Integer.parseInt(sc.nextLine());
//		// int aa =  sc.nextInt(); 
//		
//		// 점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
//		// 평균은 소수점 1자리까지
// 
//		System.out.println("국어 > ");
//		double cc = Double.parseDouble(sc.nextLine());
//		System.out.println("수학 > ");
//		double dd = Double.parseDouble(sc.nextLine());
//		System.out.println("영어 >  ");
//		double ee = Double.parseDouble(sc.nextLine());
//
//		double sum = cc + dd + ee;
//		double avg = Math.round((sum / 3.0) * 10) / 10;
//
//		if (90 <= avg) {
//			grade = "A";
//		} else if (80 <= avg) {
//			grade = "B";
//		} else if (70 <= avg) {
//			grade = "B";
//		} else if (60 <= avg) {
//			grade = "B";
//		} else {
//			grade = "F";
//		}
//
//		System.out.println("총점: " + sum + " 평균: " + avg + " 등급: " + grade);
//		
//		
//		//런덤 발생
//		//Math.random() : 0.0 ~ 1.0미만의 랜덤수 발생
//		int random = (int) (Math.random() * 100) + 1;
//		System.out.println(random);
		
		//1 ~ 100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		int aaa= (int) (Math.random() * 100) + 1;
		int bbb= (int) (Math.random() * 100) + 1;
		int ccc= (int) (Math.random() * 100) + 1;
		
		if (aaa > bbb && bbb > ccc){
			System.out.printf("오름차순 : %d,%d,%d", ccc,bbb,aaa);
		} else if (aaa > ccc && ccc > bbb){
			System.out.printf("오름차순 : %d,%d,%d", bbb,ccc,aaa);
			
		} else if (bbb> aaa && aaa > ccc){
			System.out.printf("오름차순 : %d,%d,%d",ccc,aaa,bbb);
		} else if (bbb > ccc && ccc > aaa){
			System.out.printf("오름차순 : %d,%d,%d",aaa,ccc,bbb);
		}
		
		 else if (ccc > aaa && aaa > bbb){
			System.out.printf("오름차순 : %d,%d,%d",bbb,aaa,ccc);
		}else{
			System.out.printf("오름차순 : %d,%d,%d",aaa,bbb,ccc);
		}
		
		//보통방법
		int num1= (int) (Math.random() * 100) + 1;
		int num2= (int) (Math.random() * 100) + 1;
		int num3= (int) (Math.random() * 100) + 1;
		int temp;
		
		if (num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3){
			temp = num2;
			num3 = num2;
			num3 = temp;
		}
		if (num1 > num3){
			temp = num1;
			num3 = num1;
			num3 = temp;
		}
	  System.out.printf("\n오름차순 : %d,%d,%d\n\n", num1, num2, num3 );
		
		
	  //
		Scanner sc = new Scanner(System.in);
		System.out.println("==========탄수화물 중독 자가진단 테스트============");
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다. y or n");
		String qqq = sc.nextLine();
		int yyy = 0;

		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다. y or n.");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("정말 배고프지 않더라도 먹을 때가 있다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("스트레스를 받으면 자꾸 먹고싶어진다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("책상이나 식탁이에 항상 과자, 초콜릿 등이 놓여있다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못 간다. y or n");
		qqq = sc.nextLine();
		if (qqq == "y") {
			yyy = +1;
		}
		if (yyy == 3) {
			System.out.println("3개: 주의! 위험한 수준은 아니지만 관리 필요");
		} else if ( 4<=yyy || yyy <= 6) {
			System.out.println("4~6개: 위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		} else if (yyy >= 7) {
			System.out.println("7개 이상: 중독! 전문의 상담이 필요함");
		} else {
			System.out.println("1~2개: 건강함");

		}

	}
}
