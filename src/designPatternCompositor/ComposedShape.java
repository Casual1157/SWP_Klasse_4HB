package designPatternCompositor;

import java.util.ArrayList;
import java.util.List;

public class ComposedShape extends Shape{
	private List<Shape> children = new ArrayList<>();

    @Override
    public void display() {
        for (Shape g : children) {
        	g.display();
        }
    }

    @Override
    public void add(Shape s) {
        children.add(s);
    }
}
