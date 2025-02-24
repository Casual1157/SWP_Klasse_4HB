package weatherStation;

public class WeatherAppA implements WeatherApp {
    private String name;

    public WeatherAppA(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("[" + name + "] received update: Weather condition is now " + weatherCondition);
    }

}
