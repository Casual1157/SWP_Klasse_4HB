package abstractFactoryGame;

public class FantasyGame extends VideoGame{

	@Override
	public Wizard createWizard() {
		// TODO Auto-generated method stub
		return new FantasyWizard();
	}

	@Override
	public Warrior createWarrior() {
		// TODO Auto-generated method stub
		return new FantasyWarrior();
	}

}
