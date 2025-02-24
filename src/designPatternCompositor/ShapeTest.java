package designPatternCompositor;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        ComposedShape composedShape = new ComposedShape();
        composedShape.add(circle);
        composedShape.add(rectangle);

        ComposedShape nestedComposedShape = new ComposedShape();
        nestedComposedShape.add(triangle);
        nestedComposedShape.add(rectangle);
        composedShape.add(nestedComposedShape);

        Screen screen = new Screen(composedShape);
        screen.display();
	}

}
