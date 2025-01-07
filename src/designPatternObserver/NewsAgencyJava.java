package designPatternObserver;

import java.util.Observable;

public class NewsAgencyJava extends Observable{
	private String news;

	public void setNews(String news) {
		this.news = news;
		setChanged();
		notifyObservers(news);
	}
	
	
}
