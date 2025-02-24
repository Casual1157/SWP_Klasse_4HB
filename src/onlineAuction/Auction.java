package onlineAuction;

public class Auction {
	public static void main(String[] args) {
        // Create an auction house
        AuctionHouse auction = new AuctionHouse("Antique Vase", 100.00);

        // Create bidders
        Bidder bidderA = new BidderA("Bidder A");
        Bidder bidderB = new BidderB("Bidder B");
        Bidder bidderC = new BidderC("Bidder C");

        // Register bidders as observers
        auction.addObserver(bidderA);
        auction.addObserver(bidderB);
        auction.addObserver(bidderC);

        // Place bids
        auction.placeBid(120.00);
        auction.placeBid(150.00);

        // Remove a bidder and place another bid
        auction.removeObserver(bidderB);
        auction.placeBid(200.00);
    }
}
