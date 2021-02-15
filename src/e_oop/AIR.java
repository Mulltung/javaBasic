package e_oop;

public class AIR {

	boolean power;   //전원
	int way;         //방향
	int temperature; //온도
	int capacity;    //풍량
	
	final int MIN_TEMPERATURE = 18;
	final int MAX_TEMPERATURE = 28;
	
	final int MIN_CAPACITY = 0;
	final int MAX_CAPACITY = 10;
	
	AIR(){
		power = false;
		way = 2;
		temperature = 22;
		capacity = 5;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "에어컨 켜짐" : "에어컨 꺼짐");
	}
	
	void wayL() {
		if (power) {
			System.out.println("왼쪽방향");
		}
	}

	void wayG() {
		if (power) {
			System.out.println("정방향");
		}
	}

	void wayR() {
		if (power) {
			System.out.println("오른쪽방향");
		}
	}
			
	void temperature1() {
		if (power) {
			boolean a = true;
			while (a) {
				System.out.println("변경할 온도 입력 (18~28) >");
				int tm = ScanUtil.nextInt();

				if (MIN_TEMPERATURE <= tm && tm <= MAX_TEMPERATURE) {
					temperature = tm;
					System.out.println("온도 " + temperature + "º로 변경");
					a = false;
				}

				else if (MIN_TEMPERATURE > tm || tm > MAX_TEMPERATURE) {
					System.out.println("설정 범위 밖입니다. 다시 입력하세요");
				}

			}
		}
	}
			
	


	
	void temperatureUp(){
       System.out.println(temperature + 1 + "º로 변경"); 
	}
	
	void temperatureDOWN(){
	   System.out.println(temperature - 1 + "º로 변경"); 
	}
	
	void capacityUP(){
		if(power){
			if(capacity < MAX_CAPACITY){
				capacity++;
			}
			showCapacity();
		}
	}
	
	void capacityDOWN(){
		if(power){
			if(capacity > MIN_CAPACITY){
				capacity--;
			}
			showCapacity();
		}
	}
	
	void showCapacity(){
		System.out.println("풍량: ");
		for(int i = MIN_CAPACITY + 1; i < MAX_CAPACITY; i++){
			if(i <= capacity){
				System.out.print("ㅁ");
			}else{
				System.out.print("♨");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		AIR air = new AIR();
		
		while(true){
			System.out.println("=======================================================");
			System.out.println("||        1.전원  2.왼쪽방향  3.정방향  4.오른쪽방향                       ||");       
			System.out.println("|| 5.온도변경 6.온도업  7.온도다운  8.풍량업  9.풍량다운  00.종료      ||")  ;
			System.out.println("=======================================================");
			System.out.println("번호 입력 >");
			int intput = ScanUtil.nextInt();
		
			switch (intput) {
			case 1 : air.power(); break;
			
			case 2 : air.wayL(); break;
			
			case 3 : air.wayG(); break;
			
			case 4 : air.wayR(); break;
			
			case 5 : air.temperature1(); break;
			
			case 6 : air.temperatureUp(); break;
			case 7 : air.temperatureDOWN(); break;
			case 8 : air.capacityUP(); break;
			case 9 : air.capacityDOWN(); break;
			
			case 00 : System.out.println("~에어컨꺼짐 띠로링~");
			System.exit(00);
			break;
			
			default:
				System.out.println("잘못입력함");
			}
		}
	}
}
			
	
