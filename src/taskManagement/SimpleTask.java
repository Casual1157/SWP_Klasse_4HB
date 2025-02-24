package taskManagement;

public class SimpleTask extends Task {
    
	public SimpleTask(String title) {
        super(title);
    }

    @Override
    public void display() {
        System.out.println("\t \t" + getTitle());
    }

}
