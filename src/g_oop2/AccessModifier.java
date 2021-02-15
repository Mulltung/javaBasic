package g_oop2;

import e_oop.ScanUtil;


public class AccessModifier {
	
	public String publicVar = "pulic : 접근제한이 없음";
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능, 붙이지 않아야  default이다.";
	private String privateVar = "private : 클래스 내에서만 접근 가능";

	
	public void pulicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.pulicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
		Time t = new Time();
		
//		t.hour = 14;
//		t.minute = 2;
//		t.second = -15;
		
		t.setHour(14);
		t.setMinute(52);
		t.setSecond(0);
		System.out.println(t.getTime());
		
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 사용하는데 불필요한 멤버를 숨기기 위해
		 */
		
	
		t.clock();
//		t.stop(interval);
		
	}
}


