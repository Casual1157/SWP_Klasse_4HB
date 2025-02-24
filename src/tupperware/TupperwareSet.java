package tupperware;

import java.util.ArrayList;
import java.util.List;

public class TupperwareSet extends TupperwareComponent {
	    private String name;
	    private List<TupperwareComponent> components = new ArrayList<>();

	    public TupperwareSet(String name) {
	        this.name = name;
	    }

	    @Override
	    public void add(TupperwareComponent component) {
	        components.add(component);
	    }

	    @Override
	    public void remove(TupperwareComponent component) {
	        components.remove(component);
	    }

	    @Override
	    public void display() {
	        System.out.println("Tupperware Set: " + name);
	        for (TupperwareComponent component : components) {
	            component.display();
	        }
	    }
}