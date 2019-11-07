package loudRPG;

import java.util.*;

public class Astudon {
	static int room = 0;
	static Monster monster = new Monster(null, 0, 0, 0, 0, 0);
	static Dungeon dungeon = new Dungeon();
	static Room roomPhys = new Room("", monster, false);
	static String enter;
	static Scanner scan = new Scanner(System.in);

	public static Room[][] currDungeon;

	public static void main(String[] args) {
		Player player = new Player();

		System.out.print("???: Oh you're awake. What is your name traveler?\n> ");

		String in = scan.next();
		player.setName(in);
		System.out.print("???: " + player.name() + "... that's cute. ");
		if (room == 0) {
			System.out.print("Hey, do you remember who you are? y/n\n> ");
			in = scan.next();

			if (in.equals("y")) {
				System.out.print("Cool");
				room = 1;
			} else if (in.equals("n")) {
				System.out.print("Shame");
				room = 1;
			} else {
				System.out.print("?");
			}
			System.out.print("\nUh, fight this. \nPress Enter to continue.");
			scan.nextLine();
			scan.nextLine();
			Monster mon1 = Monster.newMonster(1, player);
			Battle battle1 = new Battle(player, mon1);

			System.out.print("???: Hey you won! Sorry for throwing you in like that. I had to test you. ");
			scan.nextLine();
			System.out.print("Leleh: I never told you my name did I? It's Leleh, I'm the local NECROMANCER in town.");
			scan.nextLine();
			System.out
					.print("Leleh: We found you unconcious on the outskirts of town. I brought you here to my place.");
			scan.nextLine();
			System.out.print("Leleh: Hey you're really strong though, maybe you can help me.");
			scan.nextLine();
			System.out.print("Leleh: You see, i'm not a very good NECROMANCER and I somehow clogged my toilet. ");
			scan.nextLine();
			System.out.print("Leleh: Mind helping me? Too bad. You're going to any ways.");
			scan.nextLine();
			clearConsole(60);

			player.reset();
			System.out.print("------------------Leleh's Bathroom------------------");
			scan.nextLine();
			System.out.print("\nLeleh: Nice bathroom I know.");
			scan.nextLine();
			System.out.print("*You come across an epic bathroom with epic proportions*");
			scan.nextLine();
			System.out.print("Leleh: I casted a spell to help with my constipation.");
			scan.nextLine();
			System.out.print("Leleh: Ended up making a epic dungeon for mighty heroes. ");
			scan.nextLine();
			System.out.print("Leleh: So I was thinking, 'Hey, this dudes heroic and I kinda need my toilet back'... ");
			scan.nextLine();
			while (room == 1) {
				System.out.print("Leleh: Could you help me? \n1 Yea\n2 Nah\n3 Hey yo i'm hungry, got any big mac\n> ");

				in = scan.next();

				if (in.equals("1")) {
					System.out.print("Cool");
					scan.nextLine();
					scan.nextLine();
					break;
				} else if (in.equals("2")) {
					System.out.print("Leleh: That's too bad... cause you have to anyways... to progress.");
					scan.nextLine();
					scan.nextLine();
					break;
				} else if (in.equals("3")) {
					System.out.print("yes.");
					scan.nextLine();
					scan.nextLine();
					break;
				} else {
					System.out.print("I'm sorry?");
					scan.nextLine();
					scan.nextLine();
				}
			}
			System.out.print("*Leleh takes your hand and the both of you jump into...*");
			scan.nextLine();
			room = 2;
		}

		if (room == 2) {
			System.out.print("\n   _____            __            .___             \r\n"
					+ "  /  _  \\   _______/  |_ __ __  __| _/____   ____  \r\n"
					+ " /  /_\\  \\ /  ___/\\   __\\  |  \\/ __ |/  _ \\ /    \\ \r\n"
					+ "/    |    \\\\___ \\  |  | |  |  / /_/ (  <_> )   |  \\\r\n"
					+ "\\____|__  /____  > |__| |____/\\____ |\\____/|___|  /\r\n"
					+ "        \\/     \\/                  \\/           \\/ ");
			scan.nextLine();
			clearConsole(30);
			System.out.print("\n...");
			scan.nextLine();
			System.out.print("...");
			scan.nextLine();
			System.out.print("Leleh: Hm... ");
			scan.nextLine();
			System.out.print("Leleh: It's dark isan't it? I wonder...");
			scan.nextLine();
			System.out.print("-WHOOP-");
			scan.nextLine();

			while (room == 2) {
				System.out.print("Leleh: WHO THE HELL JUST WHOOPED. That wasn't you was it?");
				System.out.print("\n1 Yea sorry\n2 No...\n3 Hey yo i'm hungry, got any big mac\n> ");

				in = scan.next();
				if (in.equals("1") || in.equals("2")) {
					System.out.print("I don't even know what a whoop is.");
					scan.nextLine();
					scan.nextLine();
					break;
				} else if (in.equals("3")) {
					System.out.print("Save it for after " + player.name());
					scan.nextLine();
					scan.nextLine();
					break;
				} else {
					System.out.print("Excuse me?");
					scan.nextLine();
					scan.nextLine();
				}
			}
			System.out.print("*You hear footsteps fastening. Something's approaching!*");
			scan.nextLine();
			Monster mon1 = Monster.newMonster(0, player);
			Battle battle1 = new Battle(player, mon1);
			System.out.print("Leleh: What was that? Whatever.");
			scan.nextLine();
			System.out.print("Leleh: You know what's gonna help us? Light");
			scan.nextLine();
			System.out.print("*Leleh's hand glow with an awesome power and that's about it*");
			scan.nextLine();
			System.out.print("Leleh: Am I not just the best?");
			scan.nextLine();
			System.out.print("- Press enter to continue to the next room -\n");
			scan.nextLine();
			room = 3;
		}

		if (room == 3) {
			// 1
			Room room1 = Room.newRoom(0, player);
			if (room1.isNotComplete()) {
				room1.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 2
			scan.nextLine();
			Room room2 = Room.newRoom(0, player);
			if (room2.isNotComplete()) {
				room2.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 3
			scan.nextLine();
			Room room3 = Room.newRoom(0, player);
			if (room3.isNotComplete()) {
				room3.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 4
			scan.nextLine();
			Room resRoom = Room.newResRoom();
			System.out.println(resRoom.toString());
			player.reset();
			System.out.print("- Press enter to continue to the next room -\n");
			// 5
			scan.nextLine();
			Room room5 = Room.newRoom(0, player);
			if (room5.isNotComplete()) {
				room5.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 6
			scan.nextLine();
			Room room6 = Room.newRoom(0, player);
			if (room6.isNotComplete()) {
				room6.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 7
			scan.nextLine();
			Room room7 = Room.newRoom(0, player);
			if (room7.isNotComplete()) {
				room7.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 8
			scan.nextLine();
			System.out.println(resRoom.toString());
			player.reset();
			System.out.print("- Press enter to continue to the next room -\n");
			// 9
			scan.nextLine();
			Room room9 = Room.newRoom(0, player);
			if (room9.isNotComplete()) {
				room9.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 10
			scan.nextLine();
			Room room10 = Room.newRoom(0, player);
			if (room10.isNotComplete()) {
				room10.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 11
			Room room11 = Room.newRoom(0, player);
			if (room11.isNotComplete()) {
				room11.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 12
			scan.nextLine();
			Room room12 = Room.newRoom(0, player);
			if (room12.isNotComplete()) {
				room12.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 13
			scan.nextLine();
			Room room13 = Room.newRoom(0, player);
			if (room13.isNotComplete()) {
				room13.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			// 14
			scan.nextLine();
			System.out.println(resRoom.toString());
			player.reset();
			System.out.print("- Press enter to continue to the next room -\n");
			// 15
			scan.nextLine();
			Room room15 = Room.newRoom(0, player);
			if (room15.isNotComplete()) {
				room15.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			
			// BOSS
			scan.nextLine();
			Room boss = Room.newRoom(0, player);
			if (boss.isNotComplete()) {
				boss.enter(player);
			}
			System.out.print("- Press enter to continue to the next room -\n");
			

		}

	}

	public final static void clearConsole(int amt) {
		for (int i = 0; i < amt; ++i)
			System.out.println();
	}
}
