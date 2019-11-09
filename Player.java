package loudRPG;

public class Player {
	private int hp = 20;
	private int maxHP = 20;
	private int mana = 20;
	private int maxMana = 20;
	private int xp = 10;
	private int dmg = 5;
	private int mdmg = 10;
	// private int spd;
	private int lvl = 1;
	private int currX;
	private int currY;
	private Room currRoom;
	private String name;

	public String name() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int level() {
		return this.lvl;
	}

	public int attack() {
		return this.dmg;
	}

	public void takeDmg(int dmg) {
		this.hp = this.hp - dmg;
	}

	public int mattack() {
		return this.mdmg;
	}

	public int rest() {
		return hp + 5;
	}

	public int hp() {
		return hp;
	}

	public int mana() {
		return mana;
	}

	public void loseXP(int xp) {
		this.xp = this.xp - xp;
	}

	public int xp() {
		return this.xp;
	}

	public void levelUp() {
		this.lvl = this.lvl + 1;
		this.maxHP = this.maxHP + 2;
		this.maxMana = this.maxMana + 2;
		this.dmg = this.dmg + 1;
		this.xp = this.lvl + 12;
	}

	public void reset() {
		this.hp = maxHP;
		this.mana = maxMana;
	}

	public boolean isAlive() {
		return hp > 0;
	}

	public void heal() {
		this.mana -= 5;
		this.hp += (this.lvl * 2) + 10;
	}
	
	public int healAMT() {
		return (this.lvl * 2) + 9;
	}

	public int healAmt() {
		return this.hp += 5;
	}

	public int fireball() {
		this.mana -= 5;
		return dmg + 5;
	}

	public Room getCurrRoom() {
		return currRoom;
	}

	public void setCurrRoom(Room room) {
		currRoom = room;
	}

	public void setCurrX(int currX) {
		this.currX = currX;
	}

	public void setCurrY(int currY) {
		this.currY = currY;
	}

	public int getCurrX() {
		return currX;
	}

	public int getCurrY() {
		return currY;
	}
}
