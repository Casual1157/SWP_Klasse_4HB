package designPatternSensor;

	// Concrete Sensor class
	class ConcreteSensor extends Sensor {
	    private int sensorState; // Sensor's state

	    // Getter for sensorState
	    public int getState() {
	        return sensorState;
	    }

	    // Setter for sensorState, which also triggers notification
	    public void setState(int state) {
	        this.sensorState = state;
	        notifyDisplays();
	    }

		@Override
		public void update() {
			// TODO Auto-generated method stub
			
		}
	}
