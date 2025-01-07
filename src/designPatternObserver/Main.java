package designPatternObserver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsAgency observable = new NewsAgency();
		Channel observer = new NewsChannel();
		
		observable.addObserver(observer);
		observable.setNews("Test");
		System.out.println(observable.getNews());
		
		NewsAgencyJava observableJava = new NewsAgencyJava();
		NewsChannelJava observerJava = new NewsChannelJava();
		observableJava.addObserver(observerJava);
		observableJava.setNews("Test");
	}

}
