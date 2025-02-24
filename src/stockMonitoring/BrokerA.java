package stockMonitoring;

public class BrokerA implements Broker{
	private String name;

    public BrokerA(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("[" + name + "] received update: Stock " + stockName + " is now " + newPrice);
    }
}
