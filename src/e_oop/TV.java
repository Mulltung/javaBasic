package e_oop;

import java.util.Scanner;

public class TV {
	
	static int result =55;
	static int b=13;
	
	TV(){
		
	};
	TV(String a){
	//전원
	if(a.equals("ON")){
		System.out.println("TV켜짐");
	}
	else if(a.equals("OFF")){
		System.out.println("TV꺼짐");
	   }
	
	
	//볼륨
	else if(a.equals("UP")){
		   b ++;
		   System.out.println("볼륨:" + b);
		}
     else if (a.equals("DOWN")){
			b--;
			System.out.println("볼륨:" + b);
     }
	}
	
	//채널
	static void channel(String a){
		 
		if(a.equals("UP")){
			result =+ 1;
			System.out.println(result + "번으로 채널 변경");
		}
		else if(a.equals("DOWN")){
			result -= 1;
			System.out.println(result + "번으로 채널 변경");
	}
	}
	
	static void channel2(String ss){
			System.out.println(ss + "번으로 채널 변경");
		}


	
	//과제. TV를 대상으로 클래스를 만들어주세요.//POWER VOLUME CHANNEL
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// POWER
		System.out.println("TV전원 : ON/OFF");
		String ss = s.nextLine();
		TV POWER = new TV(ss);
		if (ss.equals("OFF")) {
			return;
		}

		// VOLUME
		System.out.println("볼륨 : UP/DOWN");
		ss = s.nextLine();
		TV VOLUME = new TV(ss);

		// CHANNEL
		System.out.println("채널선택: UP/DOWN/숫자입력");
		ss = s.nextLine();
		TV CHANNEL = new TV();
		if (ss.equals("up") || ss.equals("DOWN"))
			TV.channel(ss);
		else {
			TV.channel2(ss);
		}
	}
}