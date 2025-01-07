package designPatternObserver;

public class NewsChannel implements Channel {
	
	// momentanen Zustand des beobachteten Bereichs
	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	//Methode für die Zustandsänderung
	@Override
	public void update(String news) {
		this.news = news;
		
	}
	
}
