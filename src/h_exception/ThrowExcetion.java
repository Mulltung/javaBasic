package h_exception;

import java.io.IOException;

public class ThrowExcetion {

	public static void main(String[] args) {
		/* 
		 * 예외 발생시키기  (자주 사용하지 않음)
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 */
		
		IOException ioe = new IOException();
		
		try {
			throw ioe;
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
