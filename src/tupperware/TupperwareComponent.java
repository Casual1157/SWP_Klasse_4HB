package tupperware;

public abstract class TupperwareComponent {
	public void add(TupperwareComponent component) {
        throw new UnsupportedOperationException("Add operation not supported.");
    }

    public void remove(TupperwareComponent component) {
        throw new UnsupportedOperationException("Remove operation not supported.");
    }

    public abstract void display();
}