package onlineAuction;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {
	private String itemName;
    private double currentBid;
    private List<Bidder> bidders; // List of observers

    public AuctionHouse(String itemName, double startingBid) {
        this.itemName = itemName;
        this.currentBid = startingBid;
        this.bidders = new ArrayList<>();
    }

    // Register a bidder (observer)
    public void addObserver(Bidder bidder) {
        bidders.add(bidder);
    }

    // Remove a bidder (observer)
    public void removeObserver(Bidder bidder) {
        bidders.remove(bidder);
    }

    // Notify all observers of a bid change
    public void notifyObservers() {
        for (Bidder bidder : bidders) {
            bidder.update(itemName, currentBid);
        }
    }

    // Place a new bid and notify observers
    public void placeBid(double bid) {
        if (bid > currentBid) {
            currentBid = bid;
            System.out.println("New bid placed: " + itemName + " is now at " + currentBid);
            notifyObservers();
        } else {
            System.out.println("Bid too low. Current bid for " + itemName + " is " + currentBid);
        }
    }
}
