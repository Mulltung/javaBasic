package F_game;

public class Monster {

	String name; // 이름
	int maxHp; // 최대 체력
	int maxMp; // 최대 마나
	int hp; // 체력
	int mp; // 마나
	int att; // 공격력
	int def; // 방어력
	Item[] items; // 아이템
	int coin;
	int count;

	Monster(String name, int hp, int mp, int att, int def, Item[] items) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.items = items;
	}

	void attack(Character c) {
		count++;
		if (count % 3 == 0) {
			System.out.println("★★★★" + name
					+ "과제가 생겨 추가로 체력이 감소합니다.★★★★");
			int damage = att - c.def;
			damage = damage <= 0 ? 1 : damage;
			c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage - 30;
			System.out.println(damage + "+30 만큼 집에 가고싶습니다.");

			if (c.hp <= 0) {
				System.out.println(c.name + "의 남은 체력 : " + c.hp);
				System.out.println();
				System.out.println("~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~");
				System.exit(0);
			} else {
				System.out.println(c.name + "의 남은 체력 : " + c.hp);
				System.out.println();
			}
		}

		else {
			int damage = att - c.def;
			damage = damage <= 0 ? 1 : damage;
			c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
			System.out.println(name + "가 너무 어렵습니다. " + damage + "만큼 집에 가고싶습니다.");
			if (c.hp <= 0) {
				System.out.println(c.name + "의 남은 체력 : " + c.hp);
				System.out.println();
				System.out.println("~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~");
				System.exit(0);
			} else {
				System.out.println(c.name + "의 남은 체력 : " + c.hp);
				System.out.println();
			}
		}

	}

	Item itemDrop() {
		return items[(int) (Math.random() * items.length)];
	}

}







