package loudRPG;

import java.util.Scanner;

public class Battle {
	static Scanner scan = new Scanner(System.in);

	public Battle(Player player, Monster monster) {

		System.out.println("You encountered a " + monster.desc() + ".");

		do {
			scan.nextLine();
			System.out.print("Health: " + player.hp() + " Mana: " + player.mana());
			// Player Actions
			System.out.print("\nAttack (a), magic (m), or scan (s)?\n> ");
			String action = scan.nextLine();
			if (action.equals("a")) {
				// Regular Attack
				System.out.println("You Attacked! " + monster.name() + " took " + player.attack() + " damage.");
				monster.takeDmg(player.attack());
			} else if (action.equals("s")) {
				// Get Monster's status
				System.out.println(monster.getStatus());
			} else if (action.equals("m")) {
				// Magic
				System.out.print("Heal (a) or fireball (m)\n> ");
				action = scan.nextLine();
				if (action.equals("a") && player.mana() >= 5) {
					// Magic Heal
					player.heal();
					System.out.println("You healed for 5 health.");
				} else if (action.equals("m") && player.mana() >= 5) {
					// Magic Attack
					System.out.println("You Attacked! " + monster.name() + " took " + player.fireball() + " damage.");
					monster.takeDmg(player.fireball());
				} else if (player.mana() < 5) {
					System.out.println("Not enough mana.");
				}
			} else {
				System.out.println("Not a valid options.");
			}
			// Monster AI
			if (player.isAlive() && monster.isAlive()) {
				// Monster Actions
				scan.nextLine();
				if (monster.hp() > 4 && monster.mana() < 10) {
					// Regular Attack
					player.takeDmg(monster.attack());
					System.out.println(monster.name() + " attacks! You took " + monster.attack() + " damage.");
				} else if (monster.hp() < 6 && monster.mana() < 10) {
					// Rest
					monster.rest();
					System.out.println(monster.name() + " rested for " + (monster.rest() - monster.hp()) + " health.");
				} else if (monster.mana() > 10 && monster.hp() > 4) {
					// Magic Attack
					player.takeDmg(monster.fireball());
					System.out.println(monster.name() + " uses Fireball! You took " + monster.fireball() + " damage.");
				} else if (monster.mana() > 10 && monster.hp() < 6) {
					// Magic Heal
					monster.heal();
					System.out.println(monster.name() + " healed for 5 health.");
				}
			}
		} while (player.isAlive() && monster.isAlive());

		if (player.isAlive() && !monster.isAlive()) {
			System.out.println("You win. gained " + monster.xp() + " XP");
			player.loseXP(monster.xp());
			if (player.xp() <= 0) {
				player.levelUp();
				System.out.println("You leveled up! LVL: " + player.level() + ". ");

			} else {

			}

			scan.nextLine();
		} else if (!player.isAlive() && monster.isAlive()) {
			System.out.println("You lose.\nGAME OVER");
			System.exit(0);
		}
	}

}
