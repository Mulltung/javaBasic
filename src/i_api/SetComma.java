package i_api;

import java.util.Arrays;
import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,234,567
		
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		String ss2 = "";
		
		/*for (int i = ss.length() -1; 0 <= i; i--) {
			if (i > 0 && (i%3) == 0){
				System.out.print(ss.charAt(ss.length() -i-1) + "," + ss2);
			}else System.out.print(ss.charAt(ss.length()-i-1) + ss2);
		}		*/
		
		
		//다른방법
		int count = 0;
		for (int i = ss.length()-1 ; i >= 0; i--) {
			ss2= ss.charAt(i) + ss2;
			count++;
			if(count % 3 == 0 && count != ss.length()){
				ss2 = ',' +ss2;
			}
			System.out.println(ss2);
		}
	}

}
