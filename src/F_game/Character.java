package F_game;

public class Character {

	String name;	//이름
	int maxHp;		//최대 체력
	int maxMp;		//최대 마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int level;		//레벨
	int exp;		//경험치
	Item[] items;	//보유 아이템
	int coin;
	int coin2;
	int count;
	int damage2;
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo(){
		System.out.println("==========================");
		System.out.println("---------- 상태 -----------");
		System.out.println("이름 : " + name);
		System.out.println("숙련도: " + level + "(" + exp + "/100)");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("에너지: " + mp + "/" + maxMp);
		System.out.println("학습도: " + att);
		System.out.println("인내력 : " + def);
		System.out.println("coin :" + coin);
		System.out.println("---------- 아이템 ----------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("==========================");
	}
	
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "는 공부를 통해 " + m.name + "를 "
				+ damage + "p만큼 학습하였습니다.");
		System.out.println(m.name + "의 남은 학습량 : " + m.hp + "p");
		System.out.println();
		
	}
	
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level++;
		maxHp += 50;
		maxMp += 10;
		att += 5;
		def += 5;
		hp = maxHp;
		mp = maxMp;
		System.out.println("LEVEL UP!!");
	}
	
	void getItem(Item item){
		System.out.print("아이템 " +item.name + " 획득! ,");
		for(int i = 0; i < items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}
	  void getCoin(){
			coin2 = (int)(Math.random() * 25) + 5 ;
			coin = coin + coin2;
			System.out.println("coin " + coin2 + "개를 얻었습니다.");
			 System.out.println();
	  }
	  
	  void getcount(){
		  count ++;
		  System.out.println("■■■■■■■■■■■■■■야자 " + count + "일차■■■■■■■■■■■■■■■■■");
	  }
	  
	  void mpmp(Monster m){
			  damage2 = (int)(Math.random() * 70) +70 ;
			  damage2 = damage2 <= 0 ? 1 : damage2;
				m.hp = m.hp < damage2 ? m.hp - m.hp : m.hp - damage2;
				System.out.println("랜덤 공부를 통해  " + m.name + "를 "
						+ damage2 + "p만큼 학습하였습니다.");
				System.out.println(m.name + "의 남은 학습량 : " + m.hp + "p");
				mp -= 30;
		  }
	  }












