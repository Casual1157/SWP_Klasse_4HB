package abstractFactoryGame;

public class ScifiGame extends VideoGame{

	@Override
	public Wizard createWizard() {
		// TODO Auto-generated method stub
		return new ScifiWizard();
	}

	@Override
	public Warrior createWarrior() {
		// TODO Auto-generated method stub
		return new ScifiWarrior();
	}

}
