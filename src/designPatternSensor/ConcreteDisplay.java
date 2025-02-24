package designPatternSensor;

public class ConcreteDisplay implements Display {
	// Concrete Display class
	    private int displayState; // Display's state

	    // Update method to reflect the state change
	    @Override
	    public void update() {
	        System.out.println("Display updated with new state.");
	        // Logic to update the displayState could be implemented here
	    }

	    // Getter for displayState
	    public int getDisplayState() {
	        return displayState;
	    }

	    // Setter for displayState
	    public void setDisplayState(int displayState) {
	        this.displayState = displayState;
	    }
	}
