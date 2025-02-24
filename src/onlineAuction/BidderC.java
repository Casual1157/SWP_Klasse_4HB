package onlineAuction;

public class BidderC implements Bidder {
    private String name;

    public BidderC(String name) {
        this.name = name;
    }

    @Override
    public void update(String itemName, double newBid) {
        System.out.println("[" + name + "] received update: " + itemName + " current bid is now " + newBid);
    }

}
