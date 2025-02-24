package abstractFactory;

public class ModernStore extends FurnitureStore{

	@Override
	public Desks createDesks() {
		// TODO Auto-generated method stub
		return new ModernDesks();
	}

	@Override
	public Chairs createChairs() {
		// TODO Auto-generated method stub
		return new ModernChairs();
	}

}
