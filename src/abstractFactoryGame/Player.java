package abstractFactoryGame;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter name: ");
		String userName = scan.nextLine();
		
		System.out.println("Please enter game type 'scifi' or 'fantasy': ");
		String gameType = scan.nextLine();
		
		if(gameType.equalsIgnoreCase("scifi")) {
			final VideoGame game = VideoGame.getGame(GameType.SCIFI);
			Scanner player = new Scanner(System.in);
			System.out.println("SCIENCE FICTION CHOSEN! Please choose class 'Warrior' or 'Wizard': ");
			String chosenPlayer = player.nextLine();
			if(chosenPlayer.equalsIgnoreCase("Warrior")) {
				final Warrior warrior = game.createWarrior();
				warrior.create();
				System.out.println("WELCOME WARRIOR " + userName.toUpperCase());
			} else if(chosenPlayer.equalsIgnoreCase("Wizard")) {
				final Wizard wizard = game.createWizard();
				wizard.create();
				System.out.println("WELCOME WIZARD " + userName.toUpperCase());
			} else {
				System.err.println("WRONG INPUT");
			}	
		} else if(gameType.equalsIgnoreCase("fantasy")) {
			final VideoGame game = VideoGame.getGame(GameType.FANTASY);
			Scanner player = new Scanner(System.in);
			System.out.println("FANTASY CHOSEN! Please choose class 'Warrior' or 'Wizard': ");
			String chosenPlayer = player.nextLine();
			if(chosenPlayer.equalsIgnoreCase("Warrior")) {
				final Warrior warrior = game.createWarrior();
				warrior.create();
				System.out.println("WELCOME WARRIOR " + userName.toUpperCase());
			} else if(chosenPlayer.equalsIgnoreCase("Wizard")) {
				final Wizard wizard = game.createWizard();
				wizard.create();
				System.out.println("WELCOME WIZARD " + userName.toUpperCase());
			} else {
				System.err.println("WRONG INPUT");
			}
		} else {
			System.err.println("WRONG INPUT");
		}
	
	}

}
