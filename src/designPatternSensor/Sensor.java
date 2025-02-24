package designPatternSensor;

	import java.util.ArrayList;
	import java.util.List;

	abstract class Sensor implements Display {
	    private List<Display> displays = new ArrayList<>();

	    public void register(Display d) {
	        displays.add(d);
	    }

	    public void unregister(Display d) {
	        displays.remove(d);
	    }

	    public void notifyDisplays() {
	        for (Display d : displays) {
	            d.update();
	        }
	    }
	}
