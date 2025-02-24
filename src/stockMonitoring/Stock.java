package stockMonitoring;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private String name;
    private double price;
    private List<Broker> brokers; // List of observers

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.brokers = new ArrayList<>();
    }

    // Register a broker (observer)
    public void addObserver(Broker broker) {
        brokers.add(broker);
    }

    // Remove a broker (observer)
    public void removeObserver(Broker broker) {
        brokers.remove(broker);
    }

    // Notify all observers of a price change
    public void notifyObservers() {
        for (Broker broker : brokers) {
            broker.update(name, price);
        }
    }

    // Change the stock price and notify observers
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Stock price updated: " + name + " is now " + price);
        notifyObservers();
    }
}
