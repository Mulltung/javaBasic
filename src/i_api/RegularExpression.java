package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위[a-z] :a부터 z 까지, [^a-z] : a부터 z가 아닌것)
		 * {}	앞 문자의 개수 ({2}:2개, {2,4}: 2개 이상 4개 이하)
		 * () 	그룹화(1개의 문자처럼인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w 	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d 	숫자
		 * \D	숫자가 아닌 문자
		 *(?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 */
	
	
//		String str = "abc123";
//		String regex =  "[a-z]{3}[0-9]{1,3}";
//		String regex ="[a-z0-9]+";              //앞에 있는 문자가 아무거나 1개 이상이 맞는지 정답설정
//		String regex ="\\w*";						//알파벳 또는 숫자가 0개이상 온다
													//java에서 \를 쓰고 싶으면 \를 2개 쓴다.
		
//		Pattern p = Pattern.compile(regex);    //문자열 패턴 정답
//		Matcher m = p.matcher(str);            //문자열이 정답이 맞는지 확인
//		System.out.println(m.matches());      //확인 프린트
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.		
		String str1 = "moring535";			 //아이디
		String str2 = "01053237964"; 		 //전화번호
		String str3 = "moring535@gmail.com"; //이메일주소
		
		String regex1 = "[a-z0-9_-]{5,20}" ;
		String regex2 = "^0\\d{1,3}-\\d[3,4]-\\d{4}";
		String regex3 = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.[a-z]{2}))" ;
		
		
		Pattern p = Pattern.compile(regex3);    
		Matcher m = p.matcher(str3);            
		System.out.println(m.matches());
		
	}
}
