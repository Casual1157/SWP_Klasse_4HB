package designPatternIterator;

public class NotificationIterator implements Iterator{

	private Notification[] notification;
	private int pos = 0;
	
	public NotificationIterator(Notification [] notification) {
		this.notification = notification;
	}
	
	public Object next() {
		Notification tmp = this.notification[pos];
		pos++;
		return tmp;
	}
	
	public boolean hasNext() {
		if(pos >= notification.length || notification[pos] == null) {
			return false;
		}
		return true;
	}
}