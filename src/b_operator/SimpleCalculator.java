package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
	  //두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 :");
		double num1 = Double.parseDouble( sc. nextLine());
		
		System.out.println("두 번째 숫자 :");
		double num2 = Double.parseDouble( sc. nextLine());
		
		System.out.println("연산자를 입력하시오:");
		String c= sc.nextLine();
      
	  String d= c.equals("+")? "" + (num1 + num2) : 
			   (c.equals("-")? "" + (num1 - num2) : 
			   (c.equals("*")? "" + (num1 * num2) : 
			   (c.equals("/")? "" + (num1 / num2) :
		       (c.equals("%")? "" + (num1 % num2) : 
		    	"확인불가")))); 
	 
		System.out.println("연산결과:" + d);
		
//	  System.out.println(c.equals("+")? (num1 + num2) : 
//	                    (c.equals("-")? (num1 - num2) : 
//	                    (c.equals("*")? (num1 * num2) : 
//	                    (c.equals("/")? (num1 / num2) :
//                      (c.equals("%")? (num1 % num2) : 
//		                                 "확인불가")))));
	
		
//	    int result = d.equals("+") ?  num1 + num2
//			       : d.equals("-") ?  num1 - num2
//				   : d.equals("*") ?  num1 * num2
//				   : d.equals("/") ?  num1 / num2										
//			       : num1 % num2;	

	}
}