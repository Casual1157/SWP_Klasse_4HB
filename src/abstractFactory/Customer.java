package abstractFactory;

public class Customer {
	public static void main(final String[] args) {
		final FurnitureStore store1 = FurnitureStore.getStore(FurnitureType.ANTIQUE); 
		final Chairs chair1 = store1.createChairs();
		final Desks desk1 = store1.createDesks();
		final FurnitureStore store2 = FurnitureStore.getStore(FurnitureType.MODERN); 
		final Chairs chair2 = store2.createChairs();
		final Desks desk2 = store2.createDesks();
		
		chair1.create();
		chair2.create();
		desk1.create();
		desk2.create();
	}
}
