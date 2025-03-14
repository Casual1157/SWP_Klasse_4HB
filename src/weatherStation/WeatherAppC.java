package weatherStation;

public class WeatherAppC implements WeatherApp {
    private String name;

    public WeatherAppC(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("[" + name + "] received update: Weather condition is now " + weatherCondition);
    }

}
