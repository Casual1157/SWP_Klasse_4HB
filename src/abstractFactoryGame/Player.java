package abstractFactoryGame;

public class Player {

	public static void main(String[] args) {
		final VideoGame game1 = VideoGame.getGame(GameType.SCIFI);
		final VideoGame game2 = VideoGame.getGame(GameType.FANTASY);
		final Warrior warrior1 = game1.createWarrior();
		final Warrior warrior2 = game2.createWarrior();
		final Wizard wizard1 = game1.createWizard();
		final Wizard wizard2 = game2.createWizard();
		
		warrior1.create();
		warrior2.create();
		wizard1.create();
		wizard2.create();
	}

}
