package designPatternObserver;

import java.util.ArrayList;
import java.util.List;

//Subject
public class NewsAgency {

	//Zustand
	private String news;
	
	//Observer-Liste
	private List<Channel> channels;
	
	public NewsAgency() {
		this.channels = new ArrayList<Channel>();
	}
	
	public void addObserver(Channel c) {
		this.channels.add(c);
	}
	
	public void removeObserver(Channel c) {
		this.channels.remove(c);
	}
	
	public void setNews(String news) {
		this.news = news;
		for(Channel c : channels) {
			c.update(news);
		}
	}

	public String getNews() {
		return news;
	}
}
