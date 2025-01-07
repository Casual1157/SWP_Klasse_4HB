package designPatternObserver;

import java.util.Observable;
import java.util.Observer;

public class NewsChannelJava implements Observer {
	
	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
