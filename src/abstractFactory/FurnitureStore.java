package abstractFactory;

public abstract class FurnitureStore {
	public static FurnitureStore getStore(FurnitureType type){
		if(type == FurnitureType.ANTIQUE) {
			return new AntiqueStore();
		} else {
			return new ModernStore();
		}
	}
	public abstract Desks createDesks();
	public abstract Chairs createChairs();
}
