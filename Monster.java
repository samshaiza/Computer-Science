package loudRPG;

import java.util.Random;

public class Monster {
	private int hp;
	private int mana;
	private int dmg;
	// private int spd;
	private int xp;
	private int lvl;
	private String name;
	static Random rand = new Random();
	// static String[] ad = { "Boop", "Stupid" };

	public String name() {
		return this.name;
	}

	public int attack() {
		return this.dmg;
	}

	public int mana() {
		return this.mana;
	}

	public void takeDmg(int dmg) {
		this.hp = this.hp - dmg;
	}

	public int rest() {
		return hp + 2;
	}

	public int lvlGen() {
		Player player = new Player();
		int flip = rand.nextInt(1);
		int lvlMod = rand.nextInt(5);
		if (flip == 0) {
			return this.lvl = player.level() - lvlMod;
		} else {
			return this.lvl = player.level() + lvlMod;
		}
	}

	public static Monster newMonster(int norm, Player player) {
		int i;
		i = rand.nextInt(4);
		if (norm == 0) {
			if (i == 0) {
				return new Monster("Goblin", player.level() + 11, player.level() + 4, player.level() + 5,
						player.level() + 4, player.level());
			} else if (i == 1) {
				return new Monster("Cyclops", player.level() + 13, player.level() + 5, player.level() + 5,
						player.level() + 4, player.level());
			} else if (i == 2) {
				return new Monster("Goblin Mage", player.level() + 11, player.level() + 4, player.level() + 15,
						player.level() + 6, player.level());
			} else {
				return new Monster("Cyclops Mage", player.level() + 13, player.level() + 5, player.level() + 15,
						player.level() + 6, player.level());
			}
		} else if (norm == 1) {
			if (i == 0) {
				return new Monster("Undead Goblin", player.level() + 7, player.level() + 5, player.level() + 5,
						player.level() + 4, player.level());
			} else if (i == 1) {
				return new Monster("Undead Cyclops", player.level() + 8, player.level() + 7, player.level() + 5,
						player.level() + 4, player.level());
			} else if (i == 2) {
				return new Monster("Undead Goblin Mage", player.level() + 7, player.level() + 4, player.level() + 15,
						player.level() + 6, player.level());
			} else {
				return new Monster("Undead Cyclops Mage", player.level() + 8, player.level() + 6, player.level() + 15,
						player.level() + 6, player.level());
			}
		} else {

			return null;
		}

	}

	public static Monster newBoss() {
		return new Monster("ASTUDON", 30, 16, 10, 8, 10);
	}

	public Monster(String name, int hp, int dmg, int mana, int xp, int lvl) {
		this.name = name;
		this.dmg = dmg;
		this.hp = hp;
		this.mana = mana;
		this.lvl = lvl;
		this.xp = xp;
	}

	public String desc() {
		return name + " LVL: " + lvl;
	}

	public int xp() {
		return this.xp;
	}

	public String getStatus() {
		return name + "'s HP: " + hp + " MANA: " + mana + " LVL: " + lvl;
	}

	public int hp() {
		return this.hp;
	}

	public int fireball() {
		this.mana -= 5;
		return dmg + 1;
	}

	public void heal() {
		this.mana -= 10;
		this.hp += 7;
	}

	public int healAmt() {
		return this.hp += 5;
	}

	public boolean isAlive() {
		return hp > 0;
	}

}
