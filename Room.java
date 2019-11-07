package loudRPG;

import java.util.Random;

public class Room {
	static Random rand = new Random();
	private final String desc;
	private final Monster monster;
	private final Boolean isBossRoom;

	public Room(String desc, Monster monster, Boolean isBossRoom) {
		this.desc = desc;
		this.monster = monster;
		this.isBossRoom = isBossRoom;
	}

	public static Room newRoom(int type, Player player) {
		int i = rand.nextInt(7);

		String roomDescription = null;
		if (i == 0) {
			roomDescription = "Thick cobwebs fill the corners of the room, and wisps of webbing hang from the ceiling.";
		} else if (i == 1) {
			roomDescription = "You find this chamber lit dimly by guttering candles that squat in small hills of melted wax.";
		} else if (i == 2) {
			roomDescription = "Many small desks with high-backed chairs stand in three long rows in this room.";
		} else if (i == 3) {
			roomDescription = "Stone sarcophagi stand in five rows of three, each carved with the visage of a warrior lying in state.";
		} else if (i == 4) {
			roomDescription = "A horrendous, overwhelming stench wafts from the room before you. Small cages line the walls.";
		} else if (i == 5) {
			roomDescription = "Tapestries decorate the walls of this room. Although they may once have been brilliant in hue.";
		} else if (i == 6) {
			roomDescription = "Huge rusted metal blades jut out of cracks in the walls, and rusting spikes project down from the ceiling.";
		}

		return new Room(roomDescription, Monster.newMonster(0, player), false);
	}

	public static Room newBossRoom() {
		return new Room(
				"A sprawling, quiet blue-gray stone castle deep in a forest, approached by a tree-lined avenue. A rich smell of sulfur ",
				Monster.newBoss(), true);
	}

	public static Room newResRoom() {
		return new Room(
				"You peer into the room and spot the white orb of a skull lying on the floor as well as a fountain.\nYou reached into the fountain and was regenerated with life. \n",
				null, false);
	}

	public boolean isBossRoom() {
		return isBossRoom;
	}

	public boolean isNotComplete() {
		return monster.isAlive();
	}

	public String toString() {
		return desc;
	}

	public void enter(Player player) {
		System.out.println(desc);
		if (monster.isAlive()) {
			new Battle(player, monster);
		}
	}

	public Monster getMonster() {
		return monster;
	}
}