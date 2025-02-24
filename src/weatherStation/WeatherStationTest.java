package weatherStation;

public class WeatherStationTest {
	public static void main(String[] args) {
        // Create a weather station
        WeatherStation station = new WeatherStation("Sunny");

        // Create weather apps
        WeatherApp appA = new WeatherAppA("WeatherApp A");
        WeatherApp appB = new WeatherAppB("WeatherApp B");
        WeatherApp appC = new WeatherAppC("WeatherApp C");

        // Register weather apps as observers
        station.addObserver(appA);
        station.addObserver(appB);
        station.addObserver(appC);

        // Change weather condition
        station.setWeatherCondition("Rainy");
        station.setWeatherCondition("Cloudy");

        // Remove a weather app and update condition again
        station.removeObserver(appB);
        station.setWeatherCondition("Stormy");
    }
}
