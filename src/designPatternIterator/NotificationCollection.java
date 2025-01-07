package designPatternIterator;

public class NotificationCollection implements Collection{

	private int maxItems;
	private int numberOfItems;
	private Notification[] notificationList;
	
	public NotificationCollection(int maxItems) {
		this.maxItems = maxItems;
		this.numberOfItems = 0;
		this.notificationList = new Notification[maxItems];
	}
	
	public void addItem(String str) {
		Notification notification = new Notification(str);
		if(numberOfItems >= this.notificationList.length) {
			System.err.println("List is full!");
		}else {
			this.notificationList[numberOfItems] = notification;
			numberOfItems++;
		}
	}
	
	public Iterator createIterator() {
		return new NotificationIterator(notificationList);
	}
}