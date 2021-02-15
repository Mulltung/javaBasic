package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류 (처리 불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리 가능)
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RunthimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해 줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 지정해 줄 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
 		 */
		
		try {
			int result = 10 / 0;
			System.out.println(result);   //윗줄에서 예외가 발생되서 프린트되지 않는다.
		} catch (ArithmeticException e) {
			e.printStackTrace();          //예외 메시지를 출력해주는 메서드
		} catch (NullPointerException | IndexOutOfBoundsException e){    // | n가지 예외를 한번에 처리, 가장 많이 보게 될 예외
	
			//IndexOutOfBoundsException : 배열을 참조를 할 때 index를 벗어났다
			int[] arr = new int[10];
			System.out.println(arr[10]);
			
			//NullPointerException : Null을 참조함, 그 줄 변수에 null이 들어있다고 생각하면 된다.			                    
			String str = null;
			System.out.println(str.equals(""));
			
		} catch(Exception e){   //모든 예외를 한번에 처리
		}
	
		
		try {
			Thread.sleep(1000);               //코드를 작성했을때 Ctrl + 1를 눌렀을때 try catch가 나온다면 눌러서 예외처리하면 된다.
			                                  //java.lang에 있는 애들은 improt를 안해도 된다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		
		/*
		 * CallStack
		 * - 위에 있는 것을 삭제를 해야만 밑에 있는것을 삭제할 수 있다.
		 * - 밑은 막혀있고 위에는 뚫여있다.
		 * - 맨 위에가 가장 최근에 실행된 코드이고 예외가 발생될 확률이 가장 높다
		 * - 맨 위가 아닐 가능성도 있다.
		 * - 예외를 클릭해서 찾아간다
		 * 
		 * |             |
		 * |___test2()___|
		 * |___test1()___|
		 * |____main()___|
		 */
		
		
		
		test1();
		
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10/0);
		
		try {
			new FileInputStream("");          //내가 만들지 않은 에러가 위쪽에 있어도 밑에 내가 만든 것 증 첫번째를 찾아서 누른다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
