package stockMonitoring;

public class StockMarket {
	 public static void main(String[] args) {
	        // Create a stock
	        Stock appleStock = new Stock("Apple", 150.00);

	        // Create brokers
	        Broker brokerA = new BrokerA("Broker A");
	        Broker brokerB = new BrokerB("Broker B");
	        Broker brokerC = new BrokerC("Broker C");

	        // Register brokers as observers
	        appleStock.addObserver(brokerA);
	        appleStock.addObserver(brokerB);
	        appleStock.addObserver(brokerC);

	        // Change stock price
	        appleStock.setPrice(155.00);
	        appleStock.setPrice(160.00);

	        // Remove a broker and update price again
	        appleStock.removeObserver(brokerB);
	        appleStock.setPrice(165.00);
	    }
}
