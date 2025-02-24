package abstractFactoryGame;



public abstract class VideoGame {
	public static VideoGame getGame(GameType type){
		if(type == GameType.SCIFI) {
			return new ScifiGame();
		} else {
			return new FantasyGame();
		}
	}
	public abstract Wizard createWizard();
	public abstract Warrior createWarrior();
}
