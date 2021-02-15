package F_game;

import e_oop.ScanUtil;

public class MyGame {

	Character c;
	Item[] items;
	
	MyGame(){
		c = new Character("대덕이", 300, 50, 50, 20);
		
		items = new Item[10];
		items[0] = new Item("사탕", 0, 10, 0, 10);
		items[1] = new Item("젤리", 0, 20, 0, 10);
		items[2] = new Item("커피", 0, 0, 20, 20);
		items[3] = new Item("쉬는시간", 30, 0, 0, 20);
		
		items[4] = new Item("휴가", 0, 40, 30, 0);
		items[5] = new Item("공휴일", 50, 20, 30, 0);
		items[6] = new Item("주말", 50, 20, 10, 10);
	}
	
	public static void main(String[] args) {
		System.out.println(" =======================================");
		System.out.println("|               영민빌딩                                 |");
		System.out.println("|     ㅁ         ㅁ          ㅁ          ㅁ          ㅁ          |");
		System.out.println("|     ㅁ         ㅁ          ㅁ          ㅁ          ㅁ          |");
		System.out.println("|     ㅁ         ㅁ          ㅁ          ㅁ          ㅁ          |");
		System.out.println("|     ㅁ         ㅁ          ㅁ          ㅁ          ㅁ          |");
		System.out.println("|     ㅁ         ㅁ          ㅁ          ㅁ          ㅁ          |");
		System.out.println("|     ㅁ         ㅁ          ㅁ          ㅁ          ㅁ          |");
		System.out.println("|                ■    ■                 |");
		System.out.println();
		
		
		new MyGame().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.현재 상태     2.공부하기      3.밥       0.집에 가기");
			input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				c.showInfo();
				break;
				
			case 2:
				System.out.println("1.초급\t2.중급 \t3.고급");
				int input2 = ScanUtil.nextInt();
				switch (input2){
				case 1:hunt1(); break;
				case 2:hunt2(); break;
				case 3:hunt3(); break;
				}
				break;
				
			case 3:
				market(); break;
			case 0:
				System.out.println("안녕~");
				System.exit(0);
			}
		}
	}
	


	void hunt1(){
		Monster m = new Monster("Java", 150, 10, 30, 10, new Item[]{items[0], items[1], items[2], items[3]});
		System.out.println(m.name + "를 만났습니다. 야자를 하시겠습니까?");
		
		int input = 0;
		battle : while(true){
			if (c.mp >= 30){
			System.out.println("1.공부\t2.랜덤공부 (사용가능)\t3.도망");
			}
			else System.out.println("1.공부\t2.랜덤공부 (에너지 부족)\t3.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.getcount();
				c.attack(m);
				if(m.hp <= 0){
					System.out.println();
					System.out.println(m.name + "학습을 완료하였습니다.");
					c.getExp(150);
					System.out.println();
					c.getItem(m.itemDrop());
					c.getCoin();
					break battle;
				}
				m.attack(c);
				c.getCoin();
				break;
			
				
			case 2:
			if (c.mp >= 30){
				c.getcount();
				c.mpmp(m); 
			 if(m.hp <= 0){
				 System.out.println();
				System.out.println(m.name + "학습을 완료하였습니다.");
				c.getExp(150);
				System.out.println();
				c.getItem(m.itemDrop());
				c.getCoin();
				break battle;
			}
			System.out.println();
			m.attack(c);
			System.out.println("남은 에너지: " + c.mp);
			c.getCoin();
			}else System.out.println("에너지가 부족합니다."); break;
				
			case 3:
				break battle;
			}
		}
	}
	
	void hunt2(){
		Monster m = new Monster("JavaScript", 250, 10, 130, 50, new Item[]{items[4], items[5], items[6]});
		System.out.println(m.name + "를 만났습니다. 야자를 하시겠습니까?");
		
		int input = 0;
		battle : while(true){
			if (c.mp >= 30){
			System.out.println("1.공부\t2.랜덤공부 (사용가능)\t3.도망");
			}
			else System.out.println("1.공부\t2.랜덤공부 (에너지 부족)\t3.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.getcount();
				c.attack(m);
				if(m.hp <= 0){
					System.out.println();
					System.out.println(m.name + "학습을 완료하였습니다.");
					c.getExp(150);
					System.out.println();
					c.getItem(m.itemDrop());
					c.getCoin();
					break battle;
				}
				m.attack(c);
				c.getCoin();
				break;
			
				
			case 2:
			if (c.mp >= 30){
				c.getcount();
				c.mpmp(m); 
			 if(m.hp <= 0){
				 System.out.println();
				System.out.println(m.name + "학습을 완료하였습니다.");
				c.getExp(150);
				System.out.println();
				c.getItem(m.itemDrop());
				c.getCoin();
				break battle;
			}
			System.out.println();
			m.attack(c);
			System.out.println("남은 에너지: " + c.mp);
			c.getCoin();
			}else System.out.println("에너지가 부족합니다."); break;
				
			case 3:
				break battle;
			}
		}
	}
	
	void hunt3(){
		Monster m = new Monster("Spring", 350, 10, 100, 250, new Item[]{items[0], items[1], items[2], items[3]});
		System.out.println(m.name + "를 만났습니다. 야자를 하시겠습니까?");
		
		int input = 0;
		battle : while(true){
			if (c.mp >= 30){
			System.out.println("1.공부\t2.랜덤공부 (사용가능)\t3.도망");
			}
			else System.out.println("1.공부\t2.랜덤공부 (에너지 부족)\t3.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.getcount();
				c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "학습을 완료하였습니다.");
					System.out.println();
					System.out.println("축하합니다! 야자 " + c.count + "일 만에 모든 과정을 마스터하고 수료하였습니다.");
					System.out.println("앞으로 지금보다 더 공부하고 노력하는 개발자가 되세요 제발!");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("~~~~~~~~~GAME OVER~~~~~~~~~");
					System.exit(0);
					break battle;
				}
				m.attack(c);
				c.getCoin();
				break;
			
				
			case 2:
			if (c.mp >= 30){
				c.getcount();
				c.mpmp(m); 
				if(m.hp <= 0){
					System.out.println(m.name + "학습을 완료하였습니다.");
					System.out.println();
					System.out.println("축하합니다! 야자" + c.count + "일 만에 모든 과정을 마스터하고 수료하였습니다.");
					System.out.println("앞으로 지금보다 더 공부하고 노력하는 개발자가 되세요 제발!");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("~~~~~~~~~GAME OVER~~~~~~~~~");
					System.exit(0);
					break battle;
				}
			System.out.println();
			m.attack(c);
			System.out.println("남은 에너지: " + c.mp);
			c.getCoin();
			}else System.out.println("에너지가 부족합니다."); break;
				
			case 3:
				break battle;
			}
		}
	}

	void market() {
		 System.out.println("1.먹기\t2.굶기");
		 int input = ScanUtil.nextInt();
		 switch (input) {
		 case 1:
		 Market mm = new Market();
		 System.out.println("오점뭐     보유coin : " + c.coin);
		 System.out.println("1." + mm.items[0].name  +"  (ALL +30)" + "     coin 30개");
		 System.out.println("2." + mm.items[1].name  +"         (ALL +50)" + "     coin 50개");
		 System.out.println("3." + mm.items[2].name  +"                  (ALL +70) "+ "    coin 70개");
		 System.out.println("4." + mm.items[3].name  +"               (ALL +100)"+ "    coin 100개");
		 input = ScanUtil.nextInt();
		 	switch (input){
		 		case 1 : 
		 			if (c.coin >= 30){
		 				c.coin -= 30;
		 				c.getItem(mm.items[0]);
		 				System.out.println(" 남은 coin: " + c.coin);
		 			}else System.out.println("coin 부족"); 
		 				  System.out.println(); 
		 				  break;
		 			
		 		case 2 : 
		 			if (c.coin >= 50){
	 				c.coin -= 50;
	 				c.getItem(mm.items[1]);
	 				System.out.println(" 남은 coin: " + c.coin);
	 			}else System.out.println("coin 부족"); 
		 			System.out.println(); 
	 			break;
	 			
		 		case 3 : if (c.coin >= 70){
	 				c.coin -= 70;
	 				c.getItem(mm.items[2]);
	 				System.out.println(" 남은 coin: " + c.coin);
	 			}else System.out.println("coin 부족"); break;
	 			
		 		case 4 : if (c.coin >= 100){
	 				c.coin -= 100;
	 				c.getItem(mm.items[3]);
	 				System.out.println(" 남은 coin: " + c.coin);
	 			}else System.out.println("coin 부족"); break;
	 			
		 	}
		 case2 : break;
		 }
	 }
	
	
	
	
}










