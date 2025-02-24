package weatherStation;

public class WeatherAppB implements WeatherApp {
    private String name;

    public WeatherAppB(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("[" + name + "] received update: Weather condition is now " + weatherCondition);
    }

}
