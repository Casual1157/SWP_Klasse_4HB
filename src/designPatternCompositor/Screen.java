package designPatternCompositor;

public class Screen {
	private Shape composedShape;

    public Screen(Shape s) {
        this.composedShape = s;
    }

    public void display() {
        if (composedShape != null) {
        	composedShape.display();
        	System.out.println("[" + composedShape.toString() + "]"); 
        }
    }

	public Shape getComposedShape() {
		return composedShape;
	}

	public void setComposedShape(Shape composedShape) {
		this.composedShape = composedShape;
	}
}
