package abstractFactory;

public class AntiqueStore extends FurnitureStore{

	@Override
	public Desks createDesks() {
		// TODO Auto-generated method stub
		return new AntiqueDesks();
	}

	@Override
	public Chairs createChairs() {
		// TODO Auto-generated method stub
		return new AntiqueChairs();
	}

}
