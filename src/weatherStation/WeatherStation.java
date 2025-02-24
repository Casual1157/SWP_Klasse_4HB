package weatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
	private String weatherCondition;
    private List<WeatherApp> apps; // List of observers

    public WeatherStation(String initialCondition) {
        this.weatherCondition = initialCondition;
        this.apps = new ArrayList<>();
    }

    // Register a weather app (observer)
    public void addObserver(WeatherApp app) {
        apps.add(app);
    }

    // Remove a weather app (observer)
    public void removeObserver(WeatherApp app) {
        apps.remove(app);
    }

    // Notify all observers of a weather condition change
    public void notifyObservers() {
        for (WeatherApp app : apps) {
            app.update(weatherCondition);
        }
    }

    // Change the weather condition and notify observers
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
        System.out.println("Weather condition updated: " + weatherCondition);
        notifyObservers();
    }
}
